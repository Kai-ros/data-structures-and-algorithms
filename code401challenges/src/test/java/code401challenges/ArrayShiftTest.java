package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {


    @Test
    public void insertShiftArray_EvenArrayLength() {
        assertArrayEquals(
                "An even array should return an odd array.",
                new int[] {1, 2, 4, 3, 4},
                ArrayShift.insertShiftArray(new int[] {1, 2, 3, 4}, 4)
        );
    }

    @Test
    public void insertShiftArray_OddArrayLength() {
        assertArrayEquals(
                "An odd array should return an even array.",
                new int[] {1, 2, 3, 4, 4, 5, 6, 7},
                ArrayShift.insertShiftArray(new int[] {1, 2, 3, 4, 5, 6, 7}, 4)
        );
    }

    @Test
    public void insertShiftArray_ExpectedLengthFail() {
        assertNotEquals(
                "Array should be shifted.",
                (new int[] {}).length,
                ArrayShift.insertShiftArray(new int[] {1, 2, 3, 4}, 4).length
        );
    }

}