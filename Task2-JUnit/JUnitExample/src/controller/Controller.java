package controller;

import model.Model;
import view.View;

import java.util.Scanner;

/**
 * Created by sergey on 28/04/16.
 */
public class Controller {
    private View view;
    private Model model;

    /**
     * Constructor
     */
    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
    }

    /**
     * The Work method
     */
    public void processApp(){
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while((i = this.getNewValue(sc)) != 0){
            model.setNumber(i);
            try {
                view.printMessage(View.SUM_RESULT + model.sumOfDigits());
                view.printMessage(View.MULTIPLICATION_RESULT + model.multiplicationOfDigits());
            } catch(IllegalArgumentException ex){
                view.printMessage(View.WRONG_NUMBER_OF_DIGITS);
            }
        }
    }

    /**
     *  The Utility method
     */
    private int getNewValue(Scanner sc){
        view.printMessage(View.LINE);
        view.printMessage(View.INPUT);

        while(!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA);
            view.printMessage(View.INPUT);
            sc.next();
        }

        return sc.nextInt();
    }
}
