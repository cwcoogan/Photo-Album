package shapes;

import shapes.Shape;

public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double xCoord, double yCoord, double color, String name, double width, double height)
          throws IllegalArgumentException {
    super(xCoord, yCoord, color, name);
    this.height = height;
    this.width = width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
