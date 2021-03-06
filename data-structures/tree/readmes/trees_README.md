# Trees
Implement a tree. 

## Challenge
* Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
* Create a BinaryTree class
    * Define a method for each of the depth first traversals called ```preOrder```, ```inOrder```, and ```postOrder``` which returns an array of the values, ordered appropriately.
* At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

* Create a BinarySearchTree class
    * Define a method named ```add``` that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
    * Define a method named ```contains``` that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency
I used a recursive approach to my methods to accomplish the feature tasks.
* Time complexity: O(n)
* Space comnplexity: O(n)

## API
* ``` BinarySearchTree.class```
    * ``` BinarySearchTree() // Constructors.```
    * ``` add() // Add a node to the tree at the correct location.```
    * ``` contains() // Check to see if a given value exists in the tree.```
* ``` BinaryTree.class```
    * ``` BinaryTree() // Constructors.```
    * ``` preOrder() // Return an array of the values in pre-order.```
    * ``` inOrder() // Return an array of the values in in-order.```
    * ``` postOrder() // Return an array of the values in post-order.```
    * ``` isEmpty() // Checks to see if the tree is empty.```
    * ``` getRoot() // Returns the value at the root node.```
    
## Collaborators - Day One
* Marisha Hoza, Padmapriya Ganapathi

## Collaborators - Day Two
* Marisha Hoza

## Whiteboards
* [FizzBuzzTree Method Whiteboard](../src/main/resources/fizzbuzz_tree.jpg)




