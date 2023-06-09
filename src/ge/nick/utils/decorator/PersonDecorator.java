package ge.nick.utils.decorator;

public class PersonDecorator implements Person{

    protected Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }

    @Override
    public String fullName() {
        return person.fullName();
    }

    @Override
    public int age() {
        return person.age();
    }

    @Override
    public String toString() {
        return "PersonDecorator{" +
                "person=" + person +
                '}';
    }
}
