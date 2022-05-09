import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of a month (Jan=1, Feb=2, etc: ");
        int month = in.nextInt();
        System.out.println("Please enter the number of a day: ");
        int day = in.nextInt();
        System.out.println("Please enter the year: ");
        int year = in.nextInt();
        System.out.println(month + " " + day + " " + year);


        LocalDate userDate = LocalDate.of(year,month,day);
        if (userDate.equals(LocalDate.now())) {
            System.out.println("The chosen date is today's date");
        }
            else if (userDate.isBefore(LocalDate.now())){
                System.out.println("The chosen date is BEFORE the current date");
            }
            else {
                System.out.println("The chosen date is AFTER the current date");
            }
        }
    }

