package ge.nick.utils.proxy;

import java.util.Objects;
import java.util.Random;

/**
 * Class to manage entered password and check it.
 * It compares entered string to stored password.
 */

public class CheckPassword {

    // Random function to set password check response duration.
    private static final Random RND = new Random();

    // To compare string with stored passwords.
    public boolean isCorrectPassword(String password) {
        try {
            // Imitate wait duration of response of password check.
            Thread.sleep((long) (RND.nextDouble() * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Checking password: %s\n", password);
        return Objects.equals(password, "12345678");
    }
}
