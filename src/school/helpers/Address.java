package school.helpers;

public class Address {
    String postCode;
    String city;
    String streetName;
    String streetNumber;

    public Address(String postCode, String city, String streetName, String streetNumber) {
        this.postCode = postCode;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return postCode + " " + city + ", " + streetName + " " + streetNumber;
    }
}
