# Reverse an Array
This is the first code challenge of Code Fellows 401 Java course.

## Challenge
Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.

## Approach & Efficiency
My partner and I utilized the two-pointer technique to solve the problem. The first pointer is set to the starting index of the array and thesecond pointer is set to the last index of the array and upon every iteration of the while loop the values at those two locations are swapped. This while loop persists so long as the first pointer is not greater than the second pointer.

The time complexity of this solution is O(n) and the space complexity is O(1),

## Solution
![Whiteboard image of reverse array.](/assets/reverseAnArray.jpg)