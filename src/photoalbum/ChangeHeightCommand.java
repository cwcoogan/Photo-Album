package photoalbum;

public class ChangeHeightCommand implements Command{
  private final Rectangle shape;

  public ChangeHeightCommand(IShape shape) {
    this.shape = (Rectangle)shape;
  }

  @Override
  public void execute(String Height) {
    shape.setHeight(Double.parseDouble(Height));
  }
}
