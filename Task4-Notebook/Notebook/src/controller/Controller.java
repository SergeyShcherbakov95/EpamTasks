package controller;

import model.Model;
import view.View;
import view.ViewConstants;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by sergey on 14/05/16.
 */
public class Controller {
    private View view;
    private Model model;

    //Controller
    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
    }

    //Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        String surname = this.checkInputData(sc, ViewConstants.SURNAME_LABEL, RegexConstants.NAME_REGEX);
        String name = this.checkInputData(sc, ViewConstants.NAME_LABEL, RegexConstants.NAME_REGEX);
        String patronymic = this.checkInputData(sc, ViewConstants.PATRONYMIC_LABEL, RegexConstants.NAME_REGEX);
        String nickname = this.checkInputData(sc, ViewConstants.NICKNAME_LABEL, RegexConstants.NICKNAME_REGEX);
        String comment = this.checkInputData(sc, ViewConstants.COMMENT_LABEL, RegexConstants.COMMENT_REGEX);

        String groupMessage = ViewConstants.GROUP_LABEL;
        entity.Group[] groups = entity.Group.values();
        for(int i = 0; i < groups.length; i++)
            groupMessage += "\n" + i + "." + groups[i].name();

        String group = this.checkInputData(sc, groupMessage, RegexConstants.GROUP_REGEX);

        String homePhoneNumber = this.checkInputData(sc, ViewConstants.HOME_PHONE_NUMBER_LABEL, RegexConstants.PHONE_REGEX);
        String mobileNumber = this.checkInputData(sc, ViewConstants.MOBILE_NUMBER_LABEL, RegexConstants.PHONE_REGEX);
        String email = this.checkInputData(sc, ViewConstants.EMAIL_LABEL, RegexConstants.EMAIL_REGEX);
        String skype = this.checkInputData(sc, ViewConstants.SKYPE_LABEL, RegexConstants.SKYPE_REGEX);
        String city = this.checkInputData(sc, ViewConstants.CITY_LABEL, RegexConstants.CITY_REGEX);
        String street = this.checkInputData(sc, ViewConstants.STREET_LABEL, RegexConstants.STREET_REGEX);
        String houseNumber = this.checkInputData(sc, ViewConstants.HOUSE_NUMBER_LABEL, RegexConstants.BUILDING_REGEX);
        String apartmentNumber = this.checkInputData(sc, ViewConstants.APARTMENT_NUMBER_LABEL, RegexConstants.APARTMENT_REGEX);
        String index = this.checkInputData(sc, ViewConstants.INDEX_LABEL, RegexConstants.INDEX_REGEX);

        model.setNotebook(surname, name, patronymic, nickname, comment, group, homePhoneNumber, mobileNumber,
                email, skype, city, street, houseNumber, apartmentNumber, index);

        view.printMessage(surname);
        view.printMessage(name);
        view.printMessage(patronymic);
        view.printMessage(group);
        view.printMessage(nickname);
        view.printMessage(comment);
        view.printMessage(skype);
        view.printMessage(email);
        view.printMessage(city);
        view.printMessage(apartmentNumber);

    }

    /**
     * check input
     * @param sc read data from sc
     * @param message info about input
     * @param regex
     * @return
     */
    public String checkInputData(Scanner sc, String message, String regex){
        view.printMessage(ViewConstants.SEPARATOR);
        view.printMessage(message);

        Pattern pattern = Pattern.compile(regex);
        String answer = "";

        while( sc.hasNext() ) {
            answer = sc.next();
            if(pattern.matcher(answer).matches())
                break;
            view.printMessage(ViewConstants.WRONG_INPUT);
            view.printMessage(message);
        }

        return answer;
    }
}

