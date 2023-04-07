package commands;

import shapes.IShape;
import shapes.Rectangle;

public class ChangeHeightCommand implements Command {
  private final Rectangle shape;
  private double height;

  public ChangeHeightCommand(IShape shape) {
    this.shape = (Rectangle)shape;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public Rectangle getShape() {
    return shape;
  }

  public double getHeight() {
    return height;
  }

  @Override
  public void execute() {
    shape.setHeight(height);
  }
}
