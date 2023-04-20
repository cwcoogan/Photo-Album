package View;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HTMLViewTest {
  private HTMLView view;

  @Before
  public void setUp() {
    view = new HTMLView("testOutput.html", 800, 800);
  }

  @Test
  public void testWriteToFile() {
    String outputFile = "testOutput.html";
    String svg = "";

  }





}