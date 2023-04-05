package photoalbum;

import java.util.Objects;

public class Shape implements IShape {
  private double location;
  private double xRadius;
  private double yRadius;
  private double color;
  private double height;
  private String name;
  private IShape type;
  private double width;

  public Shape(IShape type, double location, double xRadius,
               double yRadius, double color, String name, double height, double width)
          throws IllegalArgumentException{
    if (name.isEmpty() || name.isBlank()) {
      throw new IllegalArgumentException();
    }
    if (type == null) {
        throw new IllegalArgumentException();
      }
      this.type = type;
      this.name = name;
      this.location = location;
      this.xRadius = xRadius;
      this.yRadius = yRadius;
      this.color = color;
      this.height = height;
      this.width = width;
  }

  @Override
  public double location() {
    return this.location;
  }

  @Override
  public double xRadius() {
    return xRadius;
  }

  @Override
  public double yRadius() {
    return this.yRadius;
  }

  @Override
  public double height() {
    return this.height;
  }

  @Override
  public double color() {
    return this.color;
  }

  @Override
  public IShape type() {
    return this.type;
  }

  @Override
  public String name() {
    return this.name;
  }

  @Override
  public double width() {
    return this.width;
  }

  @Override
  public String toString() {
    return "Name: " + name + "\n"
    + "Type: " + type + "\n"
            + "location: " + location
            + "Width: " +  width
            + "Height" + height
            + "Color: " + color;
  }

  // toString for circle
  @Override
  public String toString() {
    return "Name: " + name + "\n"
            + "Type: " + type + "\n"
            + "Center: " + "(" + xRadius + "," + yRadius + ")" + "\n"
            + "Height" + height
            + "Color: " + color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Shape that = (Shape) o;
    return Objects.equals(name, that.name)
            && Objects.equals(type, that.type);


  }
  @Override
  public int hashCode() {
    return Objects.hash(name, type);
  }
}
