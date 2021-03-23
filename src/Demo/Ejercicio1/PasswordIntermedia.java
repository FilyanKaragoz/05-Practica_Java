package Demo.Ejercicio1;

public class PasswordIntermedia extends Password{
    private String regex;
    private String password;

    public PasswordIntermedia() {
        regex = "(?=.*[@#$%^&+=])";

    }
}
