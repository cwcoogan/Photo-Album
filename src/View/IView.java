package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Map;
import java.util.List;

import javax.swing.*;

import Model.IPhoto;
import Model.Snapshot;
import shapes.IShape;

public interface IView {
  void display();
  void dispose();
  void displayComboBox(Map<Snapshot, String> s, JLabel button);
  void paintSnapshot(List<IShape> shapes);
  void repaint();
  void changeDescription(String description);
  void changeID(String id);
}
