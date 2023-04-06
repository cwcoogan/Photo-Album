package photoalbum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

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
    Random rand = new Random();
    int randInt = 0;
    for (int i = 0; i < 6; i++) {
      randInt = rand.nextInt(10);
    }

    LocalDateTime local = LocalDateTime.now();
    // might need to add T before the Hour..
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss" + randInt);
    String formattedDateTime = local.format(formatter);
    String formattedDateTimeWithRandom = formattedDateTime + "." + randInt;
    return formattedDateTimeWithRandom;
  }

  @Override
  public String toString() {
    return "Snapshot ID: " + snapshotID
    + "Timestamp: " + timestamp
            + "Description: " + this.description
            + "Shape Information: " + photo.toString();
  }
}
