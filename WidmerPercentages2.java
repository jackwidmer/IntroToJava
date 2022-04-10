import java.util.Scanner;

public class WidmerPercentages2 {
    public static void main(String[] args) {
        //integers
        Scanner getFirstNumber = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int firstNumber = getFirstNumber.nextInt();

        Scanner getSecondNumber = new Scanner(System.in);
        System.out.println("Please enter your second number: ");
        int secondNumber = getSecondNumber.nextInt();
        //percentages
        int firstPercentage = (firstNumber * 100) / secondNumber;
        int secondPercentage = (secondNumber * 100) / firstNumber;
        //Calling the method
        computePercentage(firstPercentage, secondPercentage, firstNumber, secondNumber);
    }
    //computePercentage Method
    public static void computePercentage(int firstPercentage, int secondPercentage, int firstNumber, int secondNumber){
        System.out.println(firstNumber + " is " + firstPercentage + " percent of " + secondNumber);
        System.out.println(secondNumber + " is " + secondPercentage + " percent of " + firstNumber);
    }
}