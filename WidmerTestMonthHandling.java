import java.time.LocalDate;

public class WidmerTestMonthHandling {
    public static void main(String[] args) {
        LocalDate jan = LocalDate.of(2022, 1, 31);
        LocalDate dec = LocalDate.of(2022, 12, 31);

        System.out.println(jan.plusMonths(1));
        System.out.println(jan.plusMonths(2));
        System.out.println(jan.plusMonths(3));

        System.out.println(dec.plusMonths(1));
        System.out.println(dec.plusMonths(2));
        System.out.println(dec.plusMonths(3));
    }
}
