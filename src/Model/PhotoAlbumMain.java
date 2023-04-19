package Model;

import java.io.IOException;

import Controller.Controller;
import Controller.IController;

import exceptions.IllegalShapeTypeException;

public class PhotoAlbumMain {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IllegalShapeTypeException, IOException {

    IController contr = new Controller();
    contr.run();




  }
}
