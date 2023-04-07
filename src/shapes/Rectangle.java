package shapes;

import java.awt.*;

import shapes.Shape;

public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double xCoord, double yCoord, Color color, String name, double width, double height)
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

  @Override

  public String toString() {
    return  super.toString() + "\nType: " + this.getClass().getSimpleName() + "\n" + "Width: " + this.width + " " +", Height: " + this.height;
  }
}
