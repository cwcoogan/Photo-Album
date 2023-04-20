package Controller;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.swing.*;

import View.IParseData;
import View.ReadFromFile;

import Model.Snapshot;
import View.IView;
import Model.IPhoto;
import Model.Photo;
import View.View;
import View.HTMLView;
import exceptions.IllegalShapeTypeException;


/**
 * The type Controller.
 */
public class Controller implements IController {
  /**
   * The View.
   */
  IView view;
  /**
   * The Model.
   */
  IPhoto model;
  /**
   * The Html view.
   */
  HTMLView HTMLView;
  private String inputFile;
  private String outputFile;
  private String viewType;
  private int xmax;
  private int ymax;


  /**
   * Instantiates a new Controller.
   *
   * @param inputFile  the input file
   * @param outputFile the output file
   * @param viewType   the view type
   * @param xmax       the xmax
   * @param ymax       the ymax
   */
  public Controller(String inputFile, String outputFile, String viewType, int xmax, int ymax) {
    if (viewType.equalsIgnoreCase("graphical")) {
      this.view = new View(this, xmax, ymax);
    }
    if (viewType.equalsIgnoreCase("web")) {
      this.HTMLView = new HTMLView(outputFile, xmax, ymax);
    }
    this.model = new Photo();
    this.inputFile = inputFile;
    this.outputFile = outputFile;
  }

  public void handlePreviousSnap(MouseEvent e) {

    Snapshot prevSnapshot = this.model.getPreviousSnapshot();
    if (prevSnapshot == null) {
      this.view.outOfSnapshots();
    }
    this.view.paintSnapshot(prevSnapshot.getShapes());
    this.view.changeDescription(prevSnapshot.getDescription());
    this.view.changeID(prevSnapshot.getSnapshotID());
  }

  public void handleExitButtonClick(MouseEvent e) {
    view.dispose();
  }

  public void display() {
    this.view.display();
  }

  public void displayComboBox(MouseEvent e) {
    this.view.displayComboBox(this.model.getSnapshots(), (JLabel) e.getSource());
  }

  @Override
  public void changeSnapshot(String id) {
    Snapshot returnedSnapshot = this.model.getSnapshotFromTimestamp(id);
    if (returnedSnapshot == null) {
      this.view.outOfSnapshots();
    }
    this.view.paintSnapshot(returnedSnapshot.getShapes());
    this.view.changeDescription(returnedSnapshot.getDescription());
    this.view.changeID(returnedSnapshot.getSnapshotID());
  }

  public void next(MouseEvent e) {

    Snapshot nextSnapshot = this.model.getNextSnapshot();
    if (nextSnapshot == null) {
      this.view.outOfSnapshots();
    }
    this.view.paintSnapshot(nextSnapshot.getShapes());
    this.view.changeDescription(nextSnapshot.getDescription());
    this.view.changeID(nextSnapshot.getSnapshotID());

  }

  public void takeSnap() {
    Map<Snapshot, String> snaps = this.model.getSnapshots();
  }

  public void run() throws IllegalShapeTypeException, IOException, NoSuchFieldException, IllegalAccessException {
    ReadFromFile reader = new ReadFromFile(inputFile, this.getModel());
    List<IParseData> parsedData = reader.readFile();

    for (IParseData data : parsedData) {
      data.execute();
    }

    // use to run both web and gui
    if (HTMLView != null) {
      this.HTMLView.convertToSVG(this.model.getSnapKeys());
    }
    if (view != null) {
      this.view.display();
      Snapshot firstSnapshot = this.model.getFirstSnapshot();
      this.view.paintSnapshot(firstSnapshot.getShapes());
      this.view.changeDescription(firstSnapshot.getDescription());
      this.view.changeID(firstSnapshot.getSnapshotID());
    }
  }

  public IView getView() {
    return view;
  }

  public IPhoto getModel() {
    return model;
  }
}


