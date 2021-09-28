/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex36;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class CompStatsTest{

    @Test
    void average_test(){
        ArrayList<Double> input = new ArrayList<>();
        input.add(100.0);
        input.add(100.0);
        input.add(100.0);
        double actual = CompStats.DataCheck.average(input);
        double expected = 100.0;
        assertEquals(actual, expected);
    }

    @Test
    void min_test(){
        ArrayList<Double> input = new ArrayList<>();
        input.add(50.0);
        input.add(100.0);
        input.add(200.0);
        double actual = CompStats.DataCheck.minimum(input);
        double expected = 50.0;
        assertEquals(actual, expected);
    }

    @Test
    void max_test(){
        ArrayList<Double> input = new ArrayList<>();
        input.add(50.0);
        input.add(100.0);
        input.add(200.0);
        double actual = CompStats.DataCheck.maximum(input);
        double expected = 200.0;
        assertEquals(actual, expected);
    }

    @Test
    void std_test(){
        ArrayList<Double> input = new ArrayList<>();
        input.add(50.0);
        input.add(100.0);
        input.add(200.0);
        double actual = CompStats.DataCheck.standardDeviation(input, 350);
        double expected = 241.52;
        assertEquals(actual, expected);
    }
}