/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex32;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuessNumberGameTest {

    @Test
    void highLow1(){
        int actual = GuessNumberGame.highLOW(70,50);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    void highLow2(){
        int actual = GuessNumberGame.highLOW(30,50);
        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    void highLOW3(){
        int actual = GuessNumberGame.highLOW(40,40);
        int expected = 0;
        assertEquals(actual, expected);
    }
}