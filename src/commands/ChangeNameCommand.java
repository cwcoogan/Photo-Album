package commands;

import View.IView;
import shapes.IShape;

/**
 * The type Change name command.
 */
public class ChangeNameCommand implements Command {
  private final IShape shape;
  private String name;

  /**
   * Instantiates a new Change name command.
   *
   * @param shape the shape
   */
  public ChangeNameCommand(IShape shape) {
    this.shape = shape;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void execute() {
    shape.setName(name);
  }
}