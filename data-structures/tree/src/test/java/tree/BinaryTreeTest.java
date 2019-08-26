package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest
{
    BinarySearchTree binarySearchTree = new BinarySearchTree();

    @Before
    public void initializeTestData()
    {
        binarySearchTree.add(7);
        binarySearchTree.add(8);
        binarySearchTree.add(2);
        binarySearchTree.add(4);
        binarySearchTree.add(12);
    }

    @Test
    public void testBinaryTree()
    {
        BinaryTree binaryTree = new BinaryTree();

        assertEquals("Binary tree should be empty.", true, binaryTree.isEmpty());
    }

    @Test
    public void testBinaryTree_Root()
    {
        BinaryTree binaryTree = new BinaryTree(7);
        assertEquals("Root should exist and have a value.", 7, binaryTree.getRoot().dataValue);
    }

    @Test
    public void testBinaryTree_AddTwoNodes()
    {
        Node leftChild = new Node(4);
        Node rightChild = new Node(10);
        Node root = new Node(7, leftChild, rightChild);
        BinaryTree binaryTree = new BinaryTree(root);
        String inOrderResult = Arrays.toString(binaryTree.inOrder());

        assertEquals("The root has two nodes added to it.", "[4, 7, 10]", inOrderResult);
    }

    @Test
    public void testPreOrder()
    {
        String preOrderResult = Arrays.toString(binarySearchTree.preOrder());
        assertEquals("Pre-order is correct.", "[7, 2, 4, 8, 12]", preOrderResult);
    }

    @Test
    public void testInOrder()
    {
        String inOrderResult = Arrays.toString(binarySearchTree.inOrder());
        assertEquals("In-order is correct.", "[2, 4, 7, 8, 12]", inOrderResult);
    }

    @Test
    public void testPostOrder()
    {
        String postOrderResult = Arrays.toString(binarySearchTree.postOrder());
        assertEquals("Post-order is correct.", "[2, 4, 8, 12, 7]", postOrderResult);
    }
}
