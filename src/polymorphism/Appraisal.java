package polymorphism;

public class Appraisal {

    public void calculateAppraisal(Employee employee) {
        System.out.println(employee.getClass().getSimpleName());
        if (employee instanceof PermanentEmployee) {
            ((PermanentEmployee) employee).basicSalary += (((PermanentEmployee) employee).basicSalary * 0.02f);
        } else if (employee instanceof ContractualEmployee) {
            if (((ContractualEmployee) employee).workHour > 100) {
                ((ContractualEmployee) employee).basicSalary += (((ContractualEmployee) employee).basicSalary * 0.05f);
            }
        }
    }
}
