
# Blog Notes: Quick Sort
Quick Sort is a divide and conquer algorithm, in that it separates the problem set into subsets and solves the smaller sets before combining them back together to solve the whole.
It is a comparison sort as well as an unstable sort, in that it does not preserve the relative position of elements in the original array.
It is one of the most broadly utilized sorting algorithms, especially when dealing with large data volumes. 
This is because quick sort is one of the fastest algorithms available under most circumstances.
Of critical importance when implementing the quick sort is choosing the pivot point, this choice in fact is what differentiates between the various flavors of quick sort.
Choosing the middle element in the range of numbers present would be optimal but this would be difficult and time consuming so instead we are left with 4 options to select our pivot point from:
* The first element
* The last element
* The median element
* A random element

Using this pivot the given data is partitioned accordingly and compared against the pivot.
To the left of the pivot will go the elements of lesser value than the pivot and to the right will go the elements of greater value than the pivot.


## Learning Objectives
* The primary focus of this blog post is to explore and explain the nuances of the quick method of sorting algorithms.
* Pros and cons of quick sort 
* Visualization of the algorithm at work

## Information Flow
* Given its average time complexity, quick sort is one of the fastest sorting algorithms available to us, though in worst case it does require at quadratic time.
    * Despite its worst case scenario being of quadratic time complexity, quick sort is still a widely favored sorting algorithm because the average time complexity occurs with far more frequency than does the worst case.
* The space complexity of O(log(n)) is of note as the sort operates in-place and has a low requirement for additional memory. 
    * Even though space concerns can be considered negligible in the vast majority of modern programming scenarios, optimizing for space is still a pertinent endeavor, especially when considering very large systems.
    
## Diagram
* ![Quick Sort Process](https://3.bp.blogspot.com/-2XKswkxXtE0/U8EkLJIt2BI/AAAAAAAABr0/0S34Aan5jMI/s1600/Quicksort-in-Java-example-fast.gif)

## Algorithm
* Step 1 − We choose an element from the list, called the pivot. We'll use it to divide the list into two sub-lists.
* Step 2 − We reorder all the elements around the pivot – the ones with smaller value are placed before it, and all the elements greater than the pivot after it. After this step, the pivot is in its final position. This is the important partition step.
* Step 3 − We apply the above steps recursively to both sub-lists on the left and right of the pivot.

## Pseudocode
```
 ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
```

## Readings and References

####  Watch
* [Derek Banas Quick Sort Algorithm in Java Video](https://www.youtube.com/watch?v=mN5ib1XasSA&t=44s)

#### Read
* [Baeldung Quick Sort in Java Article](https://www.baeldung.com/java-quicksort)
* [InterviewBit Quick Sort Article](https://www.interviewbit.com/tutorial/quicksort-algorithm/)
* [JavaTPoint Quick Sort Article](https://www.javatpoint.com/quick-sort)
* [HackerEarth Quick Sort Article](https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/tutorial/)

#### Bookmark
* [Visualgo Quick Sort Site Link](https://visualgo.net/en/sorting?slide=11)


