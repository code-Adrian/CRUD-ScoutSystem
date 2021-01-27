import java.util.ArrayList;

public class CubScout extends Scout{
    private String cubPhoneNumber;

    public CubScout(String name, String county, String dateOfBirth, String address, String phoneNumber, SpecialInterest specialInterests, String cubPhoneNumber) {
        super(name, county, dateOfBirth, address, phoneNumber, specialInterests);
        this.cubPhoneNumber = cubPhoneNumber;
    }

    @Override
    public double calcMembership() {
        return 150.0*1;
    }

    public String getCubPhoneNumber() {
        return cubPhoneNumber;
    }

    public void setCubPhoneNumber(String cubPhoneNumber) {
        this.cubPhoneNumber = cubPhoneNumber;
    }

    @Override
    public String toString() {
        return "CubScout{" +
                "Name='" + super.getName() + '\'' +
                "County='" + super.getCounty() + '\'' +
                "dateOfBirth'" + super.getDateOfBirth() + '\'' +
                "Name='" + super.getName() + '\'' +
                "Address='" + super.getAddress() + '\'' +
                "cubPhoneNumber='" + cubPhoneNumber + '\'' +
                "SpecialInterests=" + super.getSpecialInterests() + '\'' +
                "Membership:" + calcMembership() +
                '}';
    }
}
