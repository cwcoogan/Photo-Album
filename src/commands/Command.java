package commands;

/**
 * The interface Command.
 */
public interface Command {
  /**
   * Execute.
   *
   * @throws NoSuchFieldException   the no such field exception
   * @throws IllegalAccessException the illegal access exception
   */
  void execute() throws NoSuchFieldException, IllegalAccessException;
}
