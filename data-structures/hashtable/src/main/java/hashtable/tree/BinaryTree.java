package hashtable.tree;

import java.util.*;

public class BinaryTree <Type>
{
    public Node<Type> root;

    BinaryTree()
    {
        this.root = null;
    }

    BinaryTree(Type dataValue)
    {
        this.root = new Node(dataValue);
    }

    BinaryTree(Node node)
    {
        this.root = node;
    }

    public ArrayList<Type> preOrder()
    {
        ArrayList<Type> arrayBuilder = new ArrayList<>();
        return recursivePreOrder(arrayBuilder, root);
    }

    public ArrayList<Type> recursivePreOrder(ArrayList<Type> arrayList, Node<Type> node)
    {
        if (node != null)
        {
            arrayList.add(node.dataValue);
            recursivePreOrder(arrayList, node.leftChild);
            recursivePreOrder(arrayList, node.rightChild);
        }
        return arrayList;
    }

    public Type[] inOrder()
    {
        ArrayList<Type> arrayBuilder = new ArrayList<>();
        Type[] resultArray = (Type[]) recursiveInOrder(arrayBuilder, root).toArray();

        return resultArray;
    }

    public ArrayList<Type> recursiveInOrder(ArrayList<Type> arrayList, Node<Type> node)
    {
        if (node != null)
        {
            recursiveInOrder(arrayList, node.leftChild);
            arrayList.add(node.dataValue);
            recursiveInOrder(arrayList, node.rightChild);
        }
        return arrayList;
    }

    public Type[] postOrder()
    {
        ArrayList<Type> arrayBuilder = new ArrayList<>();
        Type[] resultArray = (Type[]) recursivePostOrder(arrayBuilder, root).toArray();

        return resultArray;
    }

    public ArrayList<Type> recursivePostOrder(ArrayList<Type> arrayList, Node<Type> node)
    {
        if (node != null)
        {
            recursiveInOrder(arrayList, node.leftChild);
            recursiveInOrder(arrayList, node.rightChild);
            arrayList.add(node.dataValue);
        }
        return arrayList;
    }

    public boolean isEmpty()
    {
        return this.root == null;
    }

    public Node<Type> getRoot() throws NoSuchElementException
    {
        return this.root;
    }

    public void breadthFirstTraversal(BinaryTree<Type> tree)
    {
        Queue<Node<Type>> traversalQueue = new LinkedList<>();

        if (tree.root == null)
        {
            return;
        }
        traversalQueue.add(tree.root);
        while (!traversalQueue.isEmpty())
        {
            Node<Type> currentNode = traversalQueue.remove();

            System.out.println(currentNode.dataValue);

            if (currentNode.leftChild != null)
            {
                traversalQueue.add(currentNode.leftChild);
            }
            if (currentNode.rightChild != null)
            {
                traversalQueue.add(currentNode.rightChild);
            }
        }
    }

    public int findMaximumValue(BinaryTree<Integer> tree)
    {
        int maximumValue = recursiveMaxValue(tree.root);
        return maximumValue;
    }

    private int recursiveMaxValue(Node<Integer> currentNode)
    {
        int maximumValue = 0;

        if (currentNode != null)
        {
            maximumValue = currentNode.dataValue;
            int leftMax = recursiveMaxValue(currentNode.leftChild);
            int rightMax = recursiveMaxValue(currentNode.rightChild);

            if (leftMax > maximumValue)
            {
                maximumValue = leftMax;
            }
            if (rightMax > maximumValue)
            {
                maximumValue = rightMax;
            }
        }
        return maximumValue;
    }
}
