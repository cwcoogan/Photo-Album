package View;

import java.util.Map;
import java.util.List;

import javax.swing.*;

import Model.Snapshot;
import shapes.IShape;

/**
 * The interface View.
 */
public interface IView {
  /**
   * Display.
   */
  void display();

  /**
   * Dispose.
   */
  void dispose();

  /**
   * Display combo box.
   *
   * @param s      the s
   * @param button the button
   */
  void displayComboBox(Map<Snapshot, String> s, JLabel button);

  /**
   * Paint snapshot.
   *
   * @param shapes the shapes
   */
  void paintSnapshot(List<IShape> shapes);

  /**
   * Repaint.
   */
  void repaint();

  /**
   * Change description.
   *
   * @param description the description
   */
  void changeDescription(String description);

  /**
   * Change id.
   *
   * @param id the id
   */
  void changeID(String id);

  /**
   * Out of snapshots.
   */
  void outOfSnapshots();
}
