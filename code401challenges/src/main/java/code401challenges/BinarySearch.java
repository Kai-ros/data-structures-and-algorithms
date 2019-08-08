package code401challenges;

public class BinarySearch {
    public static int BinarySearch(int[] inputArray, int targetValue) {
        int lowIndex = 0;
        int highIndex = inputArray.length - 1;
        int currentIndex = -1;

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;

            if (inputArray[midIndex] < targetValue)
                lowIndex = midIndex + 1;
            else if (inputArray[midIndex] > targetValue)
                highIndex = midIndex - 1;
            else if (inputArray[midIndex] == targetValue) {
                currentIndex = midIndex;
                break;
            }
        }
        return currentIndex;
    }
}
