/**
 * @Author: Nika Robaqidze
 * @Email: nika42568@gmail.com

 * Decorator design pattern scenario:
 * Initialize person prototype to create person.
 * add additional data person name prefix.
 * Then initialize specific person and print result on screen.

 * Proxy design pattern scenario:
 * Try to log in to somewhere server.
 * Server cache entered password and count tries.
 * If count of tries limit exceed it block user.
 */

package ge.nick;

import ge.nick.utils.decorator.*;
import ge.nick.utils.proxy.*;

public class Launcher {
    public static void main(String[] args) {

        // Decorator pattern.

        // Initialize person prototype.
        PersonPrototype person = new PersonPrototype();

        // Set additional data name prefix.
        person.setPrefix("MR");

        // Initialize specific person Joe Doe.
        Person JohnDoe = new JohnDoe(person);

        System.out.println(JohnDoe.fullName());
        System.out.println(JohnDoe.age());

        // Set additional data name prefix to Joe Doe.
        person.setPrefix("MRs");

        // Initialize specific person Lika Bika.
        Person LikaBika = new LikaBika(person);

        System.out.println(LikaBika.fullName());
        System.out.println(LikaBika.age());

        // Proxy pattern.

        // Initialize server password checker.
        CheckPassword checkPassword = new CheckPassword();

        // Initialize tries counter.

        checkPassword = new CachedCheckPassword(checkPassword);
        checkPassword = new PasswordCheckManager(checkPassword);

        // Try invalid passwords.

        checkPassword.isCorrectPassword("aG2sw12");
        checkPassword.isCorrectPassword("aG2sw12");
        checkPassword.isCorrectPassword("aG2sw12");

        // Try correct passwords.

        checkPassword.isCorrectPassword("12345678");
    }
}