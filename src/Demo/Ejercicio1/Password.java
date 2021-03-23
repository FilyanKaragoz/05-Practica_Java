package Demo.Ejercicio1;

public abstract class Password {
    private String regex;
    private String password;

    public boolean validate(String regex, String text) {
        return text.matches(regex);
    }

    public void setValue(String pwd){
        if (validate(this.regex, pwd)) password = pwd;
        else {
            try {
            throw new Exception("Invalid Password");
        } catch (Exception e) {
            System.out.println("Contraseña invalida");
        }
    }}

}
