package View;

import java.util.ArrayList;

public class getData {
  String shape;
  String background;
  float x;
  float y;
  int height;
  int width;

  public getData(ArrayList<String> getData) {
    this.shape = getData.get(0);
    this.background = getData.get(1);
    this.x = Float.parseFloat(getData.get(3));
    this.y = Float.parseFloat(getData.get(4));
    this.height = Integer.parseInt(getData.get(5));
    this.width = Integer.parseInt(getData.get(6));
  }

  public String getShape() {
    return shape;
  }

  public String getBackground() {
    return background;
  }

  public float getX() {
    return x;
  }

  public float getY() {
    return y;
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  @Override
  public String toString() {
    return " Shape: " + getShape() + " background: " + background
            + " x: " + getX() + " y" + getY() + " height: " + getHeight()
            + " width: " + getWidth();

  }
}
