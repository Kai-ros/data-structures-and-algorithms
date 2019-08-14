## Singly Linked List
* Code Fellows - Java 401 Implement a Singly Linked List Data Structure

## Challenge
* Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
* Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
    * Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
    *Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
    * Define a method called toString (or __str__ in Python) which takes in no arguments and returns a string representing all the values in the Linked List.
* At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
* Be sure to follow your language/frameworks standard naming conventions (e.g. C# uses PascalCasing for all method and class names).

## Approach & Efficiency
I read through the assignment requirements and then read through online documentation on writing linked lists in Java from scratch. I achieved the desired time/space complexity goals of O(1) and O(n) respectively.

## API
```
prepend()
append()
insertBefore()
insertAfter()
includes()
toString()
kthFromEnd()
```
## Whiteboards
* [Linked List Insertion Methods Whiteboard](./assets/ll_insertions.jpg)
* [Linked List KthFromEnd Method Whiteboard](./assets/ll_kth_from_end.jpg)