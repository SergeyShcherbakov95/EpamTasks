package model;

/**
 * Created by sergey on 28/04/16.
 */
public class Model {
    /**
     * value which user inputted
     */
    private int number;

    /**
     * Constructor without arguments
     */
    public Model(){
        //NOP
    }

    /**
     * Constructor
     * @param number value which user inputted
     */
    public Model(int number){
        this.number = number;
    }

    /**
     * setter
     * @param number
     */
    public void setNumber(int number){
        this.number = number;
    }

    /**
     * getter
     * @return value of field number
     */
    public int getNumber(){
        return this.number;
    }

    /**
     * get digits of number and multiplication them
     * @return result of multiplication
     */
    public int multiplicationOfDigits(){
        checkNumber();

        int[] digets = this.getDigets();

        int multiplication = 1;
        for(int diget : digets)
            multiplication *= diget;

        return multiplication;
    }

    /**
     * get digits of number and sum them
     * @return result of sum
     */
    public int sumOfDigits(){
        checkNumber();

        int[] digets = this.getDigets();

        int sum = 0;
        for(int diget : digets)
            sum += diget;

        return sum;
    }

    /**
     * check if number contains 3 digits. The method throws exception if false
     */
    public void checkNumber(){
        if((this.number < 100 && this.number > -100) || this.number > 999 || this.number < -999)
            throw new IllegalArgumentException();
    }

    /**
     * @return digits of number
     */
    public int[] getDigets(){
        int[] digets = new int[3];

        int tempNumber = ( this.number > 0 ) ? this.number : (-1)*this.number;
        for(int i = 100, j = 0; j < 3; i /= 10, j++) {
            digets[j] = tempNumber / i;
            tempNumber = tempNumber%i;
        }

        return digets;
    }
}
