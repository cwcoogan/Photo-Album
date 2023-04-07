package commands;

import photoalbum.IPhoto;
import photoalbum.Photo;

public class GetHistoryCommand implements Command{
  private IPhoto photo;

  public GetHistoryCommand(IPhoto photo) {
    this.photo = photo;
  }

  public IPhoto getPhoto() {
    return photo;
  }

  @Override
  public void execute() {
    photo.getHistory();
  }
}
