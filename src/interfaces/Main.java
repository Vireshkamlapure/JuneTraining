package interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int employeeType;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter How many Employees you want in meeting : ");
        Employee[] employees = new Employee[Integer.parseInt(scanner.nextLine())];

        System.out.println("*** Reading Employees Information ***");

        for (int i = 0; i < employees.length; i++) {

            System.out.println("Which Employee you want to add? ");
            System.out.println("1.Permanent Employee \t 2.Contract-Based Employee");

            employeeType = scanner.nextInt();
            scanner.nextLine();

            switch (employeeType) {
                case 1:
                    System.out.println("Enter Id, Name and Basic-Salary for :" + (i + 1));
                    employees[i] = new PermanentEmployee(Integer.parseInt(scanner.nextLine()),scanner.nextLine(),Float.parseFloat(scanner.nextLine()));
                    break;
                case 2:
                    System.out.println("Enter Id, Name, Hour-Salary and Working-Hour for :" + (i + 1));

                    employees[i] = new ContractualEmployee(Integer.parseInt(scanner.nextLine()),scanner.nextLine(),Float.parseFloat(scanner.nextLine()),Float.parseFloat(scanner.nextLine()));

                    System.out.println("Enter Id, Name ,Hour-Salary and Working-Hour  for :" + (i + 1));
                    break;
                default:
                    System.out.println("Make a correct choice... ");
            }
            employees[i].calculateSalary();
        }

        System.out.println("Printing Employee Information : ");

        for (Employee employee : employees) {
            employee.display();
            if (employee instanceof PermanentEmployee) {
                ((PermanentEmployee) employee).payTax();
                ((PermanentEmployee) employee).openAccount();
            }
            else {
                ((ContractualEmployee)employee).payTax();
                ((ContractualEmployee)employee).payGST();
            }
            System.out.println();
            System.out.println();
        }

    }
}
