package code401challenges;

import java.util.Arrays;

public class ArrayShift {
    public static int[] insertShiftArray(int[] inputArray, int inputNumber) {
        int[] outputArray = new int [inputArray.length + 1];
        int midpointIndex;

        midpointIndex = (inputArray.length % 2 == 1 ? inputArray.length/2 + 1 : inputArray.length/2);

        for (int i = 0; i < outputArray.length; i++) {
            if (i < midpointIndex) outputArray[i] = inputArray[i];
            else if (i == midpointIndex) outputArray[i] = inputNumber;
            else outputArray[i] = inputArray[i - 1];
        }

        return outputArray;
    }
}