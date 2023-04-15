package commands;

import Model.IPhoto;

/**
 * The type Get history command.
 */
public class GetHistoryCommand implements Command {
  private IPhoto photo;

  /**
   * Instantiates a new Get history command.
   *
   * @param photo the photo
   */
  public GetHistoryCommand(IPhoto photo) {
    this.photo = photo;
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
  public void execute() {
    photo.getHistory();
  }
}
