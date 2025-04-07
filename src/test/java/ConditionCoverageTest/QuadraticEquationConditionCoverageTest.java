package ConditionCoverageTest;

import org.emp.gl.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationConditionCoverageTest {
    @Test
    void testAIsZeroCondition() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 2, 3));
    }

    @Test
    void testDeltaNegativeCondition() {
        assertNull(QuadraticEquation.solve(1, 0, 1));
    }

    @Test
    void testDeltaZeroCondition() {
        assertArrayEquals(new double[]{-1.0}, QuadraticEquation.solve(1, 2, 1));
    }

    @Test
    void testDeltaPositiveCondition() {
        assertArrayEquals(new double[]{1.0, -3.0}, QuadraticEquation.solve(1, 2, -3));
    }

    @Test
    void testDeltaPositiveDifferentRootsCondition() {
        assertArrayEquals(new double[]{3.0, 2.0}, QuadraticEquation.solve(1, -5, 6));
    }
}