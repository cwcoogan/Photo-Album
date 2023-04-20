package View;

import java.awt.*;

import java.util.List;

import javax.swing.*;

import shapes.IShape;
import shapes.Oval;
import shapes.Rectangle;

/**
 * The type Paint.
 */
public class Paint extends JPanel {
  private List<IShape> shapes;

  /**
   * Instantiates a new Paint.
   */
  public Paint() {
    this.setPreferredSize(new Dimension(800, 800));
  }

  @Override
  public void paintComponent(Graphics g) {
    for (IShape shape : shapes) {
      String shapeType = shape.getClass().getSimpleName().toLowerCase();
      g.setColor(shape.getColor());

      switch (shapeType) {
        case "oval":
          g.fillOval((int) shape.getXCoord(), (int) shape.getYCoord(),
                  (int) ((Oval) shape).getRadiusX(), (int) ((Oval) shape).getRadiusY());
          break;
        case "rectangle":
          g.fillRect((int) shape.getXCoord(), (int) shape.getYCoord(),
                  (int) ((Rectangle) shape).getWidth(), (int) ((Rectangle) shape).getHeight());
          break;
      }
    }
  }

  /**
   * Sets shapes.
   *
   * @param shapes the shapes
   */
  public void setShapes(List<IShape> shapes) {
    this.shapes = shapes;
  }
}