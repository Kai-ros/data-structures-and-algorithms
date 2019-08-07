package code401challenges.arrayReverse.src;

import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    int[] toBeReversed = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(Arrays.toString(reverseArray(toBeReversed)));
  }

  public static int[] reverseArray(int[] array) {
    int startIndex = 0;
    int endIndex = array.length - 1;

    while (startIndex < endIndex) {
      int tempIndex = array[startIndex];
      array[startIndex] = array[endIndex];
      array[endIndex] = tempIndex;

      startIndex++;
      endIndex--;
    }
    return array;
  }

  // String version of the function.
  // public static void main(String[] args) {
  // String[] toBeReversed = new String[] { "x", "no", "ELIXIR", "42", "quasar",
  // "Mon Santo", "whisker", "validate",
  // "Jehovah", "Massachusetts" };
  // System.out.println(Arrays.toString(reverseArray(toBeReversed)));
  // }

  // public static String[] reverseArray(String[] array) {
  // int startIndex = 0;
  // int endIndex = array.length - 1;

  // while (startIndex < endIndex) {
  // String tempIndex = array[startIndex];
  // array[startIndex] = array[endIndex];
  // array[endIndex] = tempIndex;

  // startIndex++;
  // endIndex--;
  // }
  // return array;
  // }
}
