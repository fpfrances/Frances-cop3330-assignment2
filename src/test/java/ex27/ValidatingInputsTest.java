/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex27;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidatingInputsTest {

    @Test
    void validateName_test_1() {
        int actual = ValidatingInputs.validateName("Johnson");
        assertEquals(0, actual);

    }

    @Test
    void validateName_test_2() {
        int actual = ValidatingInputs.validateName("");
        assertEquals(1, actual);

    }

    @Test
    void validateName_test_3() {
        int actual = ValidatingInputs.validateName("a");
        assertEquals(2, actual);

    }

    @Test
    void id_test_1() {
        boolean actual = ValidatingInputs.validateID("TK-4321");
        assertTrue(actual);
    }

    @Test
    void id_test_2() {
        boolean actual = ValidatingInputs.validateID("A12-1234");
        assertFalse(actual);

    }

    @Test
    void id_test_3() {
        boolean actual = ValidatingInputs.validateID("A-12345");
        assertFalse(actual);

    }

    @Test
    void zip_test_1() {
        boolean actual = ValidatingInputs.validateZIP("420");
        assertFalse(actual);

    }

    @Test
    void zip_test_2() {
        boolean actual = ValidatingInputs.validateZIP("69A96");
        assertFalse(actual);

    }

    @Test
    void zip_test_3() {
        boolean actual = ValidatingInputs.validateZIP("666666");
        assertFalse(actual);

    }

    @Test
    void zip_test_4() {
        boolean actual = ValidatingInputs.validateZIP("12345");
        assertTrue(actual);

    }
}