import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // user input
        System.out.print("Enter the amount: ");
        double amount = in.nextDouble();

        System.out.print("Enter the rate: ");
        double rate = in.nextDouble();

        System.out.print("Enter the target amount: ");
        double target = in.nextDouble();
        System.out.println();

        int time = (int) Math.ceil((Math.log(amount / target) / Math.log(1 + rate / 100)) * -1);
        System.out.printf("It will take %d years for your money to reach your target", time);

        double totalAmount = amount * Math.pow((1 + rate / 100), time);
        double total =  Math.round(totalAmount * 100.0) / 100.0;
        System.out.println("\nBy the end of this period the amount in your account will be " + total);
        in.close();
    }
}
