package oops;

public class Student {
    private int id;
    private String name;
    private float marks;
    public static int count;
    //constructors
    public Student(){
        //No args constructor
        count++;
    }


    public Student(int id , String name , float marks){
        //parameterized constructor
        this.id = id ;
        this.name = name;
        this.marks = marks;
        count++;
    }

    //getter
    public int getId(){
        return id;
    }
    //setter
    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printDetails(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }

    public static void getStudentCount(){
        System.out.println("Count : "+count);

    }
}
