import java.util.Scanner;
public class WidmerBookstoreCredit {
    public static void main(String[] args) {
        Scanner getName = new Scanner(System.in);
        System.out.println("Enter your name >>");
        String Name = getName.nextLine();

        Scanner getGPA = new Scanner(System.in);
        System.out.println("Enter your GPA >> ");
        float GPA = getGPA.nextFloat();

        int storeCredit = computeStoreCredit(GPA);
        System.out.println("Student: " + Name);
        System.out.println("GPA: " + GPA);
        System.out.println("Your store credit award is $" + storeCredit + "!");
    }

    private static int computeStoreCredit(float gpa) {
        float g = gpa * 10;
        return (int) g;
    }
}
