package photoalbum;

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
  public String description() {
    return this.description;
  }

  @Override
  public String timestamp() {
    return this.timestamp;
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
