package commands;

import shapes.IShape;
import shapes.Rectangle;

public class ChangeWidthCommand implements Command {

  private final Rectangle shape;
  private double width;

  public ChangeWidthCommand(IShape shape) {
    this.shape = (Rectangle)shape;

  }

  public void setWidth(double width) {
    this.width = width;
  }

  public Rectangle getShape() {
    return shape;
  }

  public double getWidth() {
    return width;
  }

  @Override
  public void execute() {
    shape.setWidth(width);
  }
}
