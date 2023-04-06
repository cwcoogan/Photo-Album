package commands;

import shapes.IShape;
import shapes.Oval;

public class ChangeYRadiusCommand implements Command {
  private final Oval shape;
  private double radius;

  public ChangeYRadiusCommand(IShape shape) {
    this.shape = (Oval)shape;
  }

  public void setRadiusY(double radius) {
    this.radius = radius;
  }

  @Override
  public void execute() {
    shape.setRadiusY(radius);
  }
}
