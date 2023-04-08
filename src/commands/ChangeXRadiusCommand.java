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
  public ChangeXRadiusCommand(IShape shape) {
    this.shape = (Oval) shape;
  }

  /**
   * Sets x radius.
   *
   * @param xRadius the x radius
   */
  public void setXRadius(double xRadius) {
    this.xRadius = xRadius;
  }

  /**
   * Gets shape.
   *
   * @return the shape
   */
  public Oval getShape() {
    return shape;
  }

  /**
   * Gets x radius.
   *
   * @return the x radius
   */
  public double getXRadius() {
    return xRadius;
  }

  @Override
  public void execute() {
    shape.setRadiusX(xRadius);
  }
}

