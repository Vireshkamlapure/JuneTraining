package inheritance.constructor;

public class PermanenetEmployee extends Employee {
    float basicSalary ;
    float hra;
    float da;

    PermanenetEmployee(){
        super();
        System.out.println("Permanent Employee");
    }

    public PermanenetEmployee(int id, String name, float basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

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
