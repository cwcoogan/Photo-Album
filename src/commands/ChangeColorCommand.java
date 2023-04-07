package commands;

import shapes.IShape;

public class ChangeColorCommand implements Command {
  private final IShape shape;
  private String color;

  public ChangeColorCommand(IShape shape) {
    this.shape = shape;
  }


  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void execute() {
    shape.setColor(color);
  }
}
