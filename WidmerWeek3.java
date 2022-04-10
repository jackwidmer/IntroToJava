import java.util.Scanner;

public class WidmerWeek3 {
    public static void main(String[] args) {
        //long method
        long muskDollar = 869543215456L;
        long gatesDollar = 4513164579578954L;
        System.out.println(muskDollar);
        System.out.println(gatesDollar);

        //int and byte method
        int age = 20;
        System.out.println(age + " is the integer age");
        byte newAge = (byte) age;
        System.out.println(newAge + " is the byte age");

        //boolean method
        boolean isMinor = (age < 21);
        System.out.println(isMinor);

        //getting input
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter your name below:");
        String name = inputDevice.nextLine();
        System.out.println(name);

        System.out.println("Please enter your age below:");
        age = inputDevice.nextInt();
        System.out.println("Your age is: " + age);
    }
}
