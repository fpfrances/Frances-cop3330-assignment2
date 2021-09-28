/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex35;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class WinnerPickTest {

    @Test
    void main() {
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            names.add("name...");
            for (int j = 0; j < names.size(); j++) {
                int n = WinnerPick.rng(names);
                if (n > names.size() - 1) {
                    fail();
                }
            }
        }
    }
}