package com.ecse437project.tests;

import com.ecse437project.Addition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest{

    @Test
    void shouldAddTwoPositiveNumbers() {
        int x = 5;
        int y = 3;

        int result = Addition.apply(x, y);

        int expected = x + y;
        assertEquals(expected, result);
    }

    @Test
    void shouldAddTwoNegativeNumbers() {
        int x = -5;
        int y = -3;

        int result = Addition.apply(x, y);

        int expected = x + y;
        assertEquals(expected, result);
    }

    @Test
    void shouldAddWithZero() {
        int expected = 5;

        int result = Addition.apply(expected, 0);

        assertEquals(expected, result);
    }
}
