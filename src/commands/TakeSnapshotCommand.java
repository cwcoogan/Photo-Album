package commands;

import commands.Command;
import photoalbum.IPhoto;
import photoalbum.Photo;
import shapes.IShape;

public class TakeSnapshotCommand implements Command {
  private IPhoto photo;
  private final String description;

  public TakeSnapshotCommand(IPhoto photo, String description) {
    this.photo = photo;
    this.description = description;
  }

  @Override
  public void execute() {
    photo.takeSnapshot(description);
  }
}