package photoalbum;

import commands.ChangeNameCommand;
import commands.ChangeYRadiusCommand;
import shapes.IShape;
import shapes.Oval;
import shapes.Rectangle;
import shapes.ShapeFactory;

public class Main {

  public static void main(String[] args) {
    IShape s = new Oval(1, 2, 3, "oval", 20, 10);
    IPhoto p = new Photo();

    p.addShape(s);
    System.out.println(((Oval)p.getPhotoAlbum().get(0)).getRadiusY());
    p.setCommand(new ChangeYRadiusCommand(s));
    ChangeYRadiusCommand c = new ChangeYRadiusCommand(s);
    c.setRadiusY(15);
    p.executeCommand(c);
    ChangeNameCommand c2 = new ChangeNameCommand(s);
    c2.setName("hey");
    p.executeCommand(c2); // need to set -> then execute
//    p.removeShape(s);
    System.out.println(((Oval)p.getPhotoAlbum().get(0)).getRadiusY());
    System.out.println(((Oval)p.getPhotoAlbum().get(0)).getName());

    ShapeFactory s1 = new ShapeFactory(p);
    s1.createShape("oval", 1, 2, 3, "oval", "20 10");
    System.out.println(((Oval)p.getPhotoAlbum().get(1)).getRadiusY());

    ShapeFactory s3 = new ShapeFactory(p);
    s3.createShape("rectangle", 25, 10, 5, "rect", "25 19");
    System.out.println(((Rectangle)p.getPhotoAlbum().get(2)).getName());

    Snapshot sn = new Snapshot("ddp", (Photo) p);
//    System.out.println("Timestamp: " + sn.timestamp());
//    System.out.println("Snapshot ID: " + sn.snapshotID());
    System.out.println(sn.toString());

  }
 }
