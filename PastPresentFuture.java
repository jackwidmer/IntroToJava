//Jack Widmer
//Week 11

import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of a month (Jan=1, Feb=2, etc: ");
        int month = in.nextInt();
        System.out.println("Please enter the number of a day: ");
        int day = in.nextInt();
        System.out.println("Please enter the year: ");
        int year = in.nextInt();
        System.out.println(month + " " + day + " " + year);
        if (year == LocalDate.now().getYear()){
            System.out.println("The chosen date is this year");
            if (month == LocalDate.now().getMonthValue()){
                System.out.println("The chosen month is this month");
            }
            else if (month < LocalDate.now().getMonthValue()){
                System.out.println("The chosen month is earlier than this month");
            }
            else if (month > LocalDate.now().getMonthValue()){
                System.out.println("The chosen month is later than this month");
            }
        }
        else {
            System.out.println("The chosen date is NOT this year");
        }
    }
}
