package View;

import java.awt.*;

import javax.swing.*;

import Controller.IController;

public class View extends JFrame implements IView{
  private int height;
  private int width;
  private IController controller;
  private JPanel contentPane;
  private JPanel imgPanel;
  private JLabel img;



  // instantiate the Controller here and change
  public View(IController controller, int height, int width) throws IllegalArgumentException {
    if (height < 0 || width < 0) {
      throw new IllegalArgumentException();
    }
    this.height = height;
    this.width = width;
    this.controller = controller;

    this.setSize(this.width, this.height);
  }

  public JButton addNewButtons(JPanel buttonPanel, int x, int y, int width, int height, String text) {
    JButton button = new JButton(text);
    button.setBounds(x, y, width, height);
    buttonPanel.add(button);
    return button;
  }

  public void setUpWindow() {
    this.setTitle("CS5004 Photo Album");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    contentPane = new JPanel();
    contentPane.setBackground(Color.BLUE);
    contentPane.setLayout(new BorderLayout());

    imgPanel = new JPanel();
    img = new JLabel("");
    imgPanel.setLayout(new FlowLayout());
    imgPanel.add(img);
    imgPanel.setBackground(contentPane.getBackground());


    JPanel buttonPanel = new JPanel();
    buttonPanel.setOpaque(false);
    buttonPanel.setLayout(new FlowLayout());
    JButton prevButton = addNewButtons(buttonPanel, 25, 700, 130, 30, "previous");
    prevButton.addActionListener(e -> controller.handlePreviousSnap(e));

    JButton snapshotButton = addNewButtons(buttonPanel, 225, 700, 130, 30, "Snapshot");
    snapshotButton.addActionListener(e -> controller.displayComboBox(e));


    JButton nextButton = addNewButtons(buttonPanel, 425, 700, 130, 30, "Next");
    nextButton.addActionListener(e -> controller.next(e));

    JButton exitButton = addNewButtons(buttonPanel, 625, 700, 130, 30, "Exit");
    exitButton.addActionListener(e -> controller.handleExitButtonClick(e));


    // initial snapshot...
    changeSnapshot("angryhermaine.jpeg");

    //    img.setBackground(contentPane.getBackground());
    contentPane.add(imgPanel, BorderLayout.CENTER);
    contentPane.add(buttonPanel, BorderLayout.NORTH);
    this.setContentPane(contentPane);
    this.setVisible(true);
  }

  public void changeSnapshot(String filename) {
    String shortenPath = "src/images/";
    ImageIcon newImg = new ImageIcon(shortenPath + filename);
    img.setIcon(newImg);
  }

  public void displayComboBox() {
    System.out.println("displaying");
  }

  @Override
  public void display() {
    setUpWindow();
  }

}


