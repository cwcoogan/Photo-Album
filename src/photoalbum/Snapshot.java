package photoalbum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class Snapshot {
  private final String timestamp;
  private final String snapshotID;
  private final String description;
  private final Photo photo;



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
    UUID uuid = UUID.randomUUID();
    LocalDateTime local = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = local.format(formatter);
    String formattedDateTimeWithRandom = formattedDateTime + "." + uuid.toString();
    return formattedDateTimeWithRandom;
  }

  public String getSnapshotID() {
    return snapshotID;
  }

  @Override
  public String toString() {
    return "Snapshot ID: " + snapshotID + "\n"
            + "Timestamp: " + timestamp + "\n"
            + "Description: " + this.description + "\n"
            + "Shape Information: " + photo.toString() + "\n";
  }
}
