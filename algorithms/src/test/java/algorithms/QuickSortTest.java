package algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest
{
    QuickSort quickSort;
    int[] testArraySorted;
    int[] testArrayEmpty;
    int[] testArrayUnsorted;
    int[] testArrayImbalanced;

    @Before
    public void initializeData()
    {
        testArraySorted = new int[] { 1,2,3,4,5,6,7,8,9,10 };
        testArrayEmpty = new int[] {};
        testArrayUnsorted = new int[] { 7, 4, 8, 9, 2, 3, 4, 5, 6, 7, 2, 5, 2, 7, 5, 4, 7, 0 };
        testArrayImbalanced = new int[] { 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    }

    @Test
    public void quickSort()
    {
        quickSort = new QuickSort();

        assertEquals(
                "Method should return an array.",
                null,
                quickSort.quickSort());
    }

    @Test
    public void quickSort_SortedArray()
    {
        quickSort = new QuickSort(testArraySorted);
        quickSort.quickSort();

        assertEquals(
                "Method should return a sorted array.",
                "Array at index 0 - 1\n" +
                        "Array at index 1 - 2\n" +
                        "Array at index 2 - 3\n" +
                        "Array at index 3 - 4\n" +
                        "Array at index 4 - 5\n" +
                        "Array at index 5 - 6\n" +
                        "Array at index 6 - 7\n" +
                        "Array at index 7 - 8\n" +
                        "Array at index 8 - 9\n" +
                        "Array at index 9 - 10\n",
                quickSort.toString());
    }

    @Test
    public void quickSort_UnsortedArray()
    {
        quickSort = new QuickSort(testArrayUnsorted);
        quickSort.quickSort();

        assertEquals(
                "Method should return a sorted array.",
                "Array at index 0 - 0\n" +
                        "Array at index 1 - 2\n" +
                        "Array at index 2 - 2\n" +
                        "Array at index 3 - 2\n" +
                        "Array at index 4 - 3\n" +
                        "Array at index 5 - 4\n" +
                        "Array at index 6 - 4\n" +
                        "Array at index 7 - 4\n" +
                        "Array at index 8 - 5\n" +
                        "Array at index 9 - 5\n" +
                        "Array at index 10 - 5\n" +
                        "Array at index 11 - 6\n" +
                        "Array at index 12 - 7\n" +
                        "Array at index 13 - 7\n" +
                        "Array at index 14 - 7\n" +
                        "Array at index 15 - 7\n" +
                        "Array at index 16 - 8\n" +
                        "Array at index 17 - 9\n",
                quickSort.toString());
    }

    @Test
    public void quickSort_ImbalancedArray()
    {
        quickSort = new QuickSort(testArrayImbalanced);
        quickSort.quickSort();

        assertEquals(
                "Method should return a sorted array.",
                "Array at index 0 - 1\n" +
                        "Array at index 1 - 1\n" +
                        "Array at index 2 - 1\n" +
                        "Array at index 3 - 1\n" +
                        "Array at index 4 - 1\n" +
                        "Array at index 5 - 1\n" +
                        "Array at index 6 - 1\n" +
                        "Array at index 7 - 1\n" +
                        "Array at index 8 - 1\n" +
                        "Array at index 9 - 1\n" +
                        "Array at index 10 - 1\n" +
                        "Array at index 11 - 1\n" +
                        "Array at index 12 - 1\n" +
                        "Array at index 13 - 1\n" +
                        "Array at index 14 - 1\n" +
                        "Array at index 15 - 1\n" +
                        "Array at index 16 - 1\n" +
                        "Array at index 17 - 4\n",
                quickSort.toString());
    }

    @Test
    public void quickSort_EmptyArray()
    {
        quickSort = new QuickSort(testArrayEmpty);
        quickSort.quickSort();

        assertEquals(
                "Method should return an empty array.",
                "",
                quickSort.toString());
    }
}