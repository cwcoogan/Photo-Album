package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import commands.Command;
import shapes.IShape;

/**
 * The type Photo.
 */
public class Photo implements IPhoto {
  /**
   * The Command.
   */
  Command command;
  private final List<IShape> photoAlbum;
  private final Map<Snapshot, String> snapshots;


  /**
   * Instantiates a new Photo.
   */
  public Photo() {
    photoAlbum = new ArrayList<>();
    this.snapshots = new HashMap<>();

  }


  public void setCommand(Command command) throws NullPointerException {
    if (command == null) {
      throw new NullPointerException();
    }
    this.command = command;
  }

  public void executeCommand(Command command) throws NoSuchFieldException, IllegalAccessException {
    command.execute();
  }

  public void takeSnapshot(String description) {
    Snapshot sn = new Snapshot(description, (Photo) this);
    snapshots.put(sn, sn.toString());
  }

  @Override
  public void addShape(IShape shape) throws IllegalArgumentException {
    if (shape == null) {
      throw new IllegalArgumentException();
    }
    photoAlbum.add(shape);
  }

  @Override
  public void removeShape(IShape shape) {
    if (shape == null) {
      throw new IllegalArgumentException();
    }
    photoAlbum.remove(shape);
  }

  public List<IShape> getPhotoAlbum() {
    return photoAlbum;
  }

  public Map<Snapshot, String> getHistory() {
    for (Snapshot each : snapshots.keySet()) {
      System.out.println(snapshots.get(each));
    }
    return snapshots;
  }

  /**
   * Gets snapshots.
   *
   * @return the snapshots
   */
  public Map<Snapshot, String> getSnapshots() {
    return snapshots;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (IShape shape : photoAlbum) {
      sb.append(shape.toString());
    }
    return sb.toString();
  }
}
