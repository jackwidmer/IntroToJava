import java.util.Scanner;

public class WidmerShadyHotel {
    public static void main(String[] args) {
        int option;

        System.out.println("1 for a queen bed");
        System.out.println("2 for a king");
        System.out.println("3 for a king and a pullout couch");

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter option: ");
        option = kbd.nextInt();

        switch (option) {
            case 1:
                System.out.println("Option: " + option + " Selected ");
                int r1 = 125;
                System.out.println(r1 + " dollars for queen");
                break;
            case 2:
                System.out.println("Option: " + option + " Selected ");
                int r2 = 139;
                System.out.println(r2 + " dollars for king");
                break;
            case 3:
                System.out.println("Option: " + option + " Selected ");
                int r3 = 165;
                System.out.println(r3 + " dollars for suite with king bed and a pullout couch.");
                break;
            default:
                System.out.println("You selected an invalid option");
                System.out.println("price 0");
        }
    }
}
