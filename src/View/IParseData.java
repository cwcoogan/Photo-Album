package View;

import exceptions.IllegalShapeTypeException;

/**
 * The interface Parse data.
 */
public interface IParseData {
  /**
   * Execute.
   *
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   * @throws IllegalShapeTypeException the illegal shape type exception
   */
  void execute() throws NoSuchFieldException, IllegalAccessException, IllegalShapeTypeException;
}
