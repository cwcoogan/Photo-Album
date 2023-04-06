package photoalbum;

import java.util.List;

public interface IPhoto {
  void addShape(IShape shape);
  void removeShape(IShape shape);
  List<IShape> getPhotoAlbum();
}
