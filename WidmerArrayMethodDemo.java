import java.util.Arrays;

public class WidmerArrayMethodDemo {
    public static void main(String[] args) {
        final int integerLimit = 9;
        int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Integers:");
        for (int x = 0; x <= integerLimit - 1; x++)
            System.out.println(integers[x]);

        System.out.println("Integers in reverse order:");
        for (int n = 0; n <= integerLimit - 1; n++)
            System.out.println(integers[integerLimit - (1 + n)]);

        System.out.println("Sum of the Integers: ");
        System.out.println(Arrays.stream(integers).sum());

        System.out.println("Integers less than the limit: ");
        for(int x = 0; x < integers.length; x++) {
            if(integers[x] < 9){
                System.out.println(integers[x]);
            }
        }
        System.out.println("Integers greater than the average: ");
        int average = Arrays.stream(integers).sum() / integers.length;
        for(int x = 0; x < integers.length; x++) {
            if(integers[x] > average){
                System.out.println(integers[x]);
            }
        }
    }
}
