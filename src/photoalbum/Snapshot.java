package photoalbum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * The type Snapshot.
 */
public class Snapshot {
  private final String timestamp;
  private final String snapshotID;
  private final String description;
  private final IPhoto photo;


  /**
   * Instantiates a new Snapshot.
   *
   * @param description the description
   * @param photo       the photo
   */
  public Snapshot(String description, IPhoto photo) {
    this.timestamp = timestamp();
    this.snapshotID = snapshotID();
    this.description = description;
    this.photo = photo;
  }

  /**
   * Timestamp string.
   *
   * @return the string
   */
  public String timestamp() {
    LocalDateTime local = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDateTime = local.format(formatter);
    return formattedDateTime;
  }

  /**
   * Snapshot id string.
   *
   * @return the string
   */
  public String snapshotID() {
    UUID uuid = UUID.randomUUID();
    LocalDateTime local = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = local.format(formatter);
    String formattedDateTimeWithRandom = formattedDateTime + "." + uuid.toString();
    return formattedDateTimeWithRandom;
  }

  /**
   * Gets snapshot id.
   *
   * @return the snapshot id
   */
  public String getSnapshotID() {
    return snapshotID;
  }

  /**
   * Gets timestamp.
   *
   * @return the timestamp
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Gets description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets photo.
   *
   * @return the photo
   */
  public IPhoto getPhoto() {
    return photo;
  }

  @Override
  public String toString() {
    return "Snapshot ID: " + snapshotID + "\n"
            + "Timestamp: " + timestamp + "\n"
            + "Description: " + this.description + "\n"
            + "Shape Information: " + photo.toString() + "\n";
  }
}
