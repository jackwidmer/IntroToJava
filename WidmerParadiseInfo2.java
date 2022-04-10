import java.util.Scanner;
public class WidmerParadiseInfo2 {


    public static void main(String[] args) {
        double price;
        double discount;
        double savings;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the cutoff price for discount >> ");
        price = keyboard.nextDouble();

        System.out.println("Enter the discount rate as a whole number >> ");
        discount = keyboard.nextDouble();

        savings = computeDiscountInfo(price,discount);
        System.out.println("Special this week on any service over " + price);
        System.out.println("That's a savings of at least $" + savings);

    }

    public static double computeDiscountInfo(double p1, double d1) {
        double s1 = p1 * d1 / 100;
        return s1;
    }

}
