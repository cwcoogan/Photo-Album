package Controller;

import java.awt.event.ActionEvent;

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
    System.out.println("get previous snap");
  }

  public void handleExitButtonClick(ActionEvent e) {
    view.dispose();
  }

  public void display() {
    this.view.display();
  }


}
