package commands;

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
  public ChangeYRadiusCommand(IShape shape) {
    this.shape = (Oval) shape;
  }

  /**
   * Sets radius y.
   *
   * @param radius the radius
   */
  public void setRadiusY(double radius) {
    this.radius = radius;
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
   * Gets radius.
   *
   * @return the radius
   */
  public double getRadius() {
    return radius;
  }

  @Override
  public void execute() {
    shape.setRadiusY(radius);
  }
}
