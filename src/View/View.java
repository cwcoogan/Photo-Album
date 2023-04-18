package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.*;

import Controller.IController;
import Model.IPhoto;
import Model.Snapshot;
import shapes.IShape;

public class View extends JFrame implements IView{
  private int height;
  private int width;
  private IController controller;
  private JPanel contentPane;
  private JPanel imgPanel;
  private JLabel img;
  private JPopupMenu snapshotComboBox;
  private JPanel buttonPanel;

  public View(IController controller, int height, int width) throws IllegalArgumentException {
    if (height < 0 || width < 0) {
      throw new IllegalArgumentException();
    }
    this.height = height;
    this.width = width;
    this.controller = controller;

    this.setSize(this.width, this.height);
  }

  public JLabel addNewButtons(String path) {
    JLabel button = new JLabel(new ImageIcon(path));
    buttonPanel.add(button);
    return button;
  }

  public void setUpWindow() {
    this.setTitle("CS5004 Photo Album");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    contentPane = new JPanel();
    contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

    imgPanel = new JPanel();
    img = new JLabel("");
    imgPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
    imgPanel.add(img);

    // --- BUTTON CONFIGS ---- //
    buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));

    // Previous Button -> Displays the previous Snap when clicked
    JLabel prevButton = addNewButtons("src/images/leftArrow.png");
    prevButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        controller.handlePreviousSnap(e);
      }
    });

    // SnapshotButton --> displays the ComboBox when clicked
    JLabel snapshotButton = addNewButtons("src/images/menuButton.png");
    snapshotButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        controller.displayComboBox(e);
      }
    });

    // Next Button --> goes to the next snap when clicked //
    JLabel nextButton = addNewButtons("src/images/rightArrow.png");
    nextButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        controller.next(e);
      }
    });

    // Exit Button --> exits the program when clicked
    JLabel exitButton = addNewButtons("src/images/exitButton.png");
    exitButton.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        controller.handleExitButtonClick(e);
      }
    });

    // initial snapshot... - change to file default
    changeSnapshot("angryhermaine.jpeg");

    contentPane.add(imgPanel);
    contentPane.add(buttonPanel);
    this.setContentPane(contentPane);
    this.setVisible(true);
  }

  public void changeSnapshot(String filename) {
    String shortenPath = "src/images/";
    ImageIcon newImg = new ImageIcon(shortenPath + filename);
    img.setIcon(newImg);
  }

  @Override
  public void displayComboBox(Map<Snapshot, String> s, JLabel button) {
    snapshotComboBox = new JPopupMenu();
    this.buttonPanel.add(snapshotComboBox);

    for (Snapshot each : s.keySet()) {
      JMenuItem newItem = new JMenuItem(each.getTimestamp());
      snapshotComboBox.add(newItem);
    }
    snapshotComboBox.show(button, 0, button.getHeight());
  }

  @Override
  public void display() {
    setUpWindow();
  }

}


