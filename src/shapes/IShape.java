package shapes;

import java.awt.*;

public interface IShape {
  double getXCoord();
  double getYCoord();
  Color getColor();
  void setXCoord(double xCoord);
  void setYCoord(double yCoord);
  void setColor(String color) throws NoSuchFieldException, IllegalAccessException;
  void setName(String name);
  void setType(IShape type);
  IShape getType();
  String getName();
  double getXRadius();
  double getYRadius();
}
