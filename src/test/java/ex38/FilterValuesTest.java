/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex38;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilterValuesTest {

    @Test
    void test1(){
        String test = "1 2 3 4 5 6 7 8";
        Integer[] actual = FilterValues.DataSplit(test);
        Integer[] expected = {2, 4, 6, 8};
        assertArrayEquals(actual, expected);
    }

    @Test
    void test2(){
        String test = "1 3 5 6 7 12 15 16 18 22 24 28 33 37";
        Integer[] actual = FilterValues.DataSplit(test);
        Integer[] expected = {6, 12, 16, 18, 22, 24, 28};
        assertArrayEquals(actual, expected);
    }
}