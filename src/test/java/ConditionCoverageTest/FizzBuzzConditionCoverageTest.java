package ConditionCoverageTest;

import org.emp.gl.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzConditionCoverageTest {
    @Test
    void testInvalidInputCondition() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }

    @Test
    void testDivisibleBy3OnlyCondition() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void testDivisibleBy5OnlyCondition() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void testDivisibleByBothCondition() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void testDivisibleByNeitherCondition() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    void testDivisibleBy3Not5Condition() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    void testDivisibleBy5Not3Condition() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }
}