package collectionAPIAssignment.StudentAttendance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0 ;
        Scanner scanner = new Scanner(System.in);
        StudentAttendance studentAttendance = new StudentAttendance();
        do {

            System.out.println("1.Add Student attendance 2.Show Attendance List 3.Remove Student 0.Exit");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){

                case 1:
                    System.out.println("Enter Student Details Present/Absent , Id , Name : ");
                    studentAttendance.addStudent(Integer.parseInt(scanner.nextLine()), (Integer.parseInt(scanner.nextLine())), scanner.nextLine());
                    System.out.println("Student Added ");
                    break;

                case 2:
                    studentAttendance.showList();
                    break;

                case 3:
                    System.out.println("Enter Id to remove student : ");
                    studentAttendance.removeStudent(Integer.parseInt(scanner.nextLine()));
                    break;
            }

        }while(choice != 0);
    }
}
