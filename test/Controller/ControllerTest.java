package Controller;

import org.junit.Before;
import org.junit.Test;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import Model.Snapshot;
import shapes.IShape;

import static org.junit.Assert.*;

/**
 * The type Controller test.
 */
public class ControllerTest {
  private IController contr;


  /**
   * Sets up.
   */
  @Before
  public void setUp() {
    contr = new Controller("input.txt", "output.html", "web", 800, 800);
  }

  /**
   * Test good constructor.
   */
  @Test
  public void testGoodConstructor() {
    Controller contr = new Controller("input.txt", "output.html", "web", 800, 800);
    assertEquals("input.txt", contr.getInputFile());
    assertEquals("output.html", contr.getOutputFile());
    assertEquals(0, contr.getXmax());
    assertEquals(0, contr.getYmax());
  }


  /**
   * Test controller instantiate graphical view.
   */
  @Test
  public void testControllerInstantiateGraphicalView() {
    Controller contr = new Controller("input.txt", "output.html", "graphical", 800, 800);
    assertEquals("input.txt", contr.getInputFile());
    assertEquals("output.html", contr.getOutputFile());
    assertEquals(0, contr.getXmax());
    assertEquals(0, contr.getYmax());
  }

  /**
   * Test controller instantiate web view.
   */
  @Test
  public void testControllerInstantiateWebView() {
    Controller contr = new Controller("input.txt", "output.html", "web", 800, 800);
    assertEquals("input.txt", contr.getInputFile());
    assertEquals("output.html", contr.getOutputFile());
    assertEquals(0, contr.getXmax());
    assertEquals(0, contr.getYmax());
  }

  /**
   * Test correct arguments.
   */
  @Test
  public void testCorrectArguments() {
    Controller contr = new Controller("input.txt", "output.html", "web", 800, 800);
    assertEquals("input.txt", contr.getInputFile());
    assertEquals("output.html", contr.getOutputFile());
    assertEquals(0, contr.getXmax());
    assertEquals(0, contr.getYmax());
  }
}
