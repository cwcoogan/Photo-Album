package commands;

import commands.Command;
import photoalbum.IPhoto;
import photoalbum.Photo;
import shapes.IShape;

/**
 * The type Take snapshot command.
 */
public class TakeSnapshotCommand implements Command {
  private IPhoto photo;
  private final String description;

  /**
   * Instantiates a new Take snapshot command.
   *
   * @param photo       the photo
   * @param description the description
   */
  public TakeSnapshotCommand(IPhoto photo, String description) {
    this.photo = photo;
    this.description = description;
  }

  @Override
  public void execute() {
    photo.takeSnapshot(description);
  }
}