/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex29;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HandBadInputTest {

    private HandBadInput test;

    @Test
    void check1() {
        assertFalse(test.driver("0"));
    }

    @Test
    void check2() {
        assertFalse(test.driver("letters"));
    }

    @Test
    void check3() {
        assertTrue(test.driver("4"));
    }

    @Test
    void check4() {
        assertTrue(test.isInt("0"));
    }

    @Test
    void check5() {
        assertFalse(test.isInt("ABC"));
    }
}