package inheritance.constructor;

public class Employee {
    int id;
    String name;
    float salary;

    Employee(){
        System.out.println("Employee");
    }
    public Employee(int id , String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }

    void calculateSalary(){

    }
}
