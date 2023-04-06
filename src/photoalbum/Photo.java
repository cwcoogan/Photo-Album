package photoalbum;

import java.util.ArrayList;
import java.util.List;

public class Photo implements IPhoto{
  Command command;
  private final List<IShape> photoAlbum;

  public Photo() {
    photoAlbum = new ArrayList<>();
  }

  public void setCommand(Command command) {
    this.command = command;
  }
  public void executeCommand(String arg) {
    command.execute(arg);
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
