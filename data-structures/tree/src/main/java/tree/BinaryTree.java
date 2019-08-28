package tree;

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

    public Type[] preOrder()
    {
        ArrayList<Type> arrayBuilder = new ArrayList<>();
        Type[] resultArray = (Type[]) recursivePreOrder(arrayBuilder, root).toArray();

        return resultArray;
    }

    private ArrayList<Type> recursivePreOrder(ArrayList<Type> arrayList, Node<Type> node)
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

    private ArrayList<Type> recursiveInOrder(ArrayList<Type> arrayList, Node<Type> node)
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

    private ArrayList<Type> recursivePostOrder(ArrayList<Type> arrayList, Node<Type> node)
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

//    public void breadthFirstTraversalRecursive(BinaryTree<Type> tree)
//    {
//        Queue<Node<Type>> traversalQueue = new LinkedList<>();
//
//        if (tree.root == null)
//        {
//            return;
//        }
//        breadthFirstTraversalRecursive(traversalQueue);
//    }
//
//    private void breadthFirstTraversalRecursive(Queue<Node<Type>> queue)
//    {
//        if (queue.element() != null)
//        {
//            queue.add(tree.root);
//            Node<Type> currentNode = queue.remove();
//            System.out.println(currentNode.dataValue);
//            queue.add(currentNode.leftChild);
//            queue.add(currentNode.rightChild);
//            breadthFirstTraversalRecursive(queue);
//        }
//    }
}

// Resources:
// https://www.sanfoundry.com/java-program-implement-binary-tree/
// https://www.baeldung.com/java-binary-tree
// https://www.callicoder.com/java-queue/
// https://algorithms.tutorialhorizon.com/breadth-first-searchtraversal-in-a-binary-tree/