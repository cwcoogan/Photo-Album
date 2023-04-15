package View;

import java.awt.event.ActionEvent;

import javax.swing.*;

public interface IView {
  void display();
  void dispose();
  void changeSnapshot(String filename);
  void displayComboBox();

}
