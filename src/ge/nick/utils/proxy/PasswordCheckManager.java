package ge.nick.utils.proxy;

/**
 * Proxy class to manage passwords and logs.
 * Use CheckPassword to validate passwords.
 * Extends it to override required methods.
 */

public class PasswordCheckManager extends CheckPassword {

    // Object to validate passwords.
    private final CheckPassword checkPassword;

    // Set object to validate passwords.
    public PasswordCheckManager(CheckPassword checkPassword) {
        this.checkPassword = checkPassword;
    }

    @Override
    public boolean isCorrectPassword(String password) {

        // Validate password.
        boolean isValid = checkPassword.isCorrectPassword(password);

        // Set message to print message on screen.
        String message = isValid ? "Correct password" : "Wrong password";

        System.out.println(message);

        // Compare entered and stored passwords.
        return password.equals("12345678");
    }
}
