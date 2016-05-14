package entity;

/**
 * Created by sergey on 14/05/16.
 */
public class Address {
    String city;
    String street;
    String houseNumber;
    String apartmentNumber;
    String index;

    public Address(String city, String street, String houseNumber, String apartmentNumber, String index) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getIndex() {
        return index;
    }
}
