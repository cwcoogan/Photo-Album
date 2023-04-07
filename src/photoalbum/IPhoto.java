package photoalbum;

import java.util.List;
import java.util.Map;

import commands.Command;
import shapes.IShape;

public interface IPhoto {
  void addShape(IShape shape);
  void removeShape(IShape shape);
  List<IShape> getPhotoAlbum();
  void setCommand(Command command);
  void executeCommand(Command command);
  void takeSnapshot(String description);
  Map<Snapshot, String> getHistory();
}
