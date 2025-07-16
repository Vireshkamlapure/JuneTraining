package collectionAPIAssignment.EmployeeManagement;

import homework.ObjectClassHW.Employee;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        int choice = 0;

        do {
            System.out.println("1.Add Employee 2.Remove Employee 3.Display All Employee list 4.Check Employee Details 0.Exit");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    employeeDirectory.addEmployee(Integer.parseInt(scanner.nextLine()), scanner.nextLine());
                    break;

                case 2:
                    employeeDirectory.removeEmployee(Integer.parseInt(scanner.nextLine()));
                    break;

                case 3:
                    employeeDirectory.displayAllEmployeeData();
                    break;

                case 4:
                    employeeDirectory.displayEmployeeDetail(Integer.parseInt(scanner.nextLine()));
                    break;
            }
        }while (choice != 0);
    }
}
