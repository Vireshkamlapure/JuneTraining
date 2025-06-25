package inheritance.simple;

public class PermanenetEmployee extends Employee {
    float basicSalary ;
    float hra;
    float da;

    void calculateSalary(){
        hra = basicSalary * 0.12f;
        da = basicSalary * 0.1f;
        salary = basicSalary+hra+da;
    }

    void display(){
        super.display();
        System.out.println("Basic salary : " + basicSalary);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
    }
}
