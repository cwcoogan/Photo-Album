package View;

import org.junit.Before;
import org.junit.Test;


import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

import Model.Snapshot;
import shapes.Oval;

import static org.junit.Assert.*;

public class HTMLViewTest {
  private HTMLView view;

  @Before
  public void setUp() {
    view = new HTMLView("testOutput.html", 800, 800);
  }

  @Test
  public void testOutputFile() {
    HTMLView htmlView = new HTMLView("output.html", 800, 600);
    assertEquals("output.html", htmlView.getOutputFile());
  }

  @Test
  public void testGoodConstructor() {
    HTMLView htmlView = new HTMLView("output.html", 800, 600);
    assertEquals("output.html", htmlView.getOutputFile());
    assertEquals(800, htmlView.getWidth());
    assertEquals(600, htmlView.getHeight());
  }

  @Test
  public void testGoodConstructorTwo() {
    HTMLView htmlView = new HTMLView("output.html", 1, 1);
    assertEquals("output.html", htmlView.getOutputFile());
    assertEquals(1, htmlView.getWidth());
    assertEquals(1, htmlView.getHeight());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBadConstructor() {
    HTMLView htmlView = new HTMLView("output.html", -800, -600);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBadConstructorTwo() {
    HTMLView htmlView = new HTMLView("output.html", 0, 0);
  }
}

