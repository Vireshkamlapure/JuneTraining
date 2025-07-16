package inheritance.constructor;

public class TestEmployee {
    public static void main(String[] args) {
        PermanenetEmployee permanenetEmployee = new PermanenetEmployee(111,"John",10000f);
        permanenetEmployee.calculateSalary();
        permanenetEmployee.display();
    }
}
