package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest
{
    BinarySearchTree binarySearchTree = new BinarySearchTree();
    BinarySearchTree binarySearchTree2 = new BinarySearchTree();
    BinarySearchTree binarySearchTree3 = new BinarySearchTree();
    FizzBuzzTree fizzBuzzTree = new FizzBuzzTree();

    @Before
    public void initializeTestData()
    {
        binarySearchTree.add(7);
        binarySearchTree.add(8);
        binarySearchTree.add(2);
        binarySearchTree.add(4);
        binarySearchTree.add(12);
        binarySearchTree.add(3);
        binarySearchTree.add(5);
        binarySearchTree.add(25);
        binarySearchTree.add(15);
        binarySearchTree.add(30);

        binarySearchTree2.add(60);
    }

    @Test
    public void fizzBuzzTree()
    {
        BinaryTree<Object> result = fizzBuzzTree.fizzBuzzTree(binarySearchTree);
        assertEquals("Fizzbuzz successfully alters the values of the nodes in the tree.", "[7, 2, 4, Fizz, Buzz, 8, Fizz, Buzz, FizzBuzz, FizzBuzz]", Arrays.toString(result.preOrder()));
    }

    @Test
    public void fizzBuzzTree_SingleNode()
    {
        BinaryTree<Object> result = fizzBuzzTree.fizzBuzzTree(binarySearchTree2);
        assertEquals("Fizzbuzz successfully alters a tree containing only a root node.", "[FizzBuzz]", Arrays.toString(result.preOrder()));
    }

    @Test
    public void fizzBuzzTree_EmptyTree()
    {
        BinaryTree<Object> result = fizzBuzzTree.fizzBuzzTree(binarySearchTree3);
        assertEquals("Fizzbuzz successfully returns an empty tree when given an empty tree.", "[]", Arrays.toString(result.preOrder()));
    }
}