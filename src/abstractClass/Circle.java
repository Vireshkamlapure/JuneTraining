package abstractClass;

public class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    void findArea() {
        area = 3.14*radius*radius;
    }

    void display(){
        System.out.println("Radius : "+radius);
        super.display();

    }
}
