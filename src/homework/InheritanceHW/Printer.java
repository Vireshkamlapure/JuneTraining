package homework.InheritanceHW;

public class Printer extends Product implements Printable {

    public Printer(int model , double price){
        super(model,price);
    }

    public void print(){
        System.out.println("Printing...");
    }
}
