package view;

import java.util.List;

/**
 * Created by sergey on 24/04/16.
 */
public class View {
    //Constants
    public static final String INPUT_NEW_VALUE = "Input int value = ";
    public static final String WRONG_BORDER = "Value is not included in border";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please!";
    public static final String VICTORY = "You win!!! The hidden value is ";
    public static final String VALUE_LOWER = "The hidden value is less than ";
    public static final String VALUE_UPPER = "The hidden value is more than ";

    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     * print information about borders and previous tries
     * @param message
     * @param lowerBorder current lower border
     * @param upperBorder current upper border
     * @param tries previous tries
     */
    public void printMessage(String message, int lowerBorder, int upperBorder, List<Integer> tries){
        System.out.println("---------------------------");
        System.out.println("Tries - " + tries);
        System.out.println("Border - [" + lowerBorder + ", " + upperBorder + "]");
        System.out.println(message);
    }

    /**
     * print final information
     * @param message
     * @param hiddenValue
     * @param tries previous tries
     */
    public void printMessage(String message, int hiddenValue, List<Integer> tries){
        System.out.println("---------------------------");
        System.out.println(message + hiddenValue);
        System.out.println("Tries - " + tries);
        System.out.println("Number of tries - " + tries.size());
    }
}
