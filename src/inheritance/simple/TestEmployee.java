package inheritance.simple;

public class TestEmployee {
    public static void main(String[] args) {
        PermanenetEmployee permanenetEmployee = new PermanenetEmployee();
        permanenetEmployee.id = 111;
        permanenetEmployee.name = "ABC";
        permanenetEmployee.basicSalary = 10000f;

        permanenetEmployee.calculateSalary();
        permanenetEmployee.display();

    }
}
