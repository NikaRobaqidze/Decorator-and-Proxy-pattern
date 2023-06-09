package ge.nick.utils.decorator;

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
