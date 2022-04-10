public class WidmerInchesToFeet {
    static final int INCHES = 86;
    public static void main(String[] args) {
        int inchesInAFoot = 12;
        int inchesToFeet = INCHES / 12;
        int leftoverInches = INCHES % inchesToFeet;
        System.out.println(INCHES + " inches in feet is: " + inchesToFeet + " and " + leftoverInches + " inches.");
    }
}

