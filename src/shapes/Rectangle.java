package shapes;

import java.awt.*;

import shapes.Shape;

/**
 * The type Rectangle.
 */
public class Rectangle extends Shape {
  private double width;
  private double height;

  /**
   * Instantiates a new Rectangle.
   *
   * @param xCoord the x coord
   * @param yCoord the y coord
   * @param color  the color
   * @param name   the name
   * @param width  the width
   * @param height the height
   * @throws IllegalArgumentException the illegal argument exception
   */
  public Rectangle(double xCoord, double yCoord, Color color, String name, double width, double height)
          throws IllegalArgumentException {
    super(xCoord, yCoord, color, name);
    this.height = height;
    this.width = width;
  }

  /**
   * Sets width.
   *
   * @param width the width
   */
  public void setWidth(double width) {
    if (width < 0) {
      throw new IllegalArgumentException("Width cannot be negative");
    }
    this.width = width;
  }

  /**
   * Sets height.
   *
   * @param height the height
   */
  public void setHeight(double height) {
    if (height < 0) {
      throw new IllegalArgumentException("Height cannot be negative");
    }
    this.height = height;
  }

  /**
   * Gets width.
   *
   * @return the width
   */
  public double getWidth() {
    return width;
  }

  /**
   * Gets height.
   *
   * @return the height
   */
  public double getHeight() {
    return height;
  }

  @Override

  public String toString() {
    return super.toString() + "\nType: " + this.getClass().getSimpleName() + "\n" + "Width: " + this.width + " " + ", Height: " + this.height;
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
