import java.util.Scanner;

public class WidmerShadyRestRoom {
    public static void main(String[] args) {
        int option;
        int option2;

        System.out.println("1 for a queen bed");
        System.out.println("2 for a king");
        System.out.println("3 for a king and a pullout couch");

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter option: ");
        option = kbd.nextInt();
        System.out.println("(1) lake view or a (2) park view");
        System.out.println("Enter 1 or 2: ");
        option2 = kbd.nextInt();
        switch (option) {
            case 1:
                System.out.println("Option: " + option + " Selected ");
                int r1 = 125 + 15;
                System.out.println(r1 + " dollars for queen");
                System.out.println(option2 + " selected an invalid option");
                break;
            case 2:
                System.out.println("Option: " + option + " Selected ");
                int r2 = 139 + 15;
                System.out.println(r2 + " dollars for king");
                System.out.println(option2 + " selected an invalid option");
                break;
            case 3:
                System.out.println("Option: " + option + " Selected ");
                int r3 = 165;
                System.out.println(r3 + " dollars for suite with king bed and a pullout couch.");
                System.out.println(option2 + " selected an invalid option");
                break;
            default:
                System.out.println("You selected an invalid option");
                System.out.println("price 0");
        }
    }
}

