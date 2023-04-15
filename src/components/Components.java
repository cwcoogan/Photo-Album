package components;


import javax.swing.*;


public class Components {
  JFrame frame;

  public void exitButton(JPanel buttonPanel, int x, int y, int width, int height, String text) {
    JButton exitButton = new JButton(text);
    exitButton.setBounds(x, y, width, height);
    buttonPanel.add(exitButton);
  }



}
