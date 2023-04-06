package commands;

import shapes.IShape;

public class ChangeColorCommand implements Command {
  private final IShape shape;
  private double color;

  public ChangeColorCommand(IShape shape) {
    this.shape = shape;
  }


  public void setColor(double color) {
    this.color = color;
  }

  @Override
  public void execute() {
    shape.setColor(color);
  }
}
