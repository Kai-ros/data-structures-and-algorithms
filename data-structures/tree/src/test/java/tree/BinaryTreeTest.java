package tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest
{
    BinarySearchTree binarySearchTree = new BinarySearchTree();
    BinarySearchTree binarySearchTreeEmpty = new BinarySearchTree();
    BinarySearchTree binarySearchTreeSameValues = new BinarySearchTree();
    BinaryTree binaryTree = new BinaryTree();

    // Necessary for testing System.out's
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;

    @Before
    public void initializeTestData()
    {
        binarySearchTree.add(7);
        binarySearchTree.add(8);
        binarySearchTree.add(2);
        binarySearchTree.add(4);
        binarySearchTree.add(12);

        binarySearchTreeSameValues.add(3);
        binarySearchTreeSameValues.add(3);
        binarySearchTreeSameValues.add(3);
        binarySearchTreeSameValues.add(3);


        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams()
    {
        System.setOut(originalOut);
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

    @Test
    public void testBreadthFirstTraversal()
    {
        binarySearchTree.add(8);
        binarySearchTree.add(7);
        binarySearchTree.add(16);
        binarySearchTree.add(16);
        binarySearchTree.add(3);
        binarySearchTree.add(12);
        binarySearchTree.add(9);

        binaryTree.breadthFirstTraversal(binarySearchTree);
        assertEquals( "BFT should occur in correct order.",
                "7\n" +
                        "2\n" +
                        "8\n" +
                        "4\n" +
                        "7\n" +
                        "12\n" +
                        "3\n" +
                        "8\n" +
                        "16\n" +
                        "9\n" +
                        "12\n" +
                        "16\n",
                outContent.toString());
    }

    @Test
    public void testBreadthFirstTraversal_EmptyTree()
    {
        binaryTree.breadthFirstTraversal(binarySearchTreeEmpty);
        assertEquals("An empty tree should result in no System.out's.",
                "",
                outContent.toString());
    }

    @Test
    public void testBreadthFirstTraversal_SameValues()
    {
        binaryTree.breadthFirstTraversal(binarySearchTreeSameValues);
        assertEquals("An empty tree should result in no System.out's.",
                "3\n" +
                        "3\n" +
                        "3\n" +
                        "3\n",
                outContent.toString());
    }
}

// Resources:
// https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
