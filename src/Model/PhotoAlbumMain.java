package Model;

import Controller.Controller;
import Controller.IController;
import View.IView;
import View.View;
import exceptions.IllegalShapeTypeException;
import shapes.IShape;

public class PhotoAlbumMain {
  private IShape s;

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IllegalShapeTypeException {
    Photo photo = new Photo();
//    ShapeFactory shapeFactory = new ShapeFactory();
//    IShape s = ShapeFactory.createShape(photo, "oval", 1, 1, "blue", "My first oval", "10 15");
//    photo.addShape(s);
//    photo.takeSnapshot("first snapshot");
//    photo.getHistory();

//    IView testData = new Swing("src/files/buildings.txt");
//    testData.display();
//    System.out.println(testData);
    IController contr = new Controller();
    contr.display();
  }
}
