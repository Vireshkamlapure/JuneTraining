package arrayOfObjects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students : ");
        Student[] students = new Student[Integer.parseInt(scanner.nextLine())];

        System.out.println("*** Reading Students Information ***");

        for(int i = 0 ; i < students.length ; i++){
            System.out.println("Enter id,name and marks for student : " + (i + 1));
            students[i] = new Student(Integer.parseInt(scanner.nextLine()),scanner.nextLine(),Float.parseFloat(scanner.nextLine()));
        }

        System.out.println("Printing Students Inforamation : ");

        for(Student student : students){
            student.printDetails();
            System.out.println();
        }
    }
}
