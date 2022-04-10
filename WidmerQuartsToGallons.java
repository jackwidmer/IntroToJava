public class WidmerQuartsToGallons {
    static final int QUARTS_IN_GALLON = 4;
    public static void main(String[] args) {
        int totalQuartsNeeded = 18;
        int gallonsNeeded = totalQuartsNeeded / QUARTS_IN_GALLON;
        int quartsNeeded = totalQuartsNeeded % QUARTS_IN_GALLON;
        System.out.println("You need " + gallonsNeeded + " gallons, and " + quartsNeeded + " quarts.");
    }
}
