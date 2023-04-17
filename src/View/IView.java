package View;

import java.awt.event.ActionEvent;
import java.util.Map;

import javax.swing.*;

import Model.IPhoto;
import Model.Snapshot;

public interface IView {
  void display();
  void dispose();
  void changeSnapshot(String filename);
  void displayComboBox(Map<Snapshot, String> s, JLabel button);

}
