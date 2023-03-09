package homework8.exeption;

import homework8.exeption.exeptions.ArrayDataException;
import homework8.exeption.exeptions.ArraySizeException;
import java.util.Arrays;

public class ArrayValueCalculator {
  public int doCalc(String[][] array) throws ArrayDataException, ArraySizeException {
    checkCorrectSizeByArray(array, 4, 4);
    int result = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        try {
          result += Integer.parseInt(array[i][j]);
        } catch (NumberFormatException e) {
          throw new ArrayDataException(
              "Cell [" + i + "][" + j + "] contains incorrect data  --> " + array[i][j]);
        }
      }
    }
    return result;
  }

  public void checkCorrectSizeByArray(String[][] array, int row, int col)
      throws ArraySizeException {
    if (array.length == 0) {
      throw new ArraySizeException("array is empty");
    }
    for (String[] str : array) {
      if (array.length != row || str.length != col) {
        throw new ArraySizeException("incorrect array size");
      }
    }
  }
}
