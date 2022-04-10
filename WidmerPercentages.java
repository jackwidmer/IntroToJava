public class WidmerPercentages {
    public static void main(String[] args) {
        //integers
        int firstNumber = 2;
        int secondNumber = 5;
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
