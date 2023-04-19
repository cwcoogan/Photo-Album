package commands;

import Model.IPhoto;
import View.IView;

/**
 * The type Take snapshot command.
 */
public class TakeSnapshotCommand implements Command {
  private IPhoto model;
  private final String description;

  /**
   * Instantiates a new Take snapshot command.
   *
   * @param model       the model
   * @param description the description
   */
  public TakeSnapshotCommand(IPhoto model, String description) {
    this.model = model;
    this.description = description;
  }

  @Override
  public void execute() {
    model.takeSnapshot(description);
  }
}