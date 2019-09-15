package algorithms;

public class MergeSort
{
    int[] array;

    MergeSort(){}

    MergeSort(int[] array)
    {
        this.array = array;
    }

    public int[] mergeSort()
    {
        return mergeSort(array);
    }

    public int[] mergeSort(int[] array)
    {
        // Ensure the array is not a null value so that operations can be performed on it.
        if (array == null)
        {
            return array;
        }

        int arraySize = array.length;

        // Base Case: So long as there is more than one element in each array, continue to recurse.
        if ( arraySize > 1)
        {
            int midPoint = arraySize / 2;
            // Left array is set to size first index --> midpoint.
            int[] left = new int[midPoint];
            // Right array is set to size midpoint --> last index.
            int[] right = new int[arraySize - midPoint];

            // The elements of the array being passed in are fed into the array halves.
            System.arraycopy(array, 0, left, 0, left.length);
            System.arraycopy(array, left.length, right, 0, right.length);

            // The left array is recursed over and split.
            mergeSort(left);
            // The right array is recursed over and split.
            mergeSort(right);
            // Merge is called independent of the recursive calls
            merge(left, right, array);
        }
        return array;
    }

    private void merge(int[] arrayLeft, int[] arrayRight, int[] resultArray)
    {
        // i
        int leftIndex = 0;

        // j
        int rightIndex = 0;

        // k
        int arrayIndex = 0;

        // Perform merge operation for as long as there are elements left in each array
        while ((leftIndex < arrayLeft.length) && (rightIndex < arrayRight.length))
        {
            // If left value is less than or equal to right, left value is added to array.
            if (arrayLeft[leftIndex] <= arrayRight[rightIndex])
            {
                resultArray[arrayIndex] = arrayLeft[leftIndex];
                leftIndex++;
            }
            // Else right value is less than or equal to left, right value is added to array.
            else
            {
                resultArray[arrayIndex] = arrayRight[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }
        // At the completion of the while loop left/right array are merged into the result array.
        System.arraycopy(arrayLeft, leftIndex, resultArray, arrayIndex, arrayLeft.length - leftIndex);
        System.arraycopy(arrayRight, rightIndex, resultArray, arrayIndex, arrayRight.length - rightIndex);
    }

    public String toString()
    {
        StringBuilder output = new StringBuilder();
        int i = 0;
        while (i < array.length)
        {
            output.append("Array at index ").append(i).append(" - ").append(array[i]).append("\n");
            i++;
        }
        return output.toString();
    }
}
