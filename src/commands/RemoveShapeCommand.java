package commands;

import Model.IPhoto;
import Model.Photo;
import View.IView;
import shapes.IShape;

/**
 * The type Remove shape command.
 */
public class RemoveShapeCommand implements Command{
  private final IShape shape;
  private final IPhoto photo;

  /**
   * Instantiates a new Remove shape command.
   *
   * @param shape the shape
   * @param photo the photo
   */
  public RemoveShapeCommand(IShape shape, IPhoto photo) {
    this.shape = shape;
    this.photo = photo;
  }

  @Override
  public void execute() throws NoSuchFieldException, IllegalAccessException {
    photo.removeShape(shape);
  }
}
