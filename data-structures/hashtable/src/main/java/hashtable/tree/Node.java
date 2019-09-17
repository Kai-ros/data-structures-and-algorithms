package hashtable.tree;

public class Node <Type>
{
    public Type dataValue;
    public Node <Type> leftChild;
    public Node <Type> rightChild;

    Node()
    {
        this.dataValue = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    Node(Type dataValue)
    {
        this.dataValue = dataValue;
        this.leftChild = null;
        this.rightChild = null;
    }

    Node(Type dataValue, Node<Type> leftChild, Node<Type> rightChild)
    {
        this.dataValue = dataValue;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public void setLeftChild(Node<Type> value)
    {
        this.leftChild = value;
    }

    public void setRightChild(Node<Type> value)
    {
        this.rightChild = value;
    }

    public Node<Type> getLeftChild()
    {
        return leftChild;
    }

    public Node<Type> getRightChild()
    {
        return rightChild;
    }

    public void setData(Type dataValue)
    {
        this.dataValue = dataValue;
    }

    public Type getData()
    {
        return this.dataValue;
    }
}
