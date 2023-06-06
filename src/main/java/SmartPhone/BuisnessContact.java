package SmartPhone;

public class BuisnessContact extends Contact {
    String companyName;

    public BuisnessContact(String name, String companyName) {
        super(name);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BuisnessContact{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
