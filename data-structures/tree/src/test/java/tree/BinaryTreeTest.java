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

    BinaryTree<Integer> maxValueBinaryTree;
    BinaryTree<Integer> maxValueBinaryTreeEmpty = new BinaryTree<>();
    BinaryTree<Integer> maxValueBinaryTreeDuplicates;


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

        Node<Integer> node7 = new Node<>(5);

        Node<Integer> node3 = new Node<>(32, node7, null);
        Node<Integer> node4 = new Node<>(200);

        Node<Integer> node5 = new Node<>(9);
        Node<Integer> node6 = new Node<>(50);

        Node<Integer> node1 = new Node<>(78, node3, node4);
        Node<Integer> node2 = new Node<>(14, node5, node6);

        Node<Integer> rootNode = new Node<>(7, node1, node2);

        maxValueBinaryTree = new BinaryTree<>(rootNode);

        Node<Integer> node8 = new Node<>(3);

        Node<Integer> node9 = new Node<>(3, node8, null);
        Node<Integer> node10 = new Node<>(20);

        Node<Integer> node11 = new Node<>(3);
        Node<Integer> node12 = new Node<>(20);

        Node<Integer> node13 = new Node<>(3, node9, node10);
        Node<Integer> node14 = new Node<>(3, node11, node12);

        Node<Integer> root = new Node<>(20, node13, node14);

        maxValueBinaryTreeDuplicates = new BinaryTree<>(root);

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
        assertEquals("A tree of only duplicate values should still work.",
                "3\n" +
                        "3\n" +
                        "3\n" +
                        "3\n",
                outContent.toString());
    }

    @Test
    public void testFindMaximumValue()
    {
        int maxValue = maxValueBinaryTree.findMaximumValue(maxValueBinaryTree);
        assertEquals("Given a tree of ints the method should return the highest value int.",
                200,
                maxValue);
    }

    @Test
    public void testFindMaximumValue_Empty()
    {
        int maxValue = maxValueBinaryTreeEmpty.findMaximumValue(maxValueBinaryTreeEmpty);
        assertEquals("Given an empty tree the method should return a zero.",
                0,
                maxValue);
    }

    @Test
    public void testFindMaximumValue_DuplicateValues()
    {
        int maxValue = maxValueBinaryTreeDuplicates.findMaximumValue(maxValueBinaryTreeDuplicates);
        assertEquals("Given a tree of duplicates the method should return the highest value int.",
                20,
                maxValue);
    }
}

// Resources:
// https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
