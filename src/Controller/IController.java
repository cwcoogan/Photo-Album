package Controller;

import java.awt.event.ActionEvent;


public interface IController {
  void handlePreviousSnap(ActionEvent e);
  void handleExitButtonClick(ActionEvent e);
  void display();
  void next(ActionEvent e);
  void displayComboBox(ActionEvent e);
  void changeSnapshot(ActionEvent e);
}
