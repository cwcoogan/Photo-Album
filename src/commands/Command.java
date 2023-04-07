package commands;

public interface Command {
  void execute() throws NoSuchFieldException, IllegalAccessException;
}
