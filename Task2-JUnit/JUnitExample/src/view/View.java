package view;

/**
 * Created by sergey on 28/04/16.
 */
public class View {
    public static final String WRONG_NUMBER_OF_DIGITS = "The number should consist of 3 digits";
    public static final String INPUT = "Input  int value (exit - 0) - ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please!";
    public static final String SUM_RESULT = "Sum of digits = ";
    public static final String MULTIPLICATION_RESULT = "Multiplication of digits = ";
    public static final String LINE = "-----------------";

    public void printMessage(String message){
        System.out.println(message);
    }
}
