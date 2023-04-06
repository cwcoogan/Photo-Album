package commands;

import shapes.IShape;
import shapes.Oval;

public class ChangeXRadiusCommand implements Command {
  private final Oval shape;
  private double xRadius;

  public ChangeXRadiusCommand(IShape shape) {
    this.shape = (Oval)shape;
  }

  public void setXRadius(double xRadius) {
    this.xRadius = xRadius;
  }


  @Override
  public void execute() {
    shape.setRadiusX(xRadius);
  }
}

