import java.util.Scanner;

public class AcmePay {
    public static void main(String[] args) {
        float firstShift = 17F;
        float secondShift = 18.50F;
        float thirdShift = 22F;
        float pay = 0F;
        float overtime = 0;
        float overtimeHours = 0F;
        float overtimePay = pay * 1.5f;
        float retirementPay = pay - (pay * .03F);
        float netPay;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the hours worked: ");
        int hours = in.nextInt();
        System.out.println("Please enter the shift (1, 2, or 3): ");
        int shift = in.nextInt();
        System.out.println("Did you elect to participate in the retirement plan? y/n: ");
        String getRetirement = in.next();

        if (shift == 1) {
            if (hours > 40) {
                overtimeHours = hours - 40F;
                overtime = overtimePay * overtimeHours;
                System.out.println("Overtime pay: $25.5");
                System.out.println("Overtime Total: " + overtime);
            }
            if (getRetirement == "y") {
                System.out.println("Retirement Deduction: " + (pay - retirementPay) * hours);
            } else {
                System.out.println("You did not opt-in to the retirement program");
            }
                pay = firstShift;
                netPay = (pay * hours) + overtime;
                System.out.println("You worked: " + hours + " hours");
                System.out.println("You selected: First Shift");
                System.out.println("Hourly Rate: $17");
                System.out.println("Regular pay: " + pay);
                System.out.println("Regular Total: " + pay * hours);



                System.out.println("NetPay: " + netPay);
        }
    }
}
