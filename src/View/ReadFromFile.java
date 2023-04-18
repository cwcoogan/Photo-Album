package View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Model.IPhoto;
import Model.Photo;
import exceptions.IllegalShapeTypeException;

public class ReadFromFile {
  File inputFile;
  IPhoto model;

  public ReadFromFile(String inputFile, IPhoto model) throws IOException {
    this.inputFile = new File(inputFile);
    this.model = model;
  }

  public List<IParseData> readFile() throws FileNotFoundException, IllegalShapeTypeException, NoSuchFieldException, IllegalAccessException {
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