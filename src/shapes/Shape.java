package shapes;

import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * The type Shape.
 */
public abstract class Shape implements IShape {
  private double xCoord;
  private double yCoord;
  private Color color;
  private String name;
  private IShape type;

  /**
   * Instantiates a new Shape.
   *
   * @param xCoord the x coord
   * @param yCoord the y coord
   * @param color  the color
   * @param name   the name
   * @throws IllegalArgumentException the illegal argument exception
   */
  public Shape(double xCoord, double yCoord, Color color, String name)
          throws IllegalArgumentException {
    if (name.isEmpty() || name.isBlank()) {
      throw new IllegalArgumentException();
    }
    this.name = name;
    this.xCoord = xCoord;
    this.yCoord = yCoord;
    this.color = color;
  }

  public void setColor(String color) throws NoSuchFieldException, IllegalAccessException {
    this.color = (Color) Color.class.getField(color).get(null);
  }

  public void setXCoord(double xCoord) {
    this.xCoord = xCoord;
  }

  public void setYCoord(double yCoord) {
    this.yCoord = yCoord;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(IShape type) {
    this.type = type;
  }

  @Override
  public double getXCoord() {
    return this.xCoord;
  }

  @Override
  public double getYCoord() {
    return this.yCoord;
  }

  @Override
  public Color getColor() {
    return this.color;
  }

  @Override
  public IShape getType() {
    return this.type;
  }

  @Override
  public String getName() {
    return this.name;
  }

  /**
   * Gets coord.
   *
   * @return the coord
   */
  public double getxCoord() {
    return xCoord;
  }

  /**
   * Gets coord.
   *
   * @return the coord
   */
  public double getyCoord() {
    return yCoord;
  }

  @Override
  public String toString() {
    return "Name: " + getName()
            + "\nCenter: " + "(" + xCoord + ", " + yCoord + ")"
            + "\nColor: " + "(" + getColor().getBlue() + ", " + getColor().getGreen() + ", " + getColor().getRed() + ")";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Shape that = (Shape) o;
    return Objects.equals(name, that.name);

  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
