package photoalbum;

import java.util.ArrayList;
import java.util.List;

import commands.Command;
import shapes.IShape;

public class Photo implements IPhoto {
  Command command;
  private final List<IShape> photoAlbum;

  public Photo() {
    photoAlbum = new ArrayList<>();
  }


  public void setCommand(Command command) throws NullPointerException{
    if (command == null) {
      throw new NullPointerException();
    }
    this.command = command;
  }

  public void executeCommand(Command command) {
    command.execute();
  }

  @Override
  public void addShape(IShape shape) {
    photoAlbum.add(shape);
  }

  @Override
  public void removeShape(IShape shape) {
    photoAlbum.remove(shape);
  }

  public List<IShape> getPhotoAlbum() {
    return photoAlbum;
  }
}
