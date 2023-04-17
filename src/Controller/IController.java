package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;


public interface IController {
  void handlePreviousSnap(MouseEvent e);
  void handleExitButtonClick(MouseEvent e);
  void display();
  void next(MouseEvent e);
  void changeSnapshot(MouseEvent e);
  void displayComboBox(MouseEvent e);
  void takeSnap();
}
