package ConditionCoverageTest;

import org.emp.gl.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchConditionCoverageTest {
    @Test
    void testNullArrayCondition() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 5));
    }

    @Test
    void testElementEqualsMidCondition() {
        assertEquals(2, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 5));
    }

    @Test
    void testElementLessThanMidCondition() {
        assertEquals(1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 3));
    }

    @Test
    void testElementGreaterThanMidCondition() {
        assertEquals(3, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 7));
    }

    @Test
    void testElementNotFoundCondition() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 4));
    }

    @Test
    void testSingleElementFoundCondition() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{5}, 5));
    }

    @Test
    void testSingleElementNotFoundCondition() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{3}, 5));
    }
}