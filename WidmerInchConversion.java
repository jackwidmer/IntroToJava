import java.util.Scanner;

public class WidmerInchConversion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a value in inches >>");
        int inches = keyboard.nextInt();
        System.out.println("You entered: " + inches + " inch(es)");

        float feet = computeFeet(inches);
        System.out.println("That's " + feet + " feet!");

        float yards = computeYards(inches);
        System.out.println("And " + yards + " yards!");
    }

    private static float computeFeet(float inches) {
        float f = inches / 12;
        return f;
    }
    private static float computeYards(float inches) {
        float y = inches / 36;
        return y;
    }
}
