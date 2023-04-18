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
  public ChangeWidthCommand(IShape shape, double width) {
    this.shape = (Rectangle) shape;
    this.width = width;

  }

  @Override
  public void execute() {

    shape.setWidth(width);
  }
}
