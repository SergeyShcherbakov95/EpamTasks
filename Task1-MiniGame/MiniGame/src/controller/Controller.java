package controller;

import model.Model;
import view.View;

import java.util.Scanner;

/**
 * Created by sergey on 24/04/16.
 */
public class Controller {
    //Constants
    public static final int UPPER_BORDER = 99;
    public static final int LOWER_BORDER = 1;

    private View view;
    private Model model;

    // Constructor
    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
    }

    /**
     * The Work method
     */
    public void processGame(){
        Scanner sc = new Scanner(System.in);

        int value = 0;
        while(!model.isVictory(value = getNewValue(sc))){
            if(model.checkBorders(value)) {
                if(value > model.getHiddenNumber())
                    view.printMessage(View.VALUE_LOWER + value);
                else
                    view.printMessage(View.VALUE_UPPER + value);
            }
            else
                view.printMessage(View.WRONG_BORDER);
        }

        view.printMessage(View.VICTORY, value, model.getTries());
    }

    /**
     *  The Utility method
     */
    private int getNewValue(Scanner sc){
        view.printMessage(View.INPUT_NEW_VALUE, model.getLowerBorder(), model.getUpperBorder(), model.getTries());

        while(!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA);
            view.printMessage(View.INPUT_NEW_VALUE, model.getLowerBorder(), model.getUpperBorder(), model.getTries());
            sc.next();
        }

        return sc.nextInt();
    }
}
