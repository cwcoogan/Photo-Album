package commands;

import shapes.IShape;
import shapes.Oval;

/**
 * The type Change x radius command.
 */
public class ChangeXRadiusCommand implements Command {
  private final Oval shape;
  private double xRadius;

  /**
   * Instantiates a new Change x radius command.
   *
   * @param shape the shape
   */
  public ChangeXRadiusCommand(IShape shape, double xRadius) {

    this.shape = (Oval) shape;
    this.xRadius = xRadius;
  }


  @Override
  public void execute() {
    shape.setRadiusX(xRadius);
  }
}

