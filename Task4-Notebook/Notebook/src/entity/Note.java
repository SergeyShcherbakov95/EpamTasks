package entity;

/**
 * Created by sergey on 14/05/16.
 */
public class Note {
    String fullName;
    String nickname;
    String comment;
    Group group;
    String homePhoneNumber;
    String mobileNumber;
    String email;
    String skype;
    Address address;

    public Note(Address address, String skype, String email, String mobileNumber, String homePhoneNumber, String comment, Group group, String nickname, String fullName) {
        this.address = address;
        this.skype = skype;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.homePhoneNumber = homePhoneNumber;
        this.comment = comment;
        this.group = group;
        this.nickname = nickname;
        this.fullName = fullName;
    }

    /**
     * create postal address
     * @return
     */
    public String getPostalAddress(){
        StringBuilder sb = new StringBuilder();
        sb.append(fullName);
        sb.append("\n");
        sb.append("street: ");
        sb.append(address.getStreet());
        sb.append(" ");
        sb.append(address.getHouseNumber());
        sb.append("apart. ");
        sb.append(address.getApartmentNumber());
        sb.append("\n");
        sb.append(address.getCity());
        sb.append("\n");
        sb.append(address.getIndex());

        return sb.toString();
    }

    /**
     * create common address
     * @return
     */
    public String getCommonAddress(){
        StringBuilder sb = new StringBuilder();

        sb.append(address.getCity());
        sb.append(", ");
        sb.append(address.getStreet());
        sb.append(", ");
        sb.append(address.getHouseNumber());
        sb.append(", ");
        sb.append(address.getApartmentNumber());
        sb.append(", ");
        sb.append(address.getIndex());

        return sb.toString();
    }
}
