package photoalbum;

public class ChangeWidthCommand implements Command{

  private final Rectangle shape;

  public ChangeWidthCommand(IShape shape) {
    this.shape = (Rectangle)shape;

  }

  @Override
  public void execute(String width) {
    shape.setWidth(Double.parseDouble(width));
  }
}
