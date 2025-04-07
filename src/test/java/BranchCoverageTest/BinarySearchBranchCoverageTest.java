package BranchCoverageTest;

import org.emp.gl.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchBranchCoverageTest {
    @Test
    void testNullArrayBranch() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 5));
    }

    @Test
    void testEmptyArrayBranch() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{}, 5));
    }

    @Test
    void testSingleElementFoundBranch() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{5}, 5));
    }

    @Test
    void testSingleElementNotFoundBranch() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{3}, 5));
    }

    @Test
    void testElementFoundFirstHalfBranch() {
        assertEquals(1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 3));
    }

    @Test
    void testElementFoundSecondHalfBranch() {
        assertEquals(3, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 7));
    }

    @Test
    void testElementNotFoundBetweenValuesBranch() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 4));
    }

    @Test
    void testElementNotFoundOutsideRangeBranch() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 10));
    }
}