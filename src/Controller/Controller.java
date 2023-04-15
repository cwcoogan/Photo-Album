package Controller;

import java.awt.event.ActionEvent;

import javax.swing.*;

import View.IView;
import Model.IPhoto;
import Model.Photo;
import View.View;

public class Controller implements IController {
  IView view;
  IPhoto photo;


  public Controller() {
    this.view = new View(this,800, 800);
    this.photo = new Photo();

  }
  public void handlePreviousSnap(ActionEvent e) {
    this.view.changeSnapshot("angryhermaine.jpeg");
  }

  public void handleExitButtonClick(ActionEvent e) {
    view.dispose();
  }

  public void display() {
    this.view.display();
  }

  public void changeSnapshot(ActionEvent e) {
    this.view.changeSnapshot("snapshot.png");
  }

  public void displayComboBox(ActionEvent e) {
    this.view.displayComboBox();
  }

  public void next(ActionEvent e) {
    this.view.changeSnapshot("ghost.jpg");
  }



}
