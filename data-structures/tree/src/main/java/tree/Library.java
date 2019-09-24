/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import java.util.Arrays;

public class Library
{
    public static void main(String[] args)
    {

        BinarySearchTree<Node<String>> binaryTree = new BinarySearchTree<>();

        binaryTree.add(7);
        binaryTree.add(12);
        binaryTree.add(13);
        binaryTree.add(7);
        binaryTree.add(74);
        binaryTree.add(4);
        binaryTree.add(9);
        binaryTree.add(13);
        binaryTree.add(7);
        binaryTree.add(74);
        binaryTree.add(4);
        binaryTree.add(9);

        System.out.println(binaryTree.listDuplicates(binaryTree));



    }
}
