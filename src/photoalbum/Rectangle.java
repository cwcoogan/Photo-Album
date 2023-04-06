package photoalbum;

public class Rectangle extends Shape{
  private double width;
  private double height;

  public Rectangle(double xCoord, double yCoord, double color, String name)
          throws IllegalArgumentException {
    super(xCoord, yCoord, color, name);
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
