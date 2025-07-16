package threadsAssignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MerchantAccount merchantAccount = new MerchantAccount();

        Scanner scanner = new Scanner(System.in);
        double paidBalance = 0;
        double payAmount ;
        String name ;
        CustomerPayment[] customerPayments = new CustomerPayment[3];

        System.out.println("Enter Customer Names and amount they paid :");

        for (int i = 0 ; i < customerPayments.length ; i++)
        {
            name = scanner.nextLine();
            payAmount = Double.parseDouble(scanner.nextLine());
            paidBalance += payAmount;
            customerPayments[i] = new CustomerPayment(payAmount,name,merchantAccount);
        }

        System.out.println("Paid Balance : "+paidBalance);

        for (int i=0 ; i < customerPayments.length ; i++)
            customerPayments[i].start();

    }
}
