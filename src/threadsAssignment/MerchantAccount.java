package threadsAssignment;

public class MerchantAccount {
    double balance = 0;

    public synchronized void receivePayment(double amount , String customerName){
        balance = balance+amount;
        System.out.print("Customer : " + customerName);
        System.out.print("\tPaid : " + amount);
        System.out.print("\tUpdated Balance : " + balance);
        System.out.println();
    }
}
