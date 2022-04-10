import java.util.Scanner;
public class WidmerInchesToFeetInteractive {
    public static void main(String[] args) {

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter a number of inches:");
        int inches = inputDevice.nextInt();

        int inchesInAFoot = 12;
        int inchesToFeet = inches / 12;
        int leftoverInches = inches % inchesToFeet;


        System.out.println(inches + " inches in feet is: " + inchesToFeet + " and " + leftoverInches + " inches.");
    }
}