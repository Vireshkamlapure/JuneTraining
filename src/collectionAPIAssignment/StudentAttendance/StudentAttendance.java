//Assignment 1: Student Attendance Tracker (List)
package collectionAPIAssignment.StudentAttendance;

import java.util.ArrayList;

public class StudentAttendance {
    public ArrayList<Student> attendance = new ArrayList<>();

    public void addStudent(int isPresent, int id, String name) {
        Student student = new Student(isPresent, id, name);
        attendance.add(student);
    }

    public void showList() {
        for(int i = 0; i < attendance.size(); i++) {
            Student currentStudent = attendance.get(i);
            if (currentStudent.isPresent == 1) {
                System.out.println("Id : " + currentStudent.id + " Name : " + currentStudent.name);
            }
        }
    }

    public void removeStudent(int id){
        for (int i =0 ; i < attendance.size() ; i++){
            Student currentStudent = attendance.get(i);
            if(currentStudent.id == id)
            {
                attendance.remove(i);
            }
        }
    }
}

