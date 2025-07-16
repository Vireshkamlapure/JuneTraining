package ExceptionHandling.custom;

public class PasswordMinimumLengthException extends PasswordFormatException {
    public PasswordMinimumLengthException(String s){
        super(s);
    }
}
