package shapes;

import java.awt.*;

import shapes.Shape;

/**
 * The type Oval.
 */
public class Oval extends Shape {
  private double radiusY;
  private double radiusX;

  /**
   * Instantiates a new Oval.
   *
   * @param xCoord  the x coord
   * @param yCoord  the y coord
   * @param color   the color
   * @param name    the name
   * @param radiusX the radius x
   * @param radiusY the radius y
   * @throws IllegalArgumentException the illegal argument exception
   */
  public Oval(double xCoord, double yCoord, Color color, String name, double radiusX, double radiusY)
          throws IllegalArgumentException {
    super(xCoord, yCoord, color, name);
    this.radiusX = radiusX;
    this.radiusY = radiusY;
  }

  /**
   * Gets radius y.
   *
   * @return the radius y
   */
  public double getRadiusY() {
    return radiusY;
  }

  /**
   * Gets radius x.
   *
   * @return the radius x
   */
  public double getRadiusX() {
    return radiusX;
  }

  /**
   * Sets radius y.
   *
   * @param radiusY the radius y
   */
  public void setRadiusY(double radiusY) {
    this.radiusY = radiusY;
  }

  /**
   * Sets radius x.
   *
   * @param radiusX the radius x
   */
  public void setRadiusX(double radiusX) {
    this.radiusX = radiusX;
  }

  @Override
  public String toString() {
    return super.toString() + "\nType: " + this.getClass().getSimpleName() + "\n" + "X Radius: " + this.radiusX + " " + ", Y Radius: " + this.radiusY;
  }

}
