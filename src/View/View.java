package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Map;

import javax.swing.*;

import Controller.IController;
import Model.Snapshot;
import shapes.IShape;

/**
 * The type View.
 */
public class View extends JFrame implements IView {
  private int height;
  private int width;

  // ## Misc ## //
  private IController controller;

  // ## Panels ## //
  private JPanel contentPane;
  private JPanel titlePanel;
  private JPanel buttonPanel;
  private JPanel paintPanel;

  // ## Labels ## //
  private JLabel descriptionLabel;
  private JLabel idLabel;

  private JPopupMenu snapshotComboBox;
  private Paint paint;

  /**
   * Instantiates a new View.
   *
   * @param controller the controller
   * @param height     the height
   * @param width      the width
   * @throws IllegalArgumentException the illegal argument exception
   */
  public View(IController controller, int height, int width) throws IllegalArgumentException {
    if (height < 0 || width < 0) {
      throw new IllegalArgumentException();
    }
    this.height = height;
    this.width = width;
    this.controller = controller;


    this.setSize(this.width, this.height);
  }

  /**
   * Add new buttons j label.
   *
   * @param path the path
   * @return the j label
   */
  public JLabel addNewButtons(String path) {
    JLabel button = new JLabel(new ImageIcon(path));
    buttonPanel.add(button);
    return button;
  }

  /**
   * Sets up window.
   */
  public void setUpWindow() {
    this.setTitle("CS5004 Photo Album");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    contentPane = new JPanel();
    contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

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

    // ### Description And ID ### //
    titlePanel = new JPanel(new BorderLayout());
    descriptionLabel = new JLabel();
    idLabel = new JLabel();
    idLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
    descriptionLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
    titlePanel.add(descriptionLabel, BorderLayout.CENTER);
    titlePanel.add(idLabel, BorderLayout.SOUTH);
    titlePanel.setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 10));

    // ###### PAINT CONFIGS ###### //
    paint = new Paint();
    paintPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
    paintPanel.add(paint);

    contentPane.add(titlePanel);
    contentPane.add(paintPanel);
    contentPane.add(buttonPanel);

    this.setContentPane(contentPane);
    this.setVisible(true);
  }


  @Override
  public void displayComboBox(Map<Snapshot, String> s, JLabel button) {
    snapshotComboBox = new JPopupMenu();
    this.buttonPanel.add(snapshotComboBox);

    for (Snapshot each : s.keySet()) {
      JMenuItem newItem = new JMenuItem(each.getSnapshotID());
      snapshotComboBox.add(newItem);

      newItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          controller.changeSnapshot(((JMenuItem) e.getSource()).getText());
        }
      });
    }
    snapshotComboBox.show(button, 0, button.getHeight());
  }

  @Override
  public void paintSnapshot(List<IShape> shapes) {
    paint.setShapes(shapes);
    paint.repaint();
  }

  public void changeDescription(String description) {
    descriptionLabel.setText(description);
  }

  @Override
  public void changeID(String id) {
    idLabel.setText(id);
  }

  @Override
  public void outOfSnapshots() {
    JOptionPane.showMessageDialog(null, "No more snapshots!", "Error", JOptionPane.ERROR_MESSAGE);
  }

  @Override
  public void display() {
    setUpWindow();
  }

}


