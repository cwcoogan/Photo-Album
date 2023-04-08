package commands;

import shapes.IShape;
import shapes.Rectangle;

/**
 * The type Change width command.
 */
public class ChangeWidthCommand implements Command {

  private final Rectangle shape;
  private double width;

  /**
   * Instantiates a new Change width command.
   *
   * @param shape the shape
   */
  public ChangeWidthCommand(IShape shape) {
    this.shape = (Rectangle) shape;

  }

  /**
   * Sets width.
   *
   * @param width the width
   */
  public void setWidth(double width) {
    this.width = width;
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
   * Gets width.
   *
   * @return the width
   */
  public double getWidth() {
    return width;
  }

  @Override
  public void execute() {
    shape.setWidth(width);
  }
}
