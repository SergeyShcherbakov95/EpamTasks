package controller;

/**
 * Created by sergey on 14/05/16.
 */
public interface RegexConstants {
    //The regex
    /**
     * Name, surname, patronymic
     */
    String NAME_REGEX = "^[A-Za-z]{3,20}$";
    /**
     * Nickname
     */
    String NICKNAME_REGEX = "^[A-za-z0-9_.]{3,20}$";
    /**
     * Comment
     */
    String COMMENT_REGEX = "^[\\-A-Za-z0-9\\., ]{0,}$";
    /**
     * Group
     */
    String GROUP_REGEX = "^[012]$";
    /**
     * Home and mobile phone. +38(000)000-00-00
     */
    String PHONE_REGEX = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    /**
     * email
     */
    String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    /**
     * skype
     */
    String SKYPE_REGEX = "^[A-Za-z0-9_\\.]{5,30}$";
    /**
     * index
     */
    String INDEX_REGEX = "^[0-9]{5}$";
    /**
     * City
     */
    String CITY_REGEX = "^[A-Za-z- ]{3,50}$";
    /**
     * Street
     */
    String STREET_REGEX = "^[A-Za-z- ]{3,50}$";
    /**
     * House number
     */
    String BUILDING_REGEX = "^[A-Za-z0-9-]{1,5}$";
    /**
     * Apartment number
     */
    String APARTMENT_REGEX = "^[0-9]{1,5}$";
}
