package photoalbum;

import commands.ChangeYRadiusCommand;
import shapes.IShape;
import shapes.Oval;

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
//    p.removeShape(s);
    System.out.println(((Oval)p.getPhotoAlbum().get(0)).getRadiusY());
  }
 }
