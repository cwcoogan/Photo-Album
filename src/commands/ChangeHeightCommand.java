package commands;

import shapes.IShape;
import shapes.Rectangle;

/**
 * The type Change height command.
 */
public class ChangeHeightCommand implements Command {
  private final Rectangle shape;
  private double height;

  /**
   * Instantiates a new Change height command.
   *
   * @param shape the shape
   */
  public ChangeHeightCommand(IShape shape) {
    this.shape = (Rectangle) shape;
  }

  /**
   * Sets height.
   *
   * @param height the height
   */
  public void setHeight(double height) {
    this.height = height;
  }

  /**
   * Gets shape.
   *
   * @return the shape
   */
  public Rectangle getShape() {
    return shape;
  }

  /**
   * Gets height.
   *
   * @return the height
   */
  public double getHeight() {
    return height;
  }

  @Override
  public void execute() {
    shape.setHeight(height);
  }
}
