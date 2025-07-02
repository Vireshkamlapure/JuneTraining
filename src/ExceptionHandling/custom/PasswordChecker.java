package ExceptionHandling.custom;

public class PasswordChecker {

    boolean checkPassword(String password) throws PasswordFormatException {
        boolean isUpper = false;
        boolean isDigit = false;
        char ch;
        for (int i = 0 ; i < password.length() ; i++){
            ch = password.charAt(i);
            if(Character.isUpperCase(ch))
                isUpper = true;
            if (Character.isDigit(ch))
                isDigit = true;
        }
        if (password.length() < 6)
            throw new PasswordMinimumLengthException("The minimum Length should be 6");
        if(!isUpper)
            throw new PasswordUppercaseCheckException("At least 1 Character should be in upper case!!");
        if(!isDigit)
            throw new PasswordUppercaseCheckException("At least contain 1 Digit !!!");

        return true;
    }

    public static void main(String[] args) {
        PasswordChecker passwordChecker = new PasswordChecker();
        String password = "Something@234";
        try {
            boolean isValid = passwordChecker.checkPassword(password);
            System.out.println(isValid);

        } catch (PasswordMinimumLengthException eL) {
            System.out.println(eL.getMessage());
        }catch (PasswordUppercaseCheckException eU){
            System.out.println(eU.getMessage());
        }catch (PasswordDigitCheckException eD){
            System.out.println(eD.getMessage());
        }
    }
}
