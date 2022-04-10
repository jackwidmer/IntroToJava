import java.util.Scanner;

/**
 * Jack Widmer
 * OddEven.java
 * Write an application that asks a user to enter an integer.
 * Display a statement that indicates whether the integer is even or odd.
 */
public class WidmerOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int number = in.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " is even!");
        } else{
            System.out.println(number + " is odd!");
        }
    }
}
