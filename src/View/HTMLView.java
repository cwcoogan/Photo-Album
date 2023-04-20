package View;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Model.Snapshot;
import shapes.IShape;
import shapes.Oval;
import shapes.Rectangle;

/**
 * The type Html view.
 */
public class HTMLView {
  private String outputFile;
  private int width;
  private int height;


  /**
   * Instantiates a new Html view.
   *
   * @param outputFile the output file
   * @param width      the width
   * @param height     the height
   */
  public HTMLView(String outputFile, int width, int height) throws IllegalArgumentException {
    if (width <= 0 || height <= 0) {
      throw new IllegalArgumentException("Width and height must be positive");
    }
    this.outputFile = outputFile;
    this.width = width;
    this.height = height;
  }

  /**
   * Write to file.
   *
   * @param svg the svg
   * @throws IOException the io exception
   */
  public void writeToFile(String svg) throws IOException {
    BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
    writer.write(svg);
    writer.close();
  }

  /**
   * Convert to svg.
   *
   * @param snapKeys the snap keys
   * @throws IOException the io exception
   */
  public void convertToSVG(ArrayList<Snapshot> snapKeys) throws IOException {
    StringBuilder svg = new StringBuilder();
    svg.append("<!DOCTYPE html>\n");
    svg.append("<html>\n");
    svg.append("<head>\n");
    svg.append("<style>\n");
    svg.append(".snapshot {\n");
    svg.append("\tborder: 5px solid red;\n");
    svg.append("\tmargin-bottom: 10px;\n");
    svg.append("background-color: lightblue\n");
    svg.append("}\n");
    svg.append("</style>\n");
    svg.append("</head>\n");
    svg.append("<body>\n");


    for (Snapshot snapshot : snapKeys) {
      svg.append("<div class=\"snapshot\">\n");
      svg.append("<h2>" + snapshot.getSnapshotID() + "</h2>\n");
      svg.append("<h2>" + snapshot.getDescription() + "</h2>\n");
      svg.append("<svg width='" + width + "' height='" + height + "'>\n");

      for (IShape shape : snapshot.getShapes()) {
        svg.append(getSVG(shape));
      }
      svg.append("</svg>\n");
      svg.append("</div>\n");
    }

    this.writeToFile(svg.toString());
  }

  /**
   * Gets svg.
   *
   * @param shape the shape
   * @return the svg
   */
  public String getSVG(IShape shape) {
    String svgShape = "";
    if (shape instanceof Rectangle) {
      svgShape = constructRectangle(shape, (int) shape.getXCoord(), (int) shape.getYCoord(),
              (int) ((Rectangle) shape).getWidth(), (int) ((Rectangle) shape).getHeight(), shape.getColor()).toString();
    } else if (shape instanceof Oval) {
      svgShape = constructOval(
              shape, (int) shape.getXCoord(), (int) shape.getYCoord(),
              (int) ((Oval) shape).getRadiusX(), (int) ((Oval) shape).getRadiusY(), shape.getColor()).toString();
    }
    return svgShape;
  }

  /**
   * Construct rectangle string builder.
   *
   * @param shape  the shape
   * @param x      the x
   * @param y      the y
   * @param height the height
   * @param width  the width
   * @param color  the color
   * @return the string builder
   */
  public StringBuilder constructRectangle(IShape shape, int x, int y, int height, int width, Color color) {
    StringBuilder rectBuilder = new StringBuilder();
    String svgShape = "";
    svgShape = String.format("<rect x=\"%s\" y=\"%s\" width=\"%s\" height=\"%s\" fill=\"#%02x%02x%02x\" />\n",
            x,
            y,
            height,
            width,
            color.getRed(),
            color.getGreen(),
            color.getBlue());

    return rectBuilder.append(svgShape);
  }

  /**
   * Construct oval string builder.
   *
   * @param shape  the shape
   * @param x      the x
   * @param y      the y
   * @param height the height
   * @param width  the width
   * @param color  the color
   * @return the string builder
   */
  public StringBuilder constructOval(IShape shape, int x, int y, int height, int width, Color color) {

    StringBuilder ovalBuilder = new StringBuilder();
    String svgShape = "";
    svgShape = String.format("<ellipse cx=\"%s\" cy=\"%s\" rx=\"%s\" ry=\"%s\" fill=\"#%02x%02x%02x\" />\n",
            x,
            y,
            height,
            width,
            color.getRed(),
            color.getGreen(),
            color.getBlue());

    return ovalBuilder.append(svgShape);
  }

  public String getOutputFile() {
    return outputFile;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }


}
