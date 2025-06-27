package homework.ObjectClassHW;

import inheritance.object.Box;

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
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Employee && this.id == ((Employee)obj).id ){
            System.out.println(obj.getClass().toString());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
