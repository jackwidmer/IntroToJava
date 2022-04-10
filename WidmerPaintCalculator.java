import java.util.Scanner;
public class WidmerPaintCalculator {
    public static void main(String[] args) {
        int feetPerGallon = 350;
        double length, width, height;
        System.out.println("Please enter the length, width, and height of your room.");

        Scanner getLength = new Scanner(System.in);
        System.out.println("Enter Length: ");
        length = getLength.nextDouble();

        Scanner getWidth = new Scanner(System.in);
        System.out.println("Enter Width: ");
        width = getWidth.nextDouble();

        Scanner getHeight = new Scanner(System.in);
        System.out.println("Enter Height: ");
        height = getHeight.nextDouble();

        double area = computeArea(length, width, height);
        double price =  computeGallons(area);


        System.out.println("The price to paint the room is $" + price);
    }
    public static double computeArea(double length, double width, double height){

        double area = width * height;
        System.out.println("Area: " + area + " square feet.");
        return area;

    }

    private static double computeGallons(double area) {

        double gallonsNeeded = area / 100;
        System.out.println("You will need: " + gallonsNeeded + " gallons of paint.");
        double price =  gallonsNeeded * 32;
        return price;
    }

}