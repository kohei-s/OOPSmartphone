package SmartPhone;

import java.util.Arrays;

public class Smartphone implements Radio, GPS {

    String model;
    String manufacturer;
    Contact [] allContacts;



    public Smartphone() {
    }

    public Smartphone(String model, String manufacturer, Contact[] allContacts) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.allContacts = allContacts;

    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", allContacts=" + Arrays.toString(allContacts) +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Contact[] getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(Contact[] allContacts) {
        this.allContacts = allContacts;
    }

    public boolean startRadio () {
        System.out.println("Radio started");
        return true;
    }

    public boolean stopRadio () {
        System.out.println("Radio stopped");
        return false;
    }

    public String getPosition () {
        return "Köln";
    }

    public Contact [] addContact (Contact contact) {
        Contact [] oldAllContacts = this.allContacts;
        Contact [] newAllContacts = new Contact [(oldAllContacts.length) + 1];
        for (int i = 0; i < oldAllContacts.length; i++) {
            newAllContacts[i] = oldAllContacts[i];
        }
        newAllContacts[(oldAllContacts.length)] = contact;
        return newAllContacts;
    }

    public Contact getContact(int index) {
        return this.allContacts[index];
    }

    public Contact getContactByName (String name) {
        Contact contact = new Contact();
        for (int i = 0; i < allContacts.length; i++) {
            if (allContacts[i].name == name) {
                contact = allContacts[i];
            }
        }
        return contact;
    }

    public String removeContactByName (String name) {
        Contact [] newAllContacts = new Contact [allContacts.length - 1];
        int index = 0;
        for (int i = 0; i < allContacts.length; i++) {
            if (allContacts[i].name != name) {
                newAllContacts[index] = allContacts[i];
                index++;
            }
        }
        return Arrays.toString(newAllContacts);

    }

}
