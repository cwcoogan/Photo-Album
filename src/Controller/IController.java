package Controller;

import java.awt.event.ActionEvent;


public interface IController {
  void handlePreviousSnap(ActionEvent e);
  void handleExitButtonClick(ActionEvent e);
  void display();
}
