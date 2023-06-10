package ge.nick.utils.decorator;

/**
 * Class that get data about Lika Bika.
 * Override functions will return correct data.
 * It is extends PersonDecorator
 * because it is person prototype with specific data.
 */

public class LikaBika extends PersonDecorator{

    public LikaBika(Person person) {
        super(person);
    }

    @Override
    public String fullName() {
        return super.fullName() + " Lika Bika";
    }

    @Override
    public int age() {
        return 31;
    }

    @Override
    public String toString() {
        return "LikaBika{" +
                "person=" + person +
                '}';
    }
}
