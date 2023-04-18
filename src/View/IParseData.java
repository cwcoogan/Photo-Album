package View;

public interface IParseData {
  String getCommandType();
  double getX();
  double getY();
  double getHeight();
  double getWidth();
  int getRed();
  int getGreen();
  int getBlue();
  String getType();
  void setSnapshot(boolean b);
}
