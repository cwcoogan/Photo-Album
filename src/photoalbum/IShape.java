package photoalbum;

public interface IShape {
  double getXCoord();
  double getYCoord();
  double getColor();
  void setXCoord(double xCoord);
  void setYCoord(double yCoord);
  void setColor(double color);
  void setName(String name);
  void setType(IShape type);
  IShape getType();
  String getName();
}
