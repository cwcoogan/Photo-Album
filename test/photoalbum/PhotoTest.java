package photoalbum;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.Map;

import commands.ChangeColorCommand;
import commands.ChangeHeightCommand;
import commands.ChangeNameCommand;
import commands.ChangeWidthCommand;
import commands.ChangeXRadiusCommand;
import commands.ChangeYRadiusCommand;
import commands.GetHistoryCommand;
import commands.TakeSnapshotCommand;
import exceptions.IllegalShapeTypeException;
import shapes.IShape;
import shapes.ShapeFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * The type Photo test.
 */
public class PhotoTest {
  /**
   * The P.
   */
  IPhoto p = new Photo();
  /**
   * The S.
   */
  IShape s;
  /**
   * The R.
   */
  IShape r;
  /**
   * The Rect.
   */
  ShapeFactory rect;
  /**
   * The Ov.
   */
  ShapeFactory ov;
  /**
   * The Snap.
   */
  TakeSnapshotCommand snap = new TakeSnapshotCommand(p, "thx u");


  /**
   * Sets up.
   *
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  @Before
  public void setUp() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    s = ShapeFactory.createShape(p, "oval", 1, 2, "blue", "oval", "20 10");
    p.executeCommand(snap);

  }

  /**
   * Test create shape.
   *
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  @Test
  public void testCreateShape() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape oval = ShapeFactory.createShape(p, "oval", 1, 2, "blue", "newShape", "20 10");
    assertEquals("newShape", oval.getName());
    assertEquals(1, oval.getXCoord(), 0.01);
    assertEquals(2, oval.getYCoord(), 0.01);
    assertEquals(Color.BLUE, oval.getColor());
  }

  /**
   * Test add null shape type.
   *
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  @Test(expected = IllegalShapeTypeException.class)
  public void testAddNullShapeType() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape o = ShapeFactory.createShape(p, "trapezoid", 1, 2, "blue", "oval", "20 10");
  }

  /**
   * Test add null shape type two.
   *
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  @Test(expected = IllegalShapeTypeException.class)
  public void testAddNullShapeTypeTwo() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape o = ShapeFactory.createShape(p, "Banana", 1, 2, "blue", "oval", "20 10");
  }

  /**
   * Test add empty name.
   *
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  @Test(expected = IllegalShapeTypeException.class)
  public void testAddEmptyName() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape ov = ShapeFactory.createShape(p, " ", 1, 2, "blue", "noName!!", "20 10");
  }

  /**
   * Test change name command.
   *
   * @throws NoSuchFieldException   the no such field exception
   * @throws IllegalAccessException the illegal access exception
   */
  @Test
  public void testChangeNameCommand() throws NoSuchFieldException, IllegalAccessException {
    ChangeNameCommand c2 = new ChangeNameCommand(s);
    c2.setName("I am an oval");
    p.executeCommand(c2); // need to set -> then execute
    assertEquals("I am an oval", s.getName());
  }

  /**
   * Test change name command two.
   *
   * @throws NoSuchFieldException   the no such field exception
   * @throws IllegalAccessException the illegal access exception
   */
  @Test
  public void testChangeNameCommandTwo() throws NoSuchFieldException, IllegalAccessException {
    ChangeNameCommand c2 = new ChangeNameCommand(s);
    c2.setName("I am not an oval");
    p.executeCommand(c2);
    assertEquals("I am not an oval", s.getName());
  }

  /**
   * Test change color command.
   *
   * @throws NoSuchFieldException   the no such field exception
   * @throws IllegalAccessException the illegal access exception
   */
  @Test
  public void testChangeColorCommand() throws NoSuchFieldException, IllegalAccessException {
    ChangeColorCommand c2 = new ChangeColorCommand(s);
    c2.setColor("red");
    p.executeCommand(c2);
    assertEquals(Color.RED, s.getColor());
  }

  /**
   * Test change color command two.
   *
   * @throws NoSuchFieldException   the no such field exception
   * @throws IllegalAccessException the illegal access exception
   */
  @Test
  public void testChangeColorCommandTwo() throws NoSuchFieldException, IllegalAccessException {
    ChangeColorCommand c2 = new ChangeColorCommand(s);
    c2.setColor("green");
    p.executeCommand(c2);
    assertEquals(Color.GREEN, s.getColor());
  }

  /**
   * Test change x coord.
   */
  @Test
  public void testChangeXCoord() {
    assertEquals(1, s.getXCoord(), 0.01);
    s.setXCoord(5);
    assertEquals(5, s.getXCoord(), 0.01);
  }

  /**
   * Test change y coord.
   */
  @Test
  public void testChangeYCoord() {
    s.setXCoord(10);
    assertEquals(10, s.getXCoord(), 0.01);
  }

