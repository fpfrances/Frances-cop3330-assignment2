/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex25;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PwStrIndicatorTest {
    private PwStrIndicator test;

    @Test
    void passwordValidator_1(){
        int check = test.passwordValidator("1337h@xor!");
        assertEquals(3, check);
    }

    @Test
    void passwordValidator_2(){
        int check = test.passwordValidator("1337h@xor");
        assertEquals(2, check);
    }

    @Test
    void passwordValidator_3(){
        int check = test.passwordValidator("abcdefg");
        assertEquals(1, check);
    }

    @Test
    void passwordValidator_4(){
        int check = test.passwordValidator("1234567");
        assertEquals(0, check);
    }

    @Test
    void passwordValidator_5(){
        int check = test.passwordValidator("1337h@21011");
        assertNotEquals(3, check);
    }

    @Test
    void passwordValidator_6(){
        int check = test.passwordValidator("1ambuscade!!");
        assertNotEquals(3, check);
    }

    @Test
    void passwordValidator_7(){
        int check = test.passwordValidator("12aa!!");
        assertNotEquals(3, check);
    }
}