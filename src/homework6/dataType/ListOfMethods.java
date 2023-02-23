package homework6.dataType;

import java.util.Random;

public class ListOfMethods {
    void printThreeWords() { // переробив на 3 sout
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
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

    public boolean sumTenFromTwenty(int a, int b) { // переробив додав суму та убрав false
        int sum = a + b;
        return ((sum) > 10) && ((sum) <= 20);
    }

    void checkPositiveNumber(int number) {
        if (number >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

    }

    public boolean checkNegativeNumber(int number) {
        return number < 0;
    }

    void printStringFromNumber(String str, int number) {
        for (int j = 0; j < number; j++) {
            System.out.println(str);
        }

    }

    public boolean isLeapYear(int year) {  //переробив убрав false
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
