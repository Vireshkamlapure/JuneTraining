//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        StudentResult s = new StudentResult("Abc",111,1000);
        s.calculateGrade();
        s.showResult();

    }
}
class GradeCalculator {
    float totalMarks , obtainedMarks ;
    float percentage;
    String Grades;

    GradeCalculator(){
        totalMarks = 1200;
        obtainedMarks = 0;
    }
    GradeCalculator(int obtMarks , int totalMarks){
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtMarks;
    }
    public void calculateGrade()
    {
        percentage = (obtainedMarks/totalMarks)*100;

        if (percentage>70 && percentage<100){
            Grades = "Distinction";
        }
        else if(percentage>60 && percentage<70){
            Grades = "First Class";
        }
        else if(percentage>50 && percentage<60){
            Grades = "Second Class";
        }
        else if(percentage>40 && percentage<50){
            Grades = "Pass";
        }
        else {
            Grades = "Fail";
        }
    }
}

class StudentResult extends GradeCalculator{
    String studentname;
    int studId;

    StudentResult(){
        super(0,1200);
        studentname = null;
        studId = 0;
    }

    StudentResult(String n , int id , int obtmarks){
        super(obtmarks,1200);
        studentname = n;
        studId = id;
    }

    public void showResult(){
        System.out.println("Result Information");
        System.out.println("Name " + studentname);
        System.out.println("ID "+studId);
        System.out.println("Percentage " + percentage);
        System.out.println("Grades Achieved " + Grades);

    }
}