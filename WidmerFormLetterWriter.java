public class WidmerFormLetterWriter {
    public static void main(String[] args) {
        displaySalutation("Johnson");
        displaySalutation("Bart", "Johnson");
    }

    public static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName);
        System.out.println("Thank you for your recent order");
    }

    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order");
    }
}