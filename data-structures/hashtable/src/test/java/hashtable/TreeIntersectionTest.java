package hashtable;

import org.junit.Before;
import org.junit.Test;
import hashtable.tree.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeIntersectionTest
{
    TreeIntersection treeIntersection = new TreeIntersection();
    BinarySearchTree<Integer> binarySearchTree1 = new BinarySearchTree();
    BinarySearchTree<Integer> binarySearchTree2 = new BinarySearchTree();
    BinarySearchTree<Integer> binarySearchTree3 = new BinarySearchTree();
    BinarySearchTree<Integer> binarySearchTree4 = new BinarySearchTree();
    BinarySearchTree binarySearchTreeEmpty = new BinarySearchTree();

    @Before
    public void initializeTestData()
    {
        binarySearchTree1.add(150);
        binarySearchTree1.add(100);
        binarySearchTree1.add(250);
        binarySearchTree1.add(75);
        binarySearchTree1.add(160);
        binarySearchTree1.add(200);
        binarySearchTree1.add(350);
        binarySearchTree1.add(125);
        binarySearchTree1.add(175);
        binarySearchTree1.add(300);
        binarySearchTree1.add(500);

        binarySearchTree2.add(42);
        binarySearchTree2.add(100);
        binarySearchTree2.add(600);
        binarySearchTree2.add(15);
        binarySearchTree2.add(160);
        binarySearchTree2.add(200);
        binarySearchTree2.add(350);
        binarySearchTree2.add(125);
        binarySearchTree2.add(175);
        binarySearchTree2.add(4);
        binarySearchTree2.add(500);

        binarySearchTree3.add(4);
        binarySearchTree3.add(7);
        binarySearchTree3.add(13);

        binarySearchTree4.add(2);
        binarySearchTree4.add(9);
        binarySearchTree4.add(80);

    }

    @Test
    public void testTreeIntersection()
    {
        assertEquals(
                "The treeIntersection() should return the expected string.",
                "[100, 125, 160, 175, 200, 350, 500]",
                Arrays.toString(treeIntersection.treeIntersection(binarySearchTree1, binarySearchTree2)));
    }

    @Test
    public void testTreeIntersection_NoIntersection()
    {
        assertEquals(
                "The treeIntersection() should return no values if there is no intersection between the two trees.",
                "[]",
                Arrays.toString(treeIntersection.treeIntersection(binarySearchTree3, binarySearchTree4)));
    }

    @Test
    public void testTreeIntersection_EmptyTrees()
    {
        assertEquals(
                "The treeIntersection() should return a null if the first input tree is null.",
                null,
                treeIntersection.treeIntersection(binarySearchTreeEmpty, binarySearchTree2));
        assertEquals(
                "The treeIntersection() should return a null if the second input tree is null.",
                null,
                treeIntersection.treeIntersection(binarySearchTree1, binarySearchTreeEmpty));
        assertEquals(
                "The treeIntersection() should return a null if both input trees are null.",
                null,
                treeIntersection.treeIntersection(binarySearchTreeEmpty, binarySearchTreeEmpty));
    }



}