public class WidmerWeek2 {
    /**
     * the name variable will contain your legal name
     */
    static final String COMPANY = "Ridgewater College";
    static String name = "Jack Widmer";
    public static void main(String[] args) {
        byte index; //-128 to 127
        short temp = 24; // -32768 to 32767
        int savings; // -2 billion to 2 billion
        long debt; // gazillion
        float humidity; // 6-7 digits of precision
        double heart; // 15 digits of precision
        char firstInitial = 'J'; // A single character, use single quotes
        String first = "Jack", last = "Widmer";
        String lastInitial = "R";
        System.out.println("Hello this is " + name);
        System.out.println(458);
        index = 45;
        System.out.println(COMPANY);
        System.out.println(index);
        System.out.println(temp);
        System.out.println(firstInitial);
        lastInitial = "toad";
        boolean status = true;
        status = false;
        System.out.println("My name is " + first + " " + last + index);
        byte x = 2;
        byte y = x;
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        x = 7;
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);

    }
}
