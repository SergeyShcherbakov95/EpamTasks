package model;

import entity.Address;
import entity.Group;
import entity.Note;

/**
 * Created by sergey on 14/05/16.
 */
public class Model {
    private Note note;

    /**
     * create and set note
     */
    public void setNotebook(String surname, String name, String patronymic, String nickname,
                            String comment, String groupIndex, String homePhoneNumber, String mobileNumber,
                            String email, String skype, String city, String street, String houseNumber,
                            String apartmentNumber, String index){

        String fullName = createFullname(surname, name, patronymic);
        Group group = getGroupName(groupIndex);
        Address address = this.createAddress(city, street, houseNumber, apartmentNumber, index);

        this.note = new Note(address, skype, email, mobileNumber, homePhoneNumber, comment, group, nickname, fullName);
    }

    /**
     * create full name. Example: Example Ex Exa --> Example E.E.
     * @param surname
     * @param name
     * @param patronymic
     * @return
     */
    public String createFullname(String surname,String name,String patronymic){
        return surname + " " + name.toUpperCase().charAt(0) + "." + patronymic.toUpperCase().charAt(0) + ".";
    }

    /**
     * get group name by index
     */
    public Group getGroupName(String groupIndex){
        return Group.values()[Integer.parseInt(groupIndex)];
    }

    /**
     * create Address
     */
    public Address createAddress(String city, String street, String houseNumber, String apartmentNumber, String index){
        return new Address(city, street, houseNumber, apartmentNumber, index);
    }
}
