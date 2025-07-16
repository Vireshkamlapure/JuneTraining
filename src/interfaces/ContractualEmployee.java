package interfaces;

public class ContractualEmployee extends Employee implements IncomeTax,GST {
    float basicSalary ;
    float workHour;

    ContractualEmployee(){
        super();
        System.out.println("Permanent Employee");
    }

    public ContractualEmployee(int id, String name, float basicSalary, float workHour) {
        super(id, name);
        this.basicSalary = basicSalary;
        this.workHour = workHour;
    }

    void calculateSalary(){

        salary = basicSalary * workHour;
    }

    void display(){
        super.display();
        System.out.println("Basic salary : " + basicSalary);
        System.out.println("Work Hour : " + workHour);
    }

    @Override
    public void payTax(){
        System.out.println("Paying the income tax ");
    }

    @Override
    public void payGST() {
        System.out.println("Paying the GST");
    }
}
