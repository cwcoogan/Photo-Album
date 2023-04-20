package commands;

import View.IView;
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
   * @param x     the x
   * @param y     the y
   */
  public MoveCoordsCommand(IShape shape, double x, double y) {
    this.shape = shape;
    this.x = x;
    this.y = y;
  }


  @Override
  public void execute() {
    shape.setXCoord(x);
    shape.setYCoord(y);

  }
}
