## Stacks and Queues
* Code Fellows - Java 401 Implement Stack and Queue Data Structures

## Challenge
* Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
* Create a Stack class that has a top property. It creates an empty Stack when instantiated.
    * This object should be aware of a default empty value assigned to top when the stack is created.
    * Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
    * Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
    * Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
* Create a Queue class that has a front property. It creates an empty Queue when instantiated.
    * This object should be aware of a default empty value assigned to front when the queue is created.
    * Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
    * Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
    * Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
* At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
* Be sure to follow your languages best practices for naming conventions.

## Approach & Efficiency
I read through the assignment requirements and then read through online documentation on writing stacks and queues in Java from scratch. I didn't want to rely on an underlying data structure and instead made the class itself into a data structure. I achieved the desired time/space complexity goals of O(1) and O(n) respectively. 

## API
```
--Stack.class
----Stack()
----push()
----pop()
----peek()
----top()
----size()
----toString()
--Queue.class
----Queue()
----enqueue()
----dequeue()
----peek()
----front()
----back()
----size()
----toString()
```

## Whiteboards
* No Whiteboards Yet!
<!--* [No Whiteboards Yet!](./assets/ll_insertions.jpg)-->
