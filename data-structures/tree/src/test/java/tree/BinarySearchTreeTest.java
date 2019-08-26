package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTreeTest
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
    public void testAdd()
    {
        String inOrderResult = Arrays.toString(binarySearchTree.inOrder());
        assertEquals("Add successfully inserts new nodes into the tree.", "[2, 4, 7, 8, 12]", inOrderResult);
    }

    @Test
    public void testContains_True()
    {
        assertEquals("Contains returns true for the given value.", true, binarySearchTree.contains(2));
    }

    @Test
    public void testContains_False()
    {
        assertEquals("Contains returns true for the given value.", false, binarySearchTree.contains(78));
    }
}