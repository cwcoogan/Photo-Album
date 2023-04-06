package photoalbum;

public class ChangeYRadiusCommand implements Command{
  private final Oval shape;

  public ChangeYRadiusCommand(IShape shape) {
    this.shape = (Oval)shape;
  }

  @Override
  public void execute(String RadiusY) {
    shape.setRadiusY(Double.parseDouble(RadiusY));
  }
}
