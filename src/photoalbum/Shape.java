package photoalbum;

import java.util.ArrayList;
import java.util.List;

public class Shape implements IShape {
  private double center;
  private double xRadius;
  private double yRadius;
  private double color;
  private String name;


  ArrayList<String> newList = new ArrayList<>();

  public Shape(double center, double xRadius, double yRadius, double color, String name)
          throws IllegalArgumentException{
    if (name.isEmpty() || name.isBlank()) {
      throw new IllegalArgumentException();
    }
      this.name = name;
      this.center = center;
      this.xRadius = xRadius;
      this.yRadius = yRadius;
      this.color = color;
  }

  @Override
  public double center() {
    return 0;
  }

  @Override
  public double xRadius() {
    return 0;
  }

  @Override
  public double yRadius() {
    return 0;
  }

  @Override
  public double color() {
    return 0;
  }

  @Override
  public String name() {
    return null;
  }


}
