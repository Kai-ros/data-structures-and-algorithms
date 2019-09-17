package hashtable.tree;

public class BinarySearchTree <Type extends Comparable<Type>> extends BinaryTree <Type>
{
    public BinarySearchTree(){}

    public void add(Type dataValue)
    {
        if (this.root == null)
        {
            this.root = new Node<>(dataValue);
        }
        else
        {
            this.root = insert(root, dataValue);
        }
    }

    private Node<Type> insert(Node<Type> node, Type dataValue)
    {
        if (node == null)
        {
            node = new Node(dataValue);
        }
        else
        {
            if (0 > (node.dataValue.compareTo(dataValue)))
            {
                node.rightChild = insert(node.rightChild, dataValue);
            }
            else
            {
                node.leftChild = insert(node.leftChild, dataValue);
            }
        }
        return node;
    }

    public boolean contains(Type dataValue)
    {
        return recursiveContains(this.root, dataValue);
    }

    private boolean recursiveContains(Node<Type> currentNode, Type dataValue)
    {
        if (currentNode == null)
        {
            return false;
        }
        if (dataValue.equals(currentNode.dataValue))
        {
            return true;
        }
        return (0 > (currentNode.dataValue.compareTo(dataValue)))
                ? recursiveContains(currentNode.rightChild, dataValue)
                : recursiveContains(currentNode.leftChild, dataValue);
    }

}
