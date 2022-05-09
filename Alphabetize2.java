import java.util.Scanner;
import java.util.Arrays;
public class Alphabetize2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first string: ");
        String words1 = input.nextLine();
        System.out.println("Please enter your second string: ");
        String words2 = input.nextLine();
        System.out.println("Please enter your third string: ");
        String words3 = input.nextLine();

        String[] wordsArray = {words1,words2,words3};
        Arrays.sort(wordsArray);
        System.out.println(Arrays.toString(wordsArray));
    }
}