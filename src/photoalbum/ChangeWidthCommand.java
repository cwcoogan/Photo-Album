package photoalbum;

public class ChangeWidthCommand implements Command{

  private IShape shape;

  public ChangeWidthCommand(IShape shape) {
    this.shape = shape;

  }

  @Override
  public void execute(String width) {
    shape.setWidth(double(width))
  }

  @Override
  public void execute() {
    shape.
  }
}
