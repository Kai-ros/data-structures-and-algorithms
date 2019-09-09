package algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest
{
    InsertionSort insertionSort;
    int[] testArraySorted;
    int[] testArrayEmpty;
    int[] testArrayUnsorted;
    int[] testArrayImbalanced;

    @Before
    public void initializeData()
    {
        testArraySorted = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        testArrayEmpty = new int[]{};
        testArrayUnsorted = new int[]{ 7, 4, 8, 9, 2, 3, 4, 5, 6, 7, 2, 5, 2, 7, 5, 4, 7, 0 };
        testArrayImbalanced = new int[]{ 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    }

    @Test
    public void insertionSort()
    {
        insertionSort = new InsertionSort();

        assertEquals(
                "Method should return an array.",
                null,
                insertionSort.insertionSort());
    }

    @Test
    public void insertionSort_SortedArray()
    {
        insertionSort = new InsertionSort(testArraySorted);
        insertionSort.insertionSort();

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
                insertionSort.toString());
    }

    @Test
    public void insertionSort_UnsortedArray()
    {
        insertionSort = new InsertionSort(testArrayUnsorted);
        insertionSort.insertionSort();

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
                insertionSort.toString());
    }

    @Test
    public void insertionSort_ImbalancedArray()
    {
        insertionSort = new InsertionSort(testArrayImbalanced);
        insertionSort.insertionSort();

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
                insertionSort.toString());
    }

    @Test
    public void insertionSort_EmptyArray()
    {
        insertionSort = new InsertionSort(testArrayEmpty);
        insertionSort.insertionSort();

        assertEquals(
                "Method should return an empty array.",
                "",
                insertionSort.toString());
    }
}