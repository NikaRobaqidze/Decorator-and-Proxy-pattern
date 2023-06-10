package ge.nick.utils.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to cache entered password.
 * It save and count password and tries.
 * Extends CheckPassword to override required methods.
 */

public class CachedCheckPassword extends CheckPassword {

    // Map to cache password. Key - password, Value - count of tries.
    private Map<String, Integer> checkCount = new HashMap<>();

    // Object to work with password checker.
    private CheckPassword checkPassword;

    // Parametric constructor to set password checker object.
    public CachedCheckPassword(CheckPassword checkPassword) {
        this.checkPassword = checkPassword;
    }

    @Override
    public boolean isCorrectPassword(String password) {

        boolean isCorrect = password.equals("12345678");

        if(isCorrect){

            return true;
        }

        if (!checkCount.containsKey(password)) {

            checkCount.put(password, 0);

        } else {

            int count = this.checkCount.get(password) + 1;
            this.checkCount.put(password, count);
        }

        if (checkCount.containsKey(password) && checkCount.get(password) >= 2) {

            System.out.println("User password check count limited. User blocked.");
        }

        return false;
    }
}
