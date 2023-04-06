package commands;

import shapes.IShape;

public class ChangeNameCommand implements Command {
  private final IShape shape;
  private String name;

  public ChangeNameCommand(IShape shape) {
    this.shape = shape;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void execute() {
    shape.setName(name);
  }
}