package View;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Model.IPhoto;
import Model.Photo;
import commands.ChangeColorCommand;
import commands.ChangeHeightCommand;
import commands.ChangeWidthCommand;
import commands.ChangeXRadiusCommand;
import commands.ChangeYRadiusCommand;
import commands.MoveCoordsCommand;
import commands.RemoveShapeCommand;
import commands.TakeSnapshotCommand;
import exceptions.IllegalShapeTypeException;
import shapes.IShape;
import shapes.ShapeFactory;

public class ParseData implements IParseData {
  private String commandType;
  private double x;
  private double y;
  private double height;
  private double width;
  private int red;
  private int green;
  private int blue;
  private String name;
  private String type;
  private String description;
  private IPhoto model;

  public ParseData(String data, IPhoto model) throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    this.model = model;
    String[] getData = data.trim().split("\\s+");
    this.commandType = (getData[0]);

    switch(commandType.toLowerCase()){
      case "snapshot":
        description = data.replace(commandType, "");
        this.model.executeCommand(new TakeSnapshotCommand(model, description));
        break;
      case "move":
        this.name = getData[1];
        this.x = Double.parseDouble((getData[2]));
        this.y = Double.parseDouble((getData[3]));
        this.model.executeCommand(new MoveCoordsCommand(this.model.getShapeFromName(name), x, y));
        break;
      case "shape":
        this.name = getData[1];
        this.type = getData[2];

        this.x = Double.parseDouble((getData[3]));
        this.y = Double.parseDouble((getData[4]));
        this.width = Double.parseDouble((getData[5]));
        this.height = Double.parseDouble((getData[6]));
        this.red = Integer.parseInt((getData[7]));
        this.green = Integer.parseInt((getData[8]));
        this.blue = Integer.parseInt((getData[9]));
        ShapeFactory.createShape(model, type, x, y, new Color(red, green, blue), name, width + "," + height);
        break;
      case "resize":
        this.name = getData[1];
        IShape shape = this.model.getShapeFromName(name);
        this.width = Double.parseDouble(getData[2]);
        this.height = Double.parseDouble(getData[3]);
        switch (shape.getClass().getSimpleName().toLowerCase()) {
          case "rectangle":
            this.model.executeCommand(new ChangeWidthCommand(shape, width));
            this.model.executeCommand(new ChangeHeightCommand(shape, height));
            break;
          case "oval":
            this.model.executeCommand(new ChangeXRadiusCommand(shape, width));
            this.model.executeCommand(new ChangeYRadiusCommand(shape, height));
            break;
        }
        break;
      case "color":
        this.name = getData[1];
        this.red = Integer.parseInt((getData[2]));
        this.green = Integer.parseInt((getData[3]));
        this.blue = Integer.parseInt((getData[4]));
        this.model.executeCommand(new ChangeColorCommand(this.model.getShapeFromName(name), new Color(red, green, blue)));
        break;
      case "remove":
        this.name = getData[1];
        this.model.executeCommand(new RemoveShapeCommand(this.model.getShapeFromName(name), model));
        break;

    }

  }



  public String getCommandType() {
    return commandType;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getHeight() {
    return height;
  }

  public double getWidth() {
    return width;
  }

  @Override
  public void setSnapshot(boolean b) {

  }

  public int getRed() {
    return red;
  }

  public int getGreen() {
    return green;
  }

  public int getBlue() {
    return blue;
  }

  public String getType() {
    return type;
  }

  @Override
  public String toString() {
           return
            "command='" + commandType + '\'' +
            ", x=" + x +
            ", y=" + y +
            ", height=" + height +
            ", width=" + width +
            ", red=" + red +
            ", green=" + green +
            ", blue=" + blue +
            ", type='" + type + '\'';

  }
}
