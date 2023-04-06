package photoalbum;

public class Oval extends Shape{
  private double radiusY;
  private double radiusX;

  public Oval(double xCoord, double yCoord, double color, String name)
          throws IllegalArgumentException {
    super(xCoord, yCoord, color, name);
  }

  public void setRadiusY(double radiusY) {
    this.radiusY = radiusY;
  }

  public void setRadiusX(double radiusX) {
    this.radiusX = radiusX;
  }
}
