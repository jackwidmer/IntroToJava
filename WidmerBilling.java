public class WidmerBilling {
    public static void main(String[] args) {
        computeBill(10);
        computeBill(10,7);
        computeBill(10, 7, 5);
    }

    public static void computeBill(float bookCost) {
        System.out.println("The price of one book ordered is $" + (bookCost + (bookCost * .08f)));
    }

    public static void computeBill(float bookCost, int quantityOrdered) {
        float bookCostWithTax = bookCost + (bookCost * .08f);
        System.out.println("The price for " + quantityOrdered + " books is $" + (bookCostWithTax * quantityOrdered));
    }

    public static void computeBill(float bookCost, float quantityOrdered, float couponValue) {
        float bookCostWithTax = bookCost + (bookCost * .08f);
        System.out.println("The price for " + quantityOrdered + " books with your $" + couponValue + " coupon is $" + ((bookCostWithTax * quantityOrdered) - couponValue));
    }
}