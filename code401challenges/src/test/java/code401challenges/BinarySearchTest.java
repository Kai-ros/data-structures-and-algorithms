package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testBinarySearch_ShouldReturnNegativeOneIfArrayIsEmpty() {
        assertEquals(-1, BinarySearch.BinarySearch(new int[] {},0));
    }

    @Test
    public void testBinarySearch_ShouldReturnCorrectIndexIfTargetIsInArray() {
        assertEquals(2, BinarySearch.BinarySearch(new int[] {4,8,15,16,23,42},15));
    }

    @Test
    public void testBinarySearch_ShouldReturnNegativeOneIfTargetIsNotInArray() {
        assertEquals(-1, BinarySearch.BinarySearch(new int[] {11,22,33,44,55,66,77},90));
    }

    @Test
    public void testBinarySearch_ShouldNotReturnIndexIfTargetIsNotInArray() {
        assertNotEquals(2, BinarySearch.BinarySearch(new int[] {11,22,33,44,55,66,77},90));
    }

    @Test
    public void testBinarySearch_ShouldNotReturnNegativeOneIfTargetIsInArray() {
        assertNotEquals(-1, BinarySearch.BinarySearch(new int[] {4,8,15,16,23,42},15));
    }
}