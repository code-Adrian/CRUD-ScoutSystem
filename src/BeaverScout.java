public class BeaverScout extends Scout{
private String parentPhone;

    public BeaverScout(String name, String county, String dateOfBirth, String address, String phoneNumber, SpecialInterest specialInterests, String parentPhone) {
        super(name, county, dateOfBirth, address, phoneNumber, specialInterests);
        this.parentPhone = parentPhone;
    }


    @Override
    public double calcMembership() {
        return 100.0;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    @Override
    public String toString() {
        return "BeaverScout{" +
                "Name='" + super.getName() + '\'' +
                "County='" + super.getCounty() + '\'' +
                "dateOfBirth'" + super.getDateOfBirth() + '\'' +
                "Address='" + super.getAddress() + '\'' +
                "PhoneNumber='" + super.getPhoneNumber() + '\'' +
                "parentPhone='" + parentPhone + '\'' +
                "SpecialInterests=" + super.getSpecialInterests() + '\'' +
                "Membership:" + calcMembership() +
                '}';
    }





}
