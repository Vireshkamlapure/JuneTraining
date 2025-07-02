package ExceptionHandling.custom;

public class PasswordUppercaseCheckException extends PasswordFormatException {
    public PasswordUppercaseCheckException(String message){
        super(message);
    }
}
