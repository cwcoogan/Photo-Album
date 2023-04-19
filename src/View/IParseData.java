package View;

import exceptions.IllegalShapeTypeException;

public interface IParseData {
  void execute() throws NoSuchFieldException, IllegalAccessException, IllegalShapeTypeException;
}
