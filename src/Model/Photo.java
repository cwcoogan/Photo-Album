package Model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
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
  private Snapshot firstSnap = null;
  private ArrayList<Snapshot> snapKeys = new ArrayList<>();
  private int snapCount = 0;


  /**
   * Instantiates a new Photo.
   */
  public Photo() {
    photoAlbum = new ArrayList<>();
    this.snapshots = new LinkedHashMap<>();

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

    List<IShape> snapShapes = new ArrayList<>(photoAlbum);
    Snapshot sn = new Snapshot(description, this, snapShapes);
    if (firstSnap == null) {
      firstSnap = sn;
    }
    snapKeys.add(sn);
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

      System.out.println("\n");
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

  public IShape getShapeFromName(String shapeName) {
    for (IShape shape : photoAlbum) {
      if (shape.getName().equals(shapeName)) {
        return shape;
      }
    }
    return null;
  }

  @Override
  public Snapshot getFirstSnapshot() {
    return firstSnap;
  }

  public Snapshot getNextSnapshot() {
    if (snapCount + 1 >= snapKeys.size()) {
      return null;
    }
    snapCount += 1;
    return snapKeys.get(snapCount);
  }

  public Snapshot getPreviousSnapshot() {
    if (snapCount - 1 < 0) {
      return null;
    }
    snapCount -= 1;
    return snapKeys.get(snapCount);
  }

  @Override
  public Snapshot getSnapshotFromTimestamp(String id) {
    for (Snapshot snapshot : snapshots.keySet()) {
      if (snapshot.getSnapshotID().equals(id)) {
        snapCount = snapKeys.indexOf(snapshot);
        return snapshot;
      }
    }
    return null;
  }

  public ArrayList<Snapshot> getSnapKeys() {
    return snapKeys;
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
