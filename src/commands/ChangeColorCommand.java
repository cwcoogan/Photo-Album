package commands;

import shapes.IShape;

/**
 * The type Change color command.
 */
public class ChangeColorCommand implements Command {
  private final IShape shape;
  private String color;

  /**
   * Instantiates a new Change color command.
   *
   * @param shape the shape
   */
  public ChangeColorCommand(IShape shape) {
    this.shape = shape;
  }


  /**
   * Sets color.
   *
   * @param color the color
   */
  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void execute() throws NoSuchFieldException, IllegalAccessException {
    shape.setColor(color);
  }
}
