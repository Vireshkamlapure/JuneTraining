package collectionAPIAssignment;

public class Student{
    public int isPresent;
    public int id;
    public String name;

    public int getIsPresent() {
        return isPresent;
    }

    public void setIsPresent(int isPresent) {
        this.isPresent = isPresent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(){

    }
    public Student(int isPresent , int id , String name){
        this.isPresent = isPresent;
        this.id = id;
        this.name = name;
    }

}
