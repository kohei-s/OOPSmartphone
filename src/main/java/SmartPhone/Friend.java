package SmartPhone;

import SmartPhone.Contact;

public class Friend extends Contact {

    String telefonnummer;

    public Friend() {
        super();
    }

    public Friend(String name, String telefonnummer) {
        super(name);
        this.telefonnummer = telefonnummer;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telefonnummer='" + telefonnummer + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}

