package Controller;

import java.awt.event.MouseEvent;
import java.io.IOException;

import Model.IPhoto;
import View.IView;
import exceptions.IllegalShapeTypeException;


/**
 * The interface Controller.
 */
public interface IController {
  /**
   * Handle previous snap.
   *
   * @param e the e
   */
  void handlePreviousSnap(MouseEvent e);

  /**
   * Handle exit button click.
   *
   * @param e the e
   */
  void handleExitButtonClick(MouseEvent e);

  /**
   * Display.
   */
  void display();

  /**
   * Next.
   *
   * @param e the e
   */
  void next(MouseEvent e);

  /**
   * Display combo box.
   *
   * @param e the e
   */
  void displayComboBox(MouseEvent e);

  /**
   * Change snapshot.
   *
   * @param id the id
   */
  void changeSnapshot(String id);

  /**
   * Take snap.
   */
  void takeSnap();

  /**
   * Gets model.
   *
   * @return the model
   */
  IPhoto getModel();

  /**
   * Gets view.
   *
   * @return the view
   */
  IView getView();

  /**
   * Run.
   *
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws IOException               the io exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  void run() throws IllegalShapeTypeException, IOException, NoSuchFieldException, IllegalAccessException;
}
