package commands;

import shapes.IShape;
import shapes.Oval;
import shapes.Rectangle;

/**
 * The type Move coords command.
 */
public class MoveCoordsCommand implements Command {
  private final IShape shape;
  private double x;
  private double y;

  /**
   * Instantiates a new Move coords command.
   *
   * @param shape the shape
   */
  public MoveCoordsCommand(IShape shape) {
    this.shape = shape;
  }

  /**
   * Sets coords.
   *
   * @param x the x
   * @param y the y
   */
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
