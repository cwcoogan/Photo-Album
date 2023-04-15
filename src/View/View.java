package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Controller.IController;

public class View extends JFrame implements IView{
  private JFrame frame;
  private JButton button;
  private JLabel label;
  private int height;
  private int width;
  private IController controller;

  // instantiate the Controller here and change
  public View(IController controller, int height, int width) throws IllegalArgumentException {
    if (height < 0 || width < 0) {
      throw new IllegalArgumentException();
    }
    this.height = height;
    this.width = width;
    this.controller = controller;

    this.setSize(this.width, this.height);
    button = new JButton();
    label = new JLabel();
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

    JPanel contentPane = new JPanel();
    contentPane.setBackground(Color.BLUE);
    contentPane.setLayout(new BorderLayout());

    JPanel buttonPanel = new JPanel();
    buttonPanel.setOpaque(false);
    buttonPanel.setLayout(new FlowLayout());
    JButton prevButton = addNewButtons(buttonPanel, 25, 700, 130, 30, "previous");
    prevButton.addActionListener(e -> controller.handlePreviousSnap(e));

    JButton snapshotButton = addNewButtons(buttonPanel, 225, 700, 130, 30, "Snapshot");

    JButton nextButton = addNewButtons(buttonPanel, 425, 700, 130, 30, "Next");
    JButton exitButton = addNewButtons(buttonPanel, 625, 700, 130, 30, "Exit");
    exitButton.addActionListener(e -> controller.handleExitButtonClick(e));


    contentPane.add(buttonPanel, BorderLayout.CENTER);
    this.setContentPane(contentPane);
    this.setVisible(true);
  }

  @Override
  public void display() {
    setUpWindow();
  }

}


