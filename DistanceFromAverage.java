import java.util.Arrays;
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ui;
        double[] nbrArray = new double[15];
        double sum = 0;
        double average = 0;
        int i = 0;
        for (i = 0; i < nbrArray.length; i++) {
            System.out.println("Please enter an integer or 99999 to quit");
            ui = scanner.nextDouble();
            if (ui == 99999) {
                if (i == 0) {
                    System.out.println("You didn't enter any values you FOOL");
                }
                break;
            } else {
                sum = sum + ui;
                nbrArray[i] = ui;
                System.out.println("You have entered: " + ui);
            }
        }
        System.out.println("_____________________________");
        average = sum / i;
        for (int i2 = 0; i2 < i; i2++){
            System.out.println("Entered Number is " + nbrArray[i2]);
            System.out.println("distance from average: " + Math.abs(nbrArray[i2] - average));
        }

        System.out.println("Sum: " + sum);
        System.out.println("i is: " + i);
        System.out.println("Average is: " + sum / i);
    }
}
