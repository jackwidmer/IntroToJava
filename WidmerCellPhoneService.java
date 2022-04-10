import java.util.Scanner;

public class WidmerCellPhoneService {
    public static void main(String[] args) {
        int talk,text,data;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum monthly values for talk minutes used: ");
        talk= sc.nextInt();
        System.out.println("Enter number of text sent: ");
        text = sc.nextInt();
        System.out.println("Gigabytes of data used: ");
        data = sc.nextInt();

        if ( talk < 500 && text == 0 && data == 0)  {
            System.out.println("Accept  Plan A at $49 per month.");
        }

        if (talk < 500 && text > 0 && data == 0){
            System.out.println(" Accept Plan B at $55 per month.");
        }

        if (talk >= 500 && text <= 100 && data == 0){
            System.out.println("Accept Plan C for $61 per month");
        }

        if (talk >= 500 && text > 100 && data == 0){
            System.out.println("Accept Plan D for $70 per month");
        }

        if (talk >= 500 && text > 100 && (data > 0 && data < 4)){
            System.out.println("Accept Plan E for $79 per month");

        }
        if (talk >= 500 && text >= 100 && data >= 3){
            System.out.println("Accept Plan F for $79 per month");
        }
    }
}
