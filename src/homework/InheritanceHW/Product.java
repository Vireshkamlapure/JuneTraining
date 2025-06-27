package homework.InheritanceHW;

public class Product {
    int model;
    double price;

    public Product(){

    }
    public Product(int model , double price){
        this.model = model;
        this.price = price;
    }

    public void display(){
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

}
