package Model;

import java.io.IOException;

import Controller.IController;
import Controller.Controller;
import exceptions.IllegalShapeTypeException;

/**
 * The type Photo album main.
 */
public class PhotoAlbumMain {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws IOException               the io exception
   */
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IllegalShapeTypeException, IOException {
    String inputFile = null;
    String viewType = null;
    String outputFile = null;
    int xmax = 1000;
    int ymax = 1000;

    if (args.length < 5) {
      System.out.println("Insufficient arguments");
      System.exit(1);
    }

    for (int i = 0; i < args.length; i++) {
      switch (args[i]) {
        case "-in":
          inputFile = args[++i];
          break;
        case "-view":
          viewType = args[++i];
          break;
        case "-out":
          outputFile = args[++i];
          break;
        default:
          xmax = Integer.parseInt(args[i]);
          ymax = Integer.parseInt(args[++i]);
          break;
      }
    }
    IController contr = new Controller(inputFile, outputFile, viewType, xmax, ymax);
    contr.run();
  }
}
