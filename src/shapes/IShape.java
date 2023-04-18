package shapes;

import java.awt.*;

/**
 * The interface Shape.
 */
public interface IShape {
  /**
   * Gets x coord.
   *
   * @return the x coord
   */
  double getXCoord();

  /**
   * Gets y coord.
   *
   * @return the y coord
   */
  double getYCoord();

  /**
   * Gets color.
   *
   * @return the color
   */
  Color getColor();

  /**
   * Sets x coord.
   *
   * @param xCoord the x coord
   */
  void setXCoord(double xCoord);

  /**
   * Sets y coord.
   *
   * @param yCoord the y coord
   */
  void setYCoord(double yCoord);

  /**
   * Sets color.
   *
   * @param color the color
   * @throws NoSuchFieldException   the no such field exception
   * @throws IllegalAccessException the illegal access exception
   */
  void setColor(Color color) throws NoSuchFieldException, IllegalAccessException;

  /**
   * Sets name.
   *
   * @param name the name
   */
  void setName(String name);

  /**
   * Sets type.
   *
   * @param type the type
   */
  void setType(IShape type);

  /**
   * Gets type.
   *
   * @return the type
   */
  IShape getType();

  /**
   * Gets name.
   *
   * @return the name
   */
  String getName();

  /**
   * Gets x radius.
   *
   * @return the x radius
   */
  double getXRadius();

  /**
   * Gets y radius.
   *
   * @return the y radius
   */
  double getYRadius();
}
