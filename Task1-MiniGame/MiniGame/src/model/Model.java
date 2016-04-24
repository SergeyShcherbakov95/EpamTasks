package model;

import controller.Controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by sergey on 24/04/16.
 */
public class Model {
    /**
     * value of lower border
     */
    private int lowerBorder;
    /**
     * value of upper border
     */
    private int upperBorder;
    /**
     * value which user should guess
     */
    private int hiddenNumber;
    /**
     * previous tries
     */
    private List<Integer> tries = new LinkedList<>();

    //Constructor
    public Model(){
        lowerBorder = Controller.LOWER_BORDER;
        upperBorder = Controller.UPPER_BORDER;
        hiddenNumber = rand(lowerBorder, upperBorder);
    }

    /**
     * @param min min random value
     * @param max max random value
     * @return random value between min and max inclusive
     */
    public int rand(int min, int max){
        Random random = new Random();
        return random.nextInt((max + 1) - min) + min;
    }

    /**
     * @return random value between 0 and Controller.UPPER_BORDER inclusive
     */
    public int rand(){
        return rand(0, Controller.UPPER_BORDER);
    }

    /**
     * @param newValue value which user has inputted
     * @return true when newValue and hiddenValue is the same
     */
    public boolean isVictory(int newValue){
        if(newValue == hiddenNumber) {
            tries.add(newValue);
            return true;
        }
        return false;
    }

    /**
     * check if newValue is between borders
     * @param newValue value which user has inputted
     * @return true when newValue is between borders
     */
    public boolean checkBorders(int newValue){
        if(newValue >= this.lowerBorder && newValue <= this.upperBorder){
            tries.add(newValue);
            updateBorders(newValue);
            return true;
        }
        return false;
    }

    /**
     * update values of border
     * @param newValue value which user has inputted
     */
    public void updateBorders(int newValue){
        if(newValue > hiddenNumber)
            upperBorder = newValue - 1;
        else
            lowerBorder = newValue + 1;
    }

    public int getLowerBorder(){
        return lowerBorder;
    }

    public int getUpperBorder(){
        return upperBorder;
    }

    public List<Integer> getTries(){
        return tries;
    }

    public int getHiddenNumber(){
        return hiddenNumber;
    }
}
