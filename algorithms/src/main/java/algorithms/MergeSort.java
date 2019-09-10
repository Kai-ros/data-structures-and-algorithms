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
        if (array == null)
        {
            return array;
        }

        int arraySize = array.length;

        if ( arraySize > 1)
        {
            int midPoint = arraySize / 2;
            int[] left = new int[midPoint];
            int[] right = new int[arraySize - midPoint];

            System.arraycopy(array, 0, left, 0, left.length);
            System.arraycopy(array, left.length, right, 0, right.length);

            mergeSort(left);
            mergeSort(right);
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

        while ((leftIndex < arrayLeft.length) && (rightIndex < arrayRight.length))
        {
            if (arrayLeft[leftIndex] <= arrayRight[rightIndex])
            {
                resultArray[arrayIndex] = arrayLeft[leftIndex];
                leftIndex++;
            }
            else
            {
                resultArray[arrayIndex] = arrayRight[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }
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
