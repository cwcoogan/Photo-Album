package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import commands.Command;
import shapes.IShape;

/**
 * The interface Photo.
 */
public interface IPhoto {
  /**
   * Add shape.
   *
   * @param shape the shape
   */
  void addShape(IShape shape);

  /**
   * Remove shape.
   *
   * @param shape the shape
   */
  void removeShape(IShape shape);

  /**
   * Gets photo album.
   *
   * @return the photo album
   */
  List<IShape> getPhotoAlbum();

  /**
   * Sets command.
   *
   * @param command the command
   */
  void setCommand(Command command);

  /**
   * Execute command.
   *
   * @param command the command
   * @throws NoSuchFieldException   the no such field exception
   * @throws IllegalAccessException the illegal access exception
   */
  void executeCommand(Command command) throws NoSuchFieldException, IllegalAccessException;

  /**
   * Take snapshot.
   *
   * @param description the description
   */
  void takeSnapshot(String description);

  /**
   * Gets history.
   *
   * @return the history
   */
  Map<Snapshot, String> getSnapshots();

  /**
   * Gets history.
   *
   * @return the history
   */
  Map<Snapshot, String> getHistory();

  /**
   * Gets shape from name.
   *
   * @param name the name
   * @return the shape from name
   */
  IShape getShapeFromName(String name);

  /**
   * Gets first snapshot.
   *
   * @return the first snapshot
   */
  Snapshot getFirstSnapshot();

  /**
   * Gets next snapshot.
   *
   * @return the next snapshot
   */
  Snapshot getNextSnapshot();

  /**
   * Gets previous snapshot.
   *
   * @return the previous snapshot
   */
  Snapshot getPreviousSnapshot();

  /**
   * Gets snapshot from timestamp.
   *
   * @param id the id
   * @return the snapshot from timestamp
   */
  Snapshot getSnapshotFromTimestamp(String id);

  /**
   * Gets snap keys.
   *
   * @return the snap keys
   */
  ArrayList<Snapshot> getSnapKeys();
}
