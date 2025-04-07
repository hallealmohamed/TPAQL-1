package BranchCoverageTest;

import org.emp.gl.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzBranchCoverageTest {
    @Test
    void testInvalidInputBranch() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }

    @Test
    void testFizzBranch() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void testBuzzBranch() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void testFizzBuzzBranch() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void testNumberBranch() {
        assertEquals("2", FizzBuzz.fizzBuzz(2));
    }

    @Test
    void testFizzNotBuzzBranch() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    void testBuzzNotFizzBranch() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }
}