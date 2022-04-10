import java.util.Scanner;
public class WidmerMileConversionsInteractive {
        public static void main(String[] args) {
            
            Scanner inputDevice = new Scanner(System.in);
            System.out.println("Please enter a number of miles:");
            int miles = inputDevice.nextInt();

            int milesToFeet = miles * 5280;
            int milesToYards = miles * 1760;


            System.out.println(miles + " mile(s) in feet is: " + milesToFeet + " feet.");
            System.out.println(miles + " mile(s) in yards is: " + milesToYards + " yards.");
    }
}
