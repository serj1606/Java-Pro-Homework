package homework6.dataType;

public class MainMethods {
    public static void main(String[] args) {
        ListOfMethods listOfMethods = new ListOfMethods();

        listOfMethods.printThreeWords();
        listOfMethods.checkSumSign(listOfMethods.getRandomNumber(-10, 10), listOfMethods.getRandomNumber(-5, 5));
        listOfMethods.printColor(listOfMethods.getRandomNumber(-5, 200));
        listOfMethods.compareNumbers(listOfMethods.getRandomNumber(-10, 10), listOfMethods.getRandomNumber(-5, 5));
        System.out.println(listOfMethods.sumTenFromTwenty(listOfMethods.getRandomNumber(0, 30), listOfMethods.getRandomNumber(0, 30)));
        listOfMethods.checkPositiveNumber(listOfMethods.getRandomNumber(-10, 10));
        System.out.println(listOfMethods.checkNegativeNumber(listOfMethods.getRandomNumber(-10, 10)));
        listOfMethods.printStringFromNumber("Ok google", listOfMethods.getRandomNumber(1, 5));
        System.out.println(listOfMethods.isLeapYear(listOfMethods.getRandomNumber(0, 2023)));
    }
}
