/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex28;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddNumbersTest{

    @Test
    void sumValues1(){

        int[] test = {1,2,3,4,5};
        assertEquals(15,AddNumbers.SumValues(test));
    }

    @Test
    void sumValues2(){

        int[] test = {5,5,5,5,5};
        assertEquals(25,AddNumbers.SumValues(test));
    }

    @Test
    void sumValues3(){

        int[] test = {50,50,50,50,50};
        assertEquals(250,AddNumbers.SumValues(test));
    }
}