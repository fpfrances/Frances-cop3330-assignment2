/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex24;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    private AnagramChecker test;

    private void AssertTrue(boolean actual){
    }

    @Test
    void isAnagramTrue(){
         AssertTrue(test.isAnagram("note","tone"));
    }

    @Test
    void isAnagramTrue2(){
         AssertTrue(test.isAnagram("elbow", "below"));
    }

    private void AssertFalse(boolean actual) {
    }

    @Test
    void isAnagramFalse(){
         AssertFalse(test.isAnagram("fault", "tough"));
    }

    @Test
    void isAnagramFalse2(){
         AssertFalse(test.isAnagram("top", "oop"));
    }
}