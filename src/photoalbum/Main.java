package photoalbum;

import commands.GetHistoryCommand;
import commands.TakeSnapshotCommand;
import exceptions.IllegalShapeTypeException;
import shapes.IShape;
import shapes.Shape;
import shapes.ShapeFactory;

public class Main {
  private IShape s;

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IllegalShapeTypeException {
    Photo photo = new Photo();
    ShapeFactory shapeFactory = new ShapeFactory();
    IShape s = ShapeFactory.createShape(photo, "oval", 1, 1, "blue", "My first oval", "10 15");
    photo.addShape(s);
    photo.takeSnapshot("first snapshot");
    photo.getHistory();
  }
}
