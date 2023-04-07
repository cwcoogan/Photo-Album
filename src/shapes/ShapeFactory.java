package shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import photoalbum.IPhoto;

public class ShapeFactory {
  IPhoto photoAlbum;

  public ShapeFactory(IPhoto photoAlbum) {
    this.photoAlbum = photoAlbum;
  }

  public void createShape(String shapeType, double xCoord,
                          double yCoord, double color, String name,
                          String properties) {

    List<String> attributes =  Arrays.stream(properties.split(" ")).toList();

    if (shapeType.equals("oval")) {
      photoAlbum.addShape(new Oval(xCoord, yCoord, color, name,
              Double.parseDouble(attributes.get(0)), Double.parseDouble(attributes.get(1))));
    } else if (shapeType.equals("rectangle")) {
      photoAlbum.addShape(new Rectangle(xCoord, yCoord, color, name,
              Double.parseDouble(attributes.get(0)), Double.parseDouble(attributes.get(1))));
    } else {
      throw new IllegalArgumentException("Invalid shape type");
    }
  }
}
