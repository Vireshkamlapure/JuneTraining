package threadsAssignment;

public class CustomerPayment extends Thread {
    MerchantAccount merchantAccount;

    double paymentAmount ;
    String name ;

    public CustomerPayment(double paymentAmount , String name, MerchantAccount merchantAccount){
        this.merchantAccount = merchantAccount;
        this.paymentAmount = paymentAmount;
        this.name = name;
    }

    @Override
    public void run(){
        merchantAccount.receivePayment(paymentAmount,name);
    }
}