  /**
   * Test change x radius command.
   *
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  @Test
  public void testChangeXRadiusCommand() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape oval = ShapeFactory.createShape(p, "oval", 1, 2, "blue", "newShape", "20 10");
    ChangeXRadiusCommand c2 = new ChangeXRadiusCommand(oval);
    c2.setXRadius(50);
    c2.execute();
    assertEquals(50, c2.getXRadius(), 0.01);
  }

  /**
   * Test change y radius command.
   *
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  @Test
  public void testChangeYRadiusCommand() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape oval = ShapeFactory.createShape(p, "oval", 1, 2, "blue", "newShape", "20 10");
    ChangeYRadiusCommand c2 = new ChangeYRadiusCommand(oval);
    c2.setRadiusY(120);
    c2.execute();
    assertEquals(120, c2.getRadius(), 0.01);
  }

  /**
   * Test change width command.
   *
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  @Test
  public void testChangeWidthCommand() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape rect = ShapeFactory.createShape(p, "rectangle", 1, 2, "blue", "newShape", "20 10");
    ChangeWidthCommand c2 = new ChangeWidthCommand(rect);
    c2.setWidth(25);
    c2.execute();
    assertEquals(25, c2.getWidth(), 0.01);
  }

  /**
   * Test change height command.
   *
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  @Test
  public void testChangeHeightCommand() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape rect = ShapeFactory.createShape(p, "rectangle", 1, 2, "blue", "newShape", "20 10");
    ChangeHeightCommand c2 = new ChangeHeightCommand(rect);
    c2.setHeight(45);
    c2.execute();
    assertEquals(45, c2.getHeight(), 0.01);
  }

  /**
   * Take snap shot command.
   */
  @Test
  public void takeSnapShotCommand() {
    TakeSnapshotCommand snap = new TakeSnapshotCommand(p, "thx u");
    snap.execute();
    assertEquals(1, p.getPhotoAlbum().size());
  }

  /**
   * Test get history command.
   */
  @Test
  public void testGetHistoryCommand() {
    GetHistoryCommand hist = new GetHistoryCommand(p);
    hist.execute();
    assertEquals(1, p.getHistory().size());
  }

  /**
   * Test remove shape.
   */
  @Test
  public void testRemoveShape() {
    p.removeShape(s);
    assertEquals(0, p.getPhotoAlbum().size());
  }

  /**
   * Test bad height.
   *
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  @Test(expected = IllegalArgumentException.class)
  public void testBadHeight() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape rect = ShapeFactory.createShape(p, "rectangle", 1, 2, "blue", "newShape", "20 10");
    ChangeHeightCommand c2 = new ChangeHeightCommand(rect);
    c2.setHeight(-45);
    c2.execute();
  }

  /**
   * Test bad width.
   *
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  @Test(expected = IllegalArgumentException.class)
  public void testBadWidth() throws IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
    IShape rect = ShapeFactory.createShape(p, "rectangle", 1, 2, "blue", "newShape", "20 10");
    ChangeWidthCommand c2 = new ChangeWidthCommand(rect);
    c2.setWidth(-45);
    c2.execute();
  }

  /**
   * Test print snap shot id.
   *
   * @throws NoSuchFieldException   the no such field exception
   * @throws IllegalAccessException the illegal access exception
   */
  @Test
  public void testPrintSnapShotID() throws NoSuchFieldException, IllegalAccessException {
    Map<Snapshot, String> snapshot = p.getHistory();
    for (Map.Entry<Snapshot, String> entry : snapshot.entrySet()) {
      assertTrue(entry.getKey().getSnapshotID().contains("2023-04-07"));
    }
  }

  /**
   * Test print time stamp.
   *
   * @throws NoSuchFieldException   the no such field exception
   * @throws IllegalAccessException the illegal access exception
   */
  @Test
  public void testPrintTimeStamp() throws NoSuchFieldException, IllegalAccessException {
    Map<Snapshot, String> snapshot = p.getHistory();
    for (Map.Entry<Snapshot, String> entry : snapshot.entrySet()) {
      assertTrue(entry.getKey().getTimestamp().contains("07-04-2023"));
    }
  }

  /**
   * Test get description.
   */
  @Test
  public void testGetDescription() {
    Map<Snapshot, String> snapshot = p.getHistory();
    for (Map.Entry<Snapshot, String> entry : snapshot.entrySet()) {
      assertTrue(entry.getKey().getDescription().contains("thx u"));
    }
  }

  /**
   * Test multiple commands.
   *
   * @throws NoSuchFieldException   the no such field exception
   * @throws IllegalAccessException the illegal access exception
   */
  @Test
  public void testMultipleCommands() throws NoSuchFieldException, IllegalAccessException {
    ChangeNameCommand c2 = new ChangeNameCommand(s);
    c2.setName("I am an oval");
    p.executeCommand(c2);
    assertEquals("I am an oval", s.getName());
    ChangeColorCommand c3 = new ChangeColorCommand(s);
    c3.setColor("red");
    p.executeCommand(c3);
    assertEquals(Color.RED, s.getColor());
    ChangeXRadiusCommand c4 = new ChangeXRadiusCommand(s);
    c4.setXRadius(50);
    p.executeCommand(c4);
    assertEquals(50, c4.getXRadius(), 0.01);
    ChangeYRadiusCommand c5 = new ChangeYRadiusCommand(s);
    c5.setRadiusY(120);
    p.executeCommand(c5);
    assertEquals(120, c5.getRadius(), 0.01);
  }
}

