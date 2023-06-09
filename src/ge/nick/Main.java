package ge.nick;

import ge.nick.utils.decorator.JohnDoe;
import ge.nick.utils.decorator.LikaBika;
import ge.nick.utils.decorator.Person;
import ge.nick.utils.decorator.PersonPrototype;
import ge.nick.utils.proxy.CachedCheckPassword;
import ge.nick.utils.proxy.PasswordCheckManager;
import ge.nick.utils.proxy.CheckPassword;

public class Main {
    public static void main(String[] args) {

        // Decorator pattern.

        PersonPrototype person = new PersonPrototype();

        person.setPrefix("MR");

        Person JohnDoe = new JohnDoe(person);

        System.out.println(JohnDoe.fullName());
        System.out.println(JohnDoe.age());

        person.setPrefix("MRs");

        Person LikaBika = new LikaBika(person);

        System.out.println(LikaBika.fullName());
        System.out.println(LikaBika.age());

        // Proxy pattern.

        CheckPassword checkPassword = new CheckPassword();

        checkPassword = new CachedCheckPassword(checkPassword);
        checkPassword = new PasswordCheckManager(checkPassword);

        checkPassword.isCorrectPassword("aG2sw12");
        checkPassword.isCorrectPassword("aG2sw12");
        checkPassword.isCorrectPassword("aG2sw12");

        checkPassword.isCorrectPassword("12345678");
    }
}