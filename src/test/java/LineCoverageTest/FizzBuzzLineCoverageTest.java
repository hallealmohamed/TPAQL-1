package LineCoverageTest;

import org.emp.gl.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzLineCoverageTest {
    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }

    @Test
    void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void testBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void testNumber() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }
}