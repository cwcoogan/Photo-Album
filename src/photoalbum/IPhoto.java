package photoalbum;

import java.util.ArrayList;

public interface IPhoto {
  IShape addShape();
  IShape removeShape();
  ArrayList<String> photoAlbum();
  String description();
  String timestamp();
  String snapshotID();
  String name();
}
