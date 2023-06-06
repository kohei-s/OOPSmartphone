package SmartPhone;

public class Contact {

    String name;

    public Contact () {
    }

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                '}';
    }
}
