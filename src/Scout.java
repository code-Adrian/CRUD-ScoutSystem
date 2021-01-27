import java.util.ArrayList;

public abstract class Scout implements iScoutMember {
    private String name;
    private String county;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;
    private SpecialInterest specialInterests;

    public Scout(String name, String county, String dateOfBirth, String address, String phoneNumber,SpecialInterest specialInterests) {
        this.name = name;
        this.county = county;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
this.specialInterests = specialInterests;
    }


    public SpecialInterest getSpecialInterests() {
        return specialInterests;
    }

    public void setSpecialInterests(SpecialInterest specialInterests) {
        this.specialInterests = specialInterests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Scout{" +
                "name='" + name + '\'' +
                ", county='" + county + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", specialInterests=" + specialInterests +
                '}';
    }
}
