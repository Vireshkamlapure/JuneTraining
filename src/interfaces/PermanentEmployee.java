package interfaces;

public class PermanentEmployee extends Employee implements IncomeTax , ProvidentFund {
    float basicSalary ;
    float hra;
    float da;

    PermanentEmployee(){
        super();
        System.out.println("Permanent Employee");
    }

    public PermanentEmployee(int id, String name, float basicSalary) {
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

    @Override
    public void payTax() {
        System.out.println("Paying the income tax");
    }

    @Override
    public void openAccount() {
        System.out.println("Opening PF account");
    }
}
