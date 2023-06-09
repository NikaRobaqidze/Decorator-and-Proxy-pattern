package ge.nick.utils.proxy;

import java.util.Random;

public class CheckPassword {

    private static final Random RND = new Random();

    public boolean isCorrectPassword(String password) {
        try {
            Thread.sleep((long) (RND.nextDouble() * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Checking password: %s\n", password);
        return password == "12345678";
    }
}
