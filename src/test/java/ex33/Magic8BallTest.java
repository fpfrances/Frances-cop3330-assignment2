/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex33;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    @Test
    void RandomTest(){
        for (int i = 0; i < 100; i++){
            int test = Magic8Ball.randomGen();
            if (test >= 0 && test < 20){
                assertEquals(1, 1);
            } else {
                assertEquals(0, 1);
           }
        }
    }

    @Test
    void OutputResult(){
        String[] responses = Magic8Ball.GenRR();
        String actual = responses[4];
        String expected = "Reply try it again.";
        assertEquals(actual, expected);
    }
}