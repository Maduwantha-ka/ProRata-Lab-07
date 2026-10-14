import java.util.Scanner;

public class IT22206350Lab7Q3 {

    public static void main(String[] args) {

        final double DISCOUNT_RATE = 5;

        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {

            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            double billAmount = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = input.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * DISCOUNT_RATE / 100;
                double amountToPay = billAmount - discount;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + billAmount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            if (customer < 5) {
                System.out.println();
            }
        }
    }
}
