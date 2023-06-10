package ge.nick.utils.decorator;

/**
 * Class that get data about John Doe.
 * Override functions will return correct data.
 * It is extends PersonDecorator
 * because it is person prototype with specific data.
 */

public class JohnDoe extends PersonDecorator{

    public JohnDoe(Person person) {
        super(person);
    }

    @Override
    public String fullName() {
        return super.fullName() + " John Doe";
    }

    @Override
    public int age() {
        return 27;
    }

    @Override
    public String toString() {
        return "JohnDoe{" +
                "person=" + person +
                '}';
    }
}
