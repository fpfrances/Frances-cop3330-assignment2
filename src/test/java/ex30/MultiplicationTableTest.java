/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex30;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {

    @Test
    void Row2Test() {
        int[] test = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
        String actual = MultiplicationTable.Rows(test);
        String expected = "   2   4   6   8  10  12  14  16  18  20  22  24";
        assertEquals(expected, actual);
    }

    @Test
    void Row5Test() {
        int[] test = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
        String actual = MultiplicationTable.Rows(test);
        String expected = "   5  10  15  20  25  30  35  40  45  50  55  60";
        assertEquals(expected, actual);
    }

    @Test
    void Row10Test() {
        int[] test = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
        String actual = MultiplicationTable.Rows(test);
        String expected = "  10  20  30  40  50  60  70  80  90 100 110 120";
        assertEquals(expected, actual);
    }
}