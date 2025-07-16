package homework.ObjectClassHW;

public class ContractualEmployee extends Employee {
    float basicSalary ;
    float workHour;

    ContractualEmployee(){
        super();
        System.out.println("Permanent Employee");
    }

    public ContractualEmployee(int id, String name, float basicSalary,float workHour) {
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
    public boolean equals(Object obj){
        if (obj instanceof ContractualEmployee && this.id == ((Employee)obj).id ){
            System.out.println(obj.getClass().toString());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nContractualEmployee{" +
                "basicSalary=" + basicSalary +
                ", workHour=" + workHour +
                '}';
    }
}
