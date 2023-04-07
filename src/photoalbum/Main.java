package photoalbum;

import java.awt.*;
import java.util.Map;

import commands.ChangeNameCommand;
import commands.ChangeXRadiusCommand;
import commands.ChangeYRadiusCommand;
import commands.GetHistoryCommand;
import commands.TakeSnapshotCommand;
import exceptions.IllegalShapeTypeException;
import shapes.IShape;
import shapes.Oval;
import shapes.Rectangle;
import shapes.ShapeFactory;

public class Main {

  public static void main(String[] args) throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IPhoto p = new Photo();
    IShape s = ShapeFactory.createShape(p,"oval", 1, 2, "blue", "oval", "20 10");

    ChangeNameCommand c2 = new ChangeNameCommand(s);
    c2.setName("hey");
    p.executeCommand(c2); // need to set -> then execute
    ChangeXRadiusCommand c3 = new ChangeXRadiusCommand(s);
    c3.setXRadius(50);
    c3.execute();
    System.out.println("x radius: " + c3.getXRadius());

    TakeSnapshotCommand snap = new TakeSnapshotCommand(p, "thx u");
    snap.execute();

    GetHistoryCommand hist = new GetHistoryCommand(p);
    hist.execute();




  }
 }
