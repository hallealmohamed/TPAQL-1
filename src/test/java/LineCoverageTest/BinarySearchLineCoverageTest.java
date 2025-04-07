package LineCoverageTest;

import org.emp.gl.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchLineCoverageTest {
    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 5));
    }

    @Test
    void testEmptyArray() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{}, 5));
    }

    @Test
    void testSingleElementFound() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{5}, 5));
    }

    @Test
    void testSingleElementNotFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{3}, 5));
    }

    @Test
    void testElementFoundAtBeginning() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 1));
    }

    @Test
    void testElementFoundAtEnd() {
        assertEquals(4, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 9));
    }

    @Test
    void testElementFoundMiddle() {
        assertEquals(2, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 5));
    }

    @Test
    void testElementNotFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 3, 5, 7, 9}, 4));
    }
}