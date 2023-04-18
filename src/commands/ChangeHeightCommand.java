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
  public ChangeHeightCommand(IShape shape, double height) {

    this.shape = (Rectangle) shape;
    this.height = height;
  }

  @Override
  public void execute() {
    shape.setHeight(height);
  }
}
