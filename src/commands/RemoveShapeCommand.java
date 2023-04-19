package commands;

import Model.IPhoto;
import Model.Photo;
import View.IView;
import shapes.IShape;

public class RemoveShapeCommand implements Command{
  private final IShape shape;
  private final IPhoto photo;

  public RemoveShapeCommand(IShape shape, IPhoto photo) {
    this.shape = shape;
    this.photo = photo;
  }

  @Override
  public void execute() throws NoSuchFieldException, IllegalAccessException {
    photo.removeShape(shape);
  }
}
