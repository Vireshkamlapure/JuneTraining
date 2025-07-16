package ExceptionHandling.custom;

public class PasswordDigitCheckException extends PasswordFormatException {
    public PasswordDigitCheckException(String message){
        super(message);
    }
}
