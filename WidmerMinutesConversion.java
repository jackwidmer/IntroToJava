import java.util.Scanner;
public class WidmerMinutesConversion {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter a number of minutes:");
        int minutes = inputDevice.nextInt();

        float minToHours = minutes / 60;
        float hoursToDays = minToHours / 24;

        System.out.println(minutes + " minute(s) in hours is " + minToHours);
        System.out.println(minutes + " minute(s) in days is " + hoursToDays);
    }
}
