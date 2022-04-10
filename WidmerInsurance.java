import java.util.Scanner;
public class WidmerInsurance {
    public static void main(String[] args) {
        Scanner getYear = new Scanner(System.in);
        System.out.println("Please enter the current year: ");
        int currentYear = getYear.nextInt();

        Scanner getBirthYear = new Scanner(System.in);
        System.out.println("Please enter your birth year: ");
        int birthYear = getBirthYear.nextInt();

        int decades = computeDecades(currentYear,birthYear);
        int premium = computePremium(decades);

        System.out.println("Your premium is $" + premium + "!");
    }

    private static int computeDecades(int currentYear, int birthYear) {
        int d = (currentYear - birthYear) / 10;
        return d;
    }
    private static int computePremium(int decades) {
        int p = (decades + 15) * 20;
        return p;
    }
}
