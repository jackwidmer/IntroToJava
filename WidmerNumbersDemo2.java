import java.util.Scanner;

public class WidmerNumbersDemo2 {
    public static void main(String[] args) {
        //Integer Variables (Obtained from user)
        Scanner getNumberOne = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int numberOne = getNumberOne.nextInt();
        Scanner getNumberTwo = new Scanner(System.in);
        System.out.println("Please enter your second number: ");
        int numberTwo = getNumberTwo.nextInt();
        //Doubling the integers
        int doubleOne = numberOne * 2;
        int doubleTwo = numberTwo * 2;
        //Adding five to the integers
        int onePlusFive = numberOne + 5;
        int twoPlusFive = numberTwo + 5;
        //Squaring the integers
        int oneSquared = numberOne * numberOne;
        int twoSquared = numberTwo * numberTwo;
        //Calling the methods
        displayTwiceTheNumber(doubleOne, doubleTwo);
        displayNumberPlusFive(onePlusFive, twoPlusFive);
        displayNumberSquared(oneSquared, twoSquared);
    }
    //Doubling Method
    public static void displayTwiceTheNumber(int doubleOne, int doubleTwo) {

        System.out.println("Number One doubled is: " + doubleOne);
        System.out.println("Number Two doubled is: " + doubleTwo);

    }
    //Adding Five Method
    public static void displayNumberPlusFive(int onePlusFive, int twoPlusFive){
        System.out.println("Number One plus five is: " + onePlusFive);
        System.out.println("Number Two plus five is: " + twoPlusFive);
    }
    //Squaring Method
    public static void displayNumberSquared(int oneSquared, int twoSquared){
        System.out.println("Number One squared is: " + oneSquared);
        System.out.println("Number Two squared is: " + twoSquared);
    }
}
