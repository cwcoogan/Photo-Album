package Controller;

import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

import Model.IPhoto;
import View.IView;
import exceptions.IllegalShapeTypeException;


public interface IController {
  void handlePreviousSnap(MouseEvent e);
  void handleExitButtonClick(MouseEvent e);
  void display();
  void next(MouseEvent e);
  void displayComboBox(MouseEvent e);
  void changeSnapshot(String id);
  void takeSnap();
  IPhoto getModel();
  IView getView();
  void run() throws IllegalShapeTypeException, IOException, NoSuchFieldException, IllegalAccessException ;
}
