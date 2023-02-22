package homework6.dataType;

import java.util.Random;

public class ListOfMethods {
    void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    void checkSumSign(int a, int b) {
        if ((a + b) >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    void printColor(int value) {
        if (value <= 0) {
            System.out.println("red");
        } else if (value >= 100) {
            System.out.println("yellow");
        } else {
            System.out.println("green");
        }
    }

    void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public boolean sumTenFromTwenty(int a, int b) {
        if (((a + b) > 10) && ((a + b) <= 20)) {
            return true;
        }
        return false;
    }

    void checkPositiveNumber(int number) {
        if (number >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

    }

    public boolean checkNegativeNumber(int number) {
        if (number < 0) {
            return true;
        }
        return false;
    }

    void printStringFromNumber(String str, int number) {
        for (int j = 0; j < number; j++) {
            System.out.println(str);
        }

    }

    public boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
