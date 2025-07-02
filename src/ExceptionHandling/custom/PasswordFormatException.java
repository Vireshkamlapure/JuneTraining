package ExceptionHandling.custom;

public class PasswordFormatException extends RuntimeException{
    public PasswordFormatException(String message){
        super(message);
    }
}
