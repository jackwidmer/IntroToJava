import java.util.Scanner;
public class WidmerChiliToGo {
    public static void main(String[] args) {
        System.out.println("Huntington Boys and Girls Club Chili Fundraiser");
        System.out.println("Chili for adults is $7");
        System.out.println("Chili for children is $4");

        Scanner adults = new Scanner(System.in);
        System.out.println("Please enter a number of adults:");
        int adultMeals = adults.nextInt();

        Scanner children = new Scanner(System.in);
        System.out.println("Please enter a number of children:");
        int childMeals = children.nextInt();

        int adultPrice = 7;
        int childPrice = 4;

        int sumAdultMeals = adultMeals * adultPrice;
        int sumChildMeals = childMeals * childPrice;
        int total = sumAdultMeals + sumChildMeals;


        System.out.println("You ordered: " + adultMeals + " adult meals and " + childMeals + " children meals.");
        System.out.println("Adult total cost: $" + sumAdultMeals);
        System.out.println("Child total cost: $" + sumChildMeals);
        System.out.println("Your total is: $" + total);
        System.out.println("Thank You!");
    }
}
