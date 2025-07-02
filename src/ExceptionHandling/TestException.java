package ExceptionHandling;

public class TestException {
    public static void main(String[] args) {
        try{
        int num = Integer.parseInt("123");
        System.out.println(num);

        num = num/0;
        }catch (NumberFormatException e){
            System.out.println("Invalid Number was entered");
//            throw new RuntimeException(e);
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("Always execute ... ");
        }

    }
}
