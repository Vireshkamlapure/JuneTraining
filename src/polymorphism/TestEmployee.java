package polymorphism;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {

        int employeeType;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter How many Employees you want in meeting : ");
        Employee[] employees = new Employee[Integer.parseInt(scanner.nextLine())];

        //appraisal
        Appraisal appraisal = new Appraisal();

        System.out.println("*** Reading Employees Information ***");

        for (int i = 0; i < employees.length; i++) {

            System.out.println("Which Employee you want to add? ");
            System.out.println("1.Permanent Employee \t 2.Contract-Based Employee");

            employeeType = scanner.nextInt();
            scanner.nextLine();
            //whenever you are just taking input as nextInt() always use extra nextLine() for it.

            switch (employeeType) {
                case 1:
                    System.out.println("Enter Id, Name and Basic-Salary for :" + (i + 1));
                    employees[i] = new PermanentEmployee(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), Float.parseFloat(scanner.nextLine()));
                    //((PermanentEmployee) employees[i]).calculateSalary(); explicit typecasting
                    break;
                case 2:
                    System.out.println("Enter Id, Name ,Hour-Salary and Working-Hour  for :" + (i + 1));
                    employees[i] = new ContractualEmployee(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), Float.parseFloat(scanner.nextLine()), Float.parseFloat(scanner.nextLine()));
                   // ((ContractualEmployee) employees[i]).calculateSalary(); explicit typecasting
                    break;
                default:
                    System.out.println("Make a correct choice... ");
            }
            employees[i].calculateSalary();
        }
        System.out.println("Printing Employee Information : ");

        for (Employee employee : employees) {
            //to check object belong to which class
//            System.out.println(employee.getClass().getSimpleName()); //option 1
            //option 2
//            if (employee instanceof PermanentEmployee){/*....*/}else{/*....*/}
            employee.display();
            System.out.println();
            System.out.println();
        }
        System.out.println("---------- After Appraisal ----------");
        for(Employee employee : employees) {
            appraisal.calculateAppraisal(employee);
            employee.calculateSalary();
            employee.display();
        }
    }
}
