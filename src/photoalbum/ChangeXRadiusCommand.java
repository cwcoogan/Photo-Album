package photoalbum;

public class ChangeXRadiusCommand implements Command{
  private final Oval shape;

  public ChangeXRadiusCommand(IShape shape) {
    this.shape = (Oval)shape;
  }

  @Override
  public void execute(String RadiusY) {
    shape.setRadiusX(Double.parseDouble(RadiusY));
  }
}

