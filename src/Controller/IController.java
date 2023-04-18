package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import Model.IPhoto;
import View.IView;


public interface IController {
  void handlePreviousSnap(MouseEvent e);
  void handleExitButtonClick(MouseEvent e);
  void display();
  void next(MouseEvent e);
  void changeSnapshot(MouseEvent e);
  void displayComboBox(MouseEvent e);
  void takeSnap();
  IPhoto getModel();
  IView getView();
}
