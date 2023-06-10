package ge.nick.utils.decorator;

/**
 * Person prototype class to work with person
 * construction. It set default and additional data.
 * It implements Person interface to get required methods.
 */

public class PersonPrototype implements Person{

    // Person full name prefix.
    protected String prefix = "";

    // To set person full name prefix.
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String fullName() {
        return this.prefix;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public String toString() {
        return "PersonPrototype{" +
                "prefix='" + prefix + '\'' +
                '}';
    }
}
