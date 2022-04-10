public class WidmerWeek6a {
    public static void main(String[] args) {
        WidmerStudent x = new WidmerStudent();
        x.setIdNumber(673468);
        x.setCreditHours(3);
        x.setNbrPoints(12);
        x.computeGPA();

        x.displayIdNumber();
        x.displayCreditHours();
        x.displayGpa();
        x.displayNbrPoints();

    }
}
