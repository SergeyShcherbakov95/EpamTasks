package model;

import static org.junit.Assert.*;

/**
 * Created by sergey on 28/04/16.
 */
public class ModelTest {
    @org.junit.Test
    public void testMultiplicationOfDigits_positiveValue_positive() throws Exception {
        Model model = new Model(423);

        int number = model.multiplicationOfDigits();

        assertEquals(24, number);
    }

    @org.junit.Test
    public void testMultiplicationOfDigits_negativeValue_positive() throws Exception {
        Model model = new Model(-423);

        int number = model.multiplicationOfDigits();

        assertEquals(24, number);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testMultiplicationOfDigits_numberHasFourOrMoreDigits() throws Exception {
        Model model = new Model(4236);

        model.multiplicationOfDigits();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testMultiplicationOfDigits_numberHasTwoOrLessDigits() throws Exception {
        Model model = new Model(42);

        model.multiplicationOfDigits();
    }

    @org.junit.Test
    public void testSumOfDigits_positiveValue_positive() throws Exception {
        Model model = new Model(423);

        int number = model.sumOfDigits();

        assertEquals(9, number);
    }

    @org.junit.Test
    public void testSumOfDigits_negativeValue_positive() throws Exception {
        Model model = new Model(-423);

        int number = model.sumOfDigits();

        assertEquals(9, number);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSumOfDigits_numberHasTwoOrMoreDigits() throws Exception {
        Model model = new Model(-4234);

        model.multiplicationOfDigits();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSumOfDigits_numberHasTwoOrLessDigits() throws Exception {
        Model model = new Model(-99);

        model.multiplicationOfDigits();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCheckNumber_negativeNumberHasTwoOrLessDigits() throws Exception {
        Model model = new Model(-99);

        model.checkNumber();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCheckNumber_negativeNumberHasFourOrMoreDigits() throws Exception {
        Model model = new Model(-1000);

        model.checkNumber();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCheckNumber_positiveNumberHasTwoOrLessDigits() throws Exception {
        Model model = new Model(99);

        model.checkNumber();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCheckNumber_positiveNumberHasFourOrMoreDigits() throws Exception {
        Model model = new Model(1000);

        model.checkNumber();
    }

    @org.junit.Test
    public void testGetDigets_positive() throws Exception {
        Model model = new Model(123);

        int[] digets = model.getDigets();

        assertEquals(1, digets[0]);
        assertEquals(2, digets[1]);
        assertEquals(3, digets[2]);
    }
}