package ge.nick.utils.decorator;

public class PersonPrototype implements Person{

    protected String prefix = "";

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
