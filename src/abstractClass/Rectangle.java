package abstractClass;

public class Rectangle extends Shape {
    double length , breadth ;

    Rectangle(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void findArea(){
        area = length*breadth;
    }
    void display(){
        System.out.println("Length : " + length);
        System.out.println("Breadth :" + breadth);
        super.display();
    }

}
