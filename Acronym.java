import java.util.Scanner;

public class Acronym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first string: ");
        String words1 = input.nextLine();
        System.out.println("Please enter your second string: ");
        String words2 = input.nextLine();
        System.out.println("Please enter your third string: ");
        String words3 = input.nextLine();

        words1 = words1.toUpperCase();
        words2 = words2.toUpperCase();
        words3 = words3.toUpperCase();

        System.out.println(words1.charAt(0));
        System.out.println(words2.charAt(0));
        System.out.println(words3.charAt(0));
    }
}
