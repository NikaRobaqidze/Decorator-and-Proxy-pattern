package ge.nick.utils.decorator;

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
