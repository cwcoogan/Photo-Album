package commands;

import shapes.IShape;
import shapes.Oval;
import shapes.Rectangle;

public class MoveCoordsCommand implements Command {
  private final IShape shape;
  private double x;
  private double y;

  public MoveCoordsCommand(IShape shape) {
    this.shape = shape;
  }

  public void setCoords(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public void execute() {
    shape.setXCoord(x);
    shape.setYCoord(y);
  }
}
