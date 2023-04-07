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
    if (width < 0) {
      throw new IllegalArgumentException("Width cannot be negative");
    }
    this.width = width;
  }

  public void setHeight(double height) {
    if (height < 0) {
      throw new IllegalArgumentException("Height cannot be negative");
    }
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  @Override

  public String toString() {
    return  super.toString() + "\nType: " + this.getClass().getSimpleName() + "\n" + "Width: " + this.width + " " +", Height: " + this.height;
  }

  @Override
  public double getXRadius() {
    return 0;
  }

  @Override
  public double getYRadius() {
    return 0;
  }
}
