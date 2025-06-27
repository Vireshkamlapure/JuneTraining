package abstractClass;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(9.0);
        circle.findArea();
        circle.display();
        System.out.println();
        Rectangle rectangle = new Rectangle(5,10);
        rectangle.findArea();
        rectangle.display();
    }
}