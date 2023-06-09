package ge.nick.utils.proxy;

public class PasswordCheckManager extends CheckPassword {

    private CheckPassword checkPassword;

    public PasswordCheckManager(CheckPassword checkPassword) {
        this.checkPassword = checkPassword;
    }

    @Override
    public boolean isCorrectPassword(String password) {

        boolean isValid = checkPassword.isCorrectPassword(password);
        String message = isValid ? "Correct password" : "Wrong password";

        System.out.println(message);

        return password.equals("12345678");
    }
}
