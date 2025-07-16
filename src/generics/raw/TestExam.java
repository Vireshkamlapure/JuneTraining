package generics.raw;

public class TestExam {
    public static void main(String[] args) {
        Exam exam1 = new Exam(1000);

        System.out.println(exam1);

        Integer code = (Integer) exam1.getCode();

        System.out.println(code);
    }
}
