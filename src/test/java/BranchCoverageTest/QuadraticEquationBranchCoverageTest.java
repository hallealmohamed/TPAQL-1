package BranchCoverageTest;

import org.emp.gl.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationBranchCoverageTest {
    @Test
    void testLinearEquationBranch() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 2, 3));
    }

    @Test
    void testNegativeDeltaBranch() {
        assertNull(QuadraticEquation.solve(1, 0, 1));
    }

    @Test
    void testZeroDeltaBranch() {
        assertArrayEquals(new double[]{-1.0}, QuadraticEquation.solve(1, 2, 1));
    }

    @Test
    void testPositiveDeltaBranch() {
        assertArrayEquals(new double[]{1.0, -3.0}, QuadraticEquation.solve(1, 2, -3));
    }
}