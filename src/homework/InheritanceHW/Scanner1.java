package homework.InheritanceHW;

public class Scanner1 extends Product implements Scannable {

    public Scanner1(int model , double price){
        super(model, price);
    }

    public void scan(){
        System.out.println("Scanning...");
    }
}
