package arrayOfObjects;

public class Student {
    private int id;
    private String name;
    private float marks;

    Student(){

    }

    public Student(int id,String name , float marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }


    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void printDetails(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }
}
