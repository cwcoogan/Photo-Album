package commands;

import View.IView;
import shapes.IShape;
import shapes.Oval;

/**
 * The type Change y radius command.
 */
public class ChangeYRadiusCommand implements Command {
  private final Oval shape;
  private double radius;

  /**
   * Instantiates a new Change y radius command.
   *
   * @param shape the shape
   */
  public ChangeYRadiusCommand(IShape shape, double radius) {

    this.shape = (Oval) shape;
    this.radius = radius;
  }


  @Override
  public void execute() {
    shape.setRadiusY(radius);
  }
}
