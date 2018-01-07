package com.example.mehta.ands6a1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

/* Smaple JUNIT Test to test clsCalculator Class */
public class clsCalculatorTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(15, new clsCalculator().addTwoNumbers(10,5));
    }
    @Test
    public void subtraction_isCorrect() throws Exception {
        assertEquals(5, new clsCalculator().subtractTwoNumbers(10,5));
    }
    @Test
    public void multiplication_isCorrect() throws Exception {
        assertEquals(50, new clsCalculator().multiplyTwoNumbers(10,5));
    }
    @Test
    public void division_isCorrect() throws Exception {
        assertEquals(2, new clsCalculator().divisionTwoNumbers(10,5));
    }
}