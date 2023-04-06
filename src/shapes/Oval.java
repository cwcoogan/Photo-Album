package shapes;

import shapes.Shape;

public class Oval extends Shape {
  private double radiusY;
  private double radiusX;

  public Oval(double xCoord, double yCoord, double color, String name, double radiusX, double radiusY)
          throws IllegalArgumentException {
    super(xCoord, yCoord, color, name);
    this.radiusX = radiusX;
    this.radiusY = radiusY;
  }

  public double getRadiusY() {
    return radiusY;
  }

  public double getRadiusX() {
    return radiusX;
  }

  public void setRadiusY(double radiusY) {
    this.radiusY = radiusY;
  }

  public void setRadiusX(double radiusX) {
    this.radiusX = radiusX;
  }
}
