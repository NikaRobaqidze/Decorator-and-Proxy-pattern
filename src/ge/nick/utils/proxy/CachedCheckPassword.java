package ge.nick.utils.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedCheckPassword extends CheckPassword {

    private Map<String, Integer> checkCount = new HashMap<>();

    private CheckPassword checkPassword;

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
