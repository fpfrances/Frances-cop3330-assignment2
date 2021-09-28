package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {

   @Test
    void isNumeric1() {
       boolean actual = HeartRate.isNumeric("75");
       assertTrue(actual);
    }

    @Test
    void isNumeric2() {
        boolean actual = HeartRate.isNumeric("35");
        assertTrue(actual);
    }

    @Test
    void isNumeric3() {
        boolean actual = HeartRate.isNumeric("twelve");
        assertFalse(actual);
    }

    @Test
    void isNumeric4() {
        boolean actual = HeartRate.isNumeric("sixty");
        assertFalse(actual);
    }
}