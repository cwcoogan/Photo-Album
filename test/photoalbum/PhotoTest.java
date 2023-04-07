package photoalbum;

import org.junit.Before;
import org.junit.Test;

import shapes.IShape;
import shapes.Oval;
import shapes.Rectangle;

import static org.junit.Assert.assertEquals;

public class PhotoTest {
  IPhoto p;
  IShape o;
  IShape r;


  @Before
  public void setUp() {
    p = new Photo();
    o = new Oval(15, 20, 2.0, "o", 20, 15);
    r = new Rectangle(10, 20, 17, "r", 29, 32);
    p.addShape(o);
    p.addShape(r);
  }

//  @Test
//  public void setCommand() {
//    // how to test this?
//
//  }
//
//  @Test
//  public void executeCommand() {
//    // how to test this?
//  }

  @Test
  public void testAddShape() {
    p.addShape(o);
    assertEquals(3, p.getPhotoAlbum().size());
  }

  @Test
  public void testAddMultipleShapes() {
    IPhoto photo = new Photo();
    IShape oval = new Oval(10, 20, 30, "ff", 10, 50);
    IShape Rect = new Rectangle(10, 20, 30, "ff", 10, 50);
    IShape ov2 = new Oval(10, 20, 30, "ff", 10, 50);
    IShape ov3 = new Oval(10, 20, 30, "ff", 10, 50);
    IShape ov4 = new Oval(10, 20, 30, "ff", 10, 50);
    photo.addShape(oval);
    photo.addShape(Rect);
    photo.addShape(ov2);
    photo.addShape(ov3);
    photo.addShape(ov4);
    assertEquals(photo.getPhotoAlbum().size(), 5);
  }

  @Test
  public void testRemoveShape() {
    p.removeShape(o);
    assertEquals(1, p.getPhotoAlbum().size());
  }

  @Test
  public void testRemoveMultipleShapes() {
    IPhoto photo = new Photo();
    IShape oval = new Oval(10, 20, 30, "ff", 10, 50);
    IShape Rect = new Rectangle(10, 20, 30, "ff", 10, 50);
    IShape ov2 = new Oval(10, 20, 30, "ff", 10, 50);
    IShape ov3 = new Oval(10, 20, 30, "ff", 10, 50);
    IShape ov4 = new Oval(10, 20, 30, "ff", 10, 50);
    photo.addShape(oval);
    photo.addShape(Rect);
    photo.addShape(ov2);
    photo.addShape(ov3);
    photo.addShape(ov4);
    photo.removeShape(oval);
    photo.removeShape(Rect);
    photo.removeShape(ov2);
    photo.removeShape(ov3);
    assertEquals(photo.getPhotoAlbum().size(), 1);
  }

  @Test
  public void testGetPhotoAlbum() {
    assertEquals(p.getPhotoAlbum().get(0), o);
    assertEquals(p.getPhotoAlbum().get(1), r);
    assertEquals(p.getPhotoAlbum().size(), 2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAddNullShape() {
    p.addShape(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testRemoveNullShape() {
    p.removeShape(null);
  }
}






