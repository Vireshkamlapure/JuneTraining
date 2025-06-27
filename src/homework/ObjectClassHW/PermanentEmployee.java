package homework.ObjectClassHW;

public class PermanentEmployee extends Employee {
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
    public boolean equals(Object obj){
        if (obj instanceof PermanentEmployee && this.id == ((Employee)obj).id ) {
            System.out.println(obj.getClass().toString());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nPermanentEmployee{" +
                "basicSalary=" + basicSalary +
                ", hra=" + hra +
                ", da=" + da +
                '}';
    }
}
