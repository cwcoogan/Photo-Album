package Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controller.Controller;
import Controller.IController;
import View.IView;
import View.View;
import View.IParseData;
import View.ParseData;
import View.ReadFromFile;
import exceptions.IllegalShapeTypeException;
import shapes.IShape;
import shapes.ShapeFactory;

public class PhotoAlbumMain {
  private IShape s;

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IllegalShapeTypeException, IOException {
//    ShapeFactory shapeFactory = new ShapeFactory();
//    IShape s = ShapeFactory.createShape(photo, "oval", 1, 1, "blue", "My first oval", "10 15");
//    photo.addShape(s);
//    photo.takeSnapshot("first snapshot");
//    photo.getHistory();
//
    IController contr = new Controller();
//    contr.takeSnap();
//    contr.display();


    ReadFromFile reader = new ReadFromFile("src/files/demo_input.txt", contr.getModel());
    List<IParseData> parsedData = reader.readFile();

    contr.getModel().getHistory();
  }
}
