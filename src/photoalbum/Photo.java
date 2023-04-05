package photoalbum;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Timer;
import java.util.time.*;

public class Photo implements IPhoto{
  private String description;
  private String timestamp;
  private String snapshotID;
  private String name;

  public Photo(String name, String description, String snapshotID, String timestamp)
          throws IllegalArgumentException{
    if (name.isBlank() || name.isBlank()) {
      throw new IllegalArgumentException();
    }
    this.name = name;
    this.description = description;
    this.snapshotID = snapshotID;
    this.timestamp = timestamp;

  }

  @Override
  public IShape addShape() {
    return null;
  }

  @Override
  public IShape removeShape() {
    return null;
  }

  @Override
  public ArrayList<String> photoAlbum() {
    return null;
  }

  @Override
  public String description() {
    return this.description;
  }

  @Override
  public String timestamp() {

    String start = Instant
  }

  @Override
  public String snapshotID() {
    return this.snapshotID;
  }

  @Override
  public String name() {
    return this.name;
  }
}
