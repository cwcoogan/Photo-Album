package shapes;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import exceptions.IllegalShapeTypeException;
import Model.IPhoto;

/**
 * The type Shape factory.
 */
public class ShapeFactory {

  /**
   * Create shape shape.
   *
   * @param photoAlbum the photo album
   * @param shapeType  the shape type
   * @param xCoord     the x coord
   * @param yCoord     the y coord
   * @param color      the color
   * @param name       the name
   * @param properties the properties
   * @return the shape
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  public static IShape createShape(IPhoto photoAlbum, String shapeType, double xCoord,
                                   double yCoord, Color color, String name,
                                   String properties) throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {

    String[] attributes = properties.split(",");
    IShape shape;

    if (shapeType.equalsIgnoreCase("oval")) {
      shape = new Oval(xCoord, yCoord, color, name,
              Double.parseDouble(attributes[0]), Double.parseDouble(attributes[1]));
      shape.setColor(color);
      photoAlbum.addShape(shape);
    } else if (shapeType.equalsIgnoreCase("rectangle")) {
      shape = new Rectangle(xCoord, yCoord, color, name,
              Double.parseDouble(attributes[0]), Double.parseDouble(attributes[1]));
      shape.setColor(color);
      photoAlbum.addShape(shape);
    } else {
      throw new IllegalShapeTypeException("Invalid shape type");
    }
    return shape;
  }
}
