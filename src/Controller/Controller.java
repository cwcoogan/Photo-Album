package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Map;

import javax.swing.*;

import Model.Snapshot;
import View.IView;
import Model.IPhoto;
import Model.Photo;
import View.View;

public class Controller implements IController {
  IView view;
  IPhoto model;



  public Controller() {
    this.view = new View(this,800, 800);
    this.model = new Photo();

  }
  public void handlePreviousSnap(MouseEvent e) {
    this.view.changeSnapshot("angryhermaine.jpeg");
  }

  public void handleExitButtonClick(MouseEvent e) {
    view.dispose();
  }

  public void display() {
    this.view.display();
  }

  public void changeSnapshot(MouseEvent e) {
    this.view.changeSnapshot("snapshot.png");
  }


  public void displayComboBox(MouseEvent e) {
    this.view.displayComboBox(this.model.getSnapshots(), (JButton) e.getSource());
  }

  public void next(MouseEvent e) {
    this.view.changeSnapshot("ghost.jpg");
  }

  public void takeSnap() {
    Map<Snapshot, String> snaps = this.model.getSnapshots();
    snaps.put(new Snapshot("First Snapshot for Money Bags", this.model), "This is a test value");
  }
}
