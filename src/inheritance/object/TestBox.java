package inheritance.object;

public class TestBox {
    public static void main(String[] args) {
        Box box1 = new Box(5,5,5);
        box1.calculateVolume();

        System.out.println(box1);

        Box box2 = box1;
        box2.setLength(15);
        System.out.println("After box2 changing length : "+box2.getLength());
        System.out.println("After box1 changing length : "+box1.getLength());

        System.out.println("Equality "+(box1 == box2));

        box2 = new Box(5,5,5);
        box2.calculateVolume();
        System.out.println("Equivalence "+(box1.equals(box2)));


    }
}
