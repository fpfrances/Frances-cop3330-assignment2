/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex26;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotoPayoffCardTest{
    public static final PaymentCalculator calc = new PaymentCalculator();

    @Test
    void calculatorReturn1(){
        int actual = calc.Calculator((12.0/100/365),5000,100);
        assertEquals(70,actual);
    }

    @Test
    void calculatorReturn2(){
        int actual = calc.Calculator((10.0/100/365),10000,1000);
        assertEquals(11,actual);
    }
}