package photoalbum;

import java.util.Objects;

public abstract class Shape implements IShape {
  private double xCoord;
  private double yCoord;
  private double color;
  private String name;
  private IShape type;

  public Shape(double xCoord, double yCoord, double color, String name)
          throws IllegalArgumentException{
    if (name.isEmpty() || name.isBlank()) {
      throw new IllegalArgumentException();
    }
      this.name = name;
      this.xCoord = xCoord;
      this.yCoord = yCoord;
      this.color = color;
  }

  public void setXCoord(double xCoord) {
    this.xCoord = xCoord;
  }

  public void setYCoord(double yCoord) {
    this.yCoord = yCoord;
  }

  public void setColor(double color) {
    this.color = color;
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
  public double getColor() {
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

  @Override
  public String toString() {
    return "Name: " + getName()
            + "Type: " + getType()
            + "Center: " + "(" + xCoord + yCoord + "), "
            + "X Radius: " + getXCoord() + "Y Radius: " + getYCoord()
            + "Color: " + getColor();
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
