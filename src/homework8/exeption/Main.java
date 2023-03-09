package homework8.exeption;

import homework8.exeption.exeptions.ArrayDataException;
import homework8.exeption.exeptions.ArraySizeException;

public class Main {
  public static void main(String[] args) {
    String[][] array = {
        {"1", "2", "3", "4"},
        {"1", "2", "p", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"}
    };

    try {
      System.out.println(new ArrayValueCalculator().doCalc(array));
    } catch (ArrayDataException | ArraySizeException e) {
      e.printStackTrace();
    }
  }
}