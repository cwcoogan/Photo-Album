package photoalbum;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import commands.ChangeColorCommand;
import commands.ChangeNameCommand;
import commands.ChangeWidthCommand;
import commands.ChangeXRadiusCommand;
import exceptions.IllegalShapeTypeException;
import shapes.IShape;
import shapes.Oval;
import shapes.Rectangle;
import shapes.ShapeFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PhotoTest {
  IPhoto p;
  IShape s;
  IShape r;
  ShapeFactory rect;
  ShapeFactory ov;


  @Before
  public void setUp() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    p = new Photo();
    s = ShapeFactory.createShape(p, "oval", 1, 2, "blue", "oval", "20 10");
  }

  @Test
  public void testCreateShape() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape oval = ShapeFactory.createShape(p, "oval", 1, 2, "blue", "newShape", "20 10");
    assertEquals("newShape", oval.getName());
    assertEquals(1, oval.getXCoord(), 0.01);
    assertEquals(2, oval.getYCoord(), 0.01);
    assertEquals(Color.BLUE, oval.getColor());
  }

  @Test (expected = IllegalShapeTypeException.class)
  public void testAddNullShapeType() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape o = ShapeFactory.createShape(p, "trapezoid", 1, 2, "blue", "oval", "20 10");
  }

  @Test (expected = IllegalShapeTypeException.class)
  public void testAddNullShapeTypeTwo() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape o = ShapeFactory.createShape(p, "Banana", 1, 2, "blue", "oval", "20 10");
  }

  @Test (expected = IllegalShapeTypeException.class)
  public void testAddEmptyName() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape ov = ShapeFactory.createShape(p, " ", 1, 2, "blue", "noName!!", "20 10");
  }

  @Test
  public void testChangeNameCommand() throws NoSuchFieldException, IllegalAccessException {
    ChangeNameCommand c2 = new ChangeNameCommand(s);
    c2.setName("I am an oval");
    p.executeCommand(c2); // need to set -> then execute
    assertEquals("I am an oval", s.getName());
  }

  @Test
  public void testChangeNameCommandTwo() throws NoSuchFieldException, IllegalAccessException {
    ChangeNameCommand c2 = new ChangeNameCommand(s);
    c2.setName("I am not an oval");
    p.executeCommand(c2);
    assertEquals("I am not an oval", s.getName());
  }
  @Test
  public void testChangeColorCommand() throws NoSuchFieldException, IllegalAccessException {
    ChangeColorCommand c2 = new ChangeColorCommand(s);
    c2.setColor("red");
    p.executeCommand(c2);
    assertEquals(Color.RED, s.getColor());
  }

  @Test
  public void testChangeColorCommandTwo() throws NoSuchFieldException, IllegalAccessException {
    ChangeColorCommand c2 = new ChangeColorCommand(s);
    c2.setColor("green");
    p.executeCommand(c2);
    assertEquals(Color.GREEN, s.getColor());
  }

  @Test
  public void testChangeXCoord() {
    assertEquals(1, s.getXCoord(), 0.01);
    s.setXCoord(5);
    assertEquals(5, s.getXCoord(), 0.01);
  }

  @Test
  public void testChangeYCoord() {
    s.setXCoord(10);
    assertEquals(10, s.getXCoord(), 0.01);
  }


}
//
//  @Test
//  public void executeCommand() {
//    // how to test this?
//  }

//  @Test
//  public void testAddShape() {
//    p.addShape(o);
//    assertEquals(3, p.getPhotoAlbum().size());
//  }
//
//  @Test
//  public void testAddMultipleShapes() {
//    IPhoto photo = new Photo();
//    IShape oval = new Oval(10, 20, 30, "ff", 10, 50);
//    IShape Rect = new Rectangle(10, 20, 30, "ff", 10, 50);
//    IShape ov2 = new Oval(10, 20, 30, "ff", 10, 50);
//    IShape ov3 = new Oval(10, 20, 30, "ff", 10, 50);
//    IShape ov4 = new Oval(10, 20, 30, "ff", 10, 50);
//    photo.addShape(oval);
//    photo.addShape(Rect);
//    photo.addShape(ov2);
//    photo.addShape(ov3);
//    photo.addShape(ov4);
//    assertEquals(photo.getPhotoAlbum().size(), 5);
//  }
//
//  @Test
//  public void testRemoveShape() {
//    p.removeShape(o);
//    assertEquals(1, p.getPhotoAlbum().size());
//  }
//
//  @Test
//  public void testRemoveMultipleShapes() {
//    IPhoto photo = new Photo();
//    IShape oval = new Oval(10, 20, 30, "ff", 10, 50);
//    IShape Rect = new Rectangle(10, 20, 30, "ff", 10, 50);
//    IShape ov2 = new Oval(10, 20, 30, "ff", 10, 50);
//    IShape ov3 = new Oval(10, 20, 30, "ff", 10, 50);
//    IShape ov4 = new Oval(10, 20, 30, "ff", 10, 50);
//    photo.addShape(oval);
//    photo.addShape(Rect);
//    photo.addShape(ov2);
//    photo.addShape(ov3);
//    photo.addShape(ov4);
//    photo.removeShape(oval);
//    photo.removeShape(Rect);
//    photo.removeShape(ov2);
//    photo.removeShape(ov3);
//    assertEquals(photo.getPhotoAlbum().size(), 1);
//  }
//
//  @Test
//  public void testGetPhotoAlbum() {
//    assertEquals(p.getPhotoAlbum().get(0), o);
//    assertEquals(p.getPhotoAlbum().get(1), r);
//    assertEquals(p.getPhotoAlbum().size(), 2);
//  }
//
//  @Test(expected = IllegalArgumentException.class)
//  public void testAddNullShape() {
//    p.addShape(null);
//  }
//
//  @Test(expected = IllegalArgumentException.class)
//  public void testRemoveNullShape() {
//    p.removeShape(null);
//  }
//}






