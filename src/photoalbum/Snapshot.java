package photoalbum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Snapshot {
  private String timestamp;
  private String snapshotID;
  private String description;
  private Photo photo;


  public Snapshot(String description, Photo photo) {
    this.timestamp = timestamp();
    this.snapshotID = snapshotID();
    this.description = description;
    this.photo = photo;
  }

  public String timestamp() {
    LocalDateTime local = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDateTime = local.format(formatter);
    return formattedDateTime;
  }

  public String snapshotID() {
    LocalDateTime local = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = local.format(formatter);
    return formattedDateTime;
  }

  @Override
  public String toString() {
    return "Snapshot ID: " + snapshotID
    + "Timestamp: " + timestamp
            + "Description: " + this.description
            + "Shape Information: " + photo.toString();
  }
}
