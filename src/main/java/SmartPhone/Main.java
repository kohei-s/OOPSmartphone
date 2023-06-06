package SmartPhone;

public class Main {
    public static void main (String[] args) {
        Contact c1 = new Contact ("A");
        Contact c2 = new Contact ("B");
        Contact c3 = new Contact ("C");
        Contact c4 = new Contact ("D");
        Contact c5 = new Contact ("E");
        Contact c6 = new Contact ("F");
        Contact c7 = new Contact ("G");
        Contact c8 = new Contact ("H");
        Contact c9 = new Contact ("I");
        Contact c10 = new Contact ("J");
        Contact [] contacts = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};

        Smartphone sp1 = new Smartphone("iPhone", "Apple", contacts);
        System.out.println(sp1.toString());
        System.out.println(sp1.startRadio());
        System.out.println(sp1.stopRadio());
        System.out.println(sp1.getPosition());
        System.out.println("---------------------");
        System.out.println(sp1.getContactByName("G"));
        System.out.println(sp1.removeContactByName("G"));
    }
}
