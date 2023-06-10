package ge.nick.utils.decorator;

/**
 * Person decorator class that need
 * to work with Person classes.
 * At initialize needs to set person.
 */

public class PersonDecorator implements Person{

    // Initialized person object to decorate it.
    protected Person person;

    // Parametric constructor to set person.
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
