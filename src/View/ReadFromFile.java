package View;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.IPhoto;
import exceptions.IllegalShapeTypeException;

/**
 * The type Read from file.
 */
public class ReadFromFile {
  /**
   * The Input file.
   */
  File inputFile;
  /**
   * The Model.
   */
  IPhoto model;

  /**
   * Instantiates a new Read from file.
   *
   * @param inputFile the input file
   * @param model     the model
   */
  public ReadFromFile(String inputFile, IPhoto model) {
    this.inputFile = new File(inputFile);
    this.model = model;
  }

  /**
   * Read file list.
   *
   * @return the list
   * @throws FileNotFoundException     the file not found exception
   * @throws IllegalShapeTypeException the illegal shape type exception
   * @throws NoSuchFieldException      the no such field exception
   * @throws IllegalAccessException    the illegal access exception
   */
  public List<IParseData> readFile() throws FileNotFoundException,
          IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {

    List<IParseData> cleanseData = new ArrayList<>();
    Scanner bufferedReader = new Scanner(inputFile);

    while (bufferedReader.hasNextLine()) {
      String line = bufferedReader.nextLine();
      if (line.startsWith("#") || line.isEmpty()) {
        continue;
      }

      IParseData parseData = new ParseData(line, model);
      cleanseData.add(parseData);
    }
    bufferedReader.close();
    return cleanseData;
  }
}