package Demo.Ejercicio1;

public class PasswordSimple extends Password{
    private String regex;
    private String password;

    public PasswordSimple() {

        regex = "(?=.*[@#$%^&+=])";
    }
}
