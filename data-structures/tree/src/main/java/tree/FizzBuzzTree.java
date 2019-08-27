package tree;

public class FizzBuzzTree extends BinarySearchTree <Object>
{
    public BinaryTree<Object> fizzBuzzTree(BinaryTree<Object> inputTree)
    {
        Node<Object> currentNode = inputTree.root;

        fizzBuzzTreeRecursive(currentNode);

        return inputTree;
    }

    private Node<Object> fizzBuzzTreeRecursive(Node<Object> currentNode)
    {
        if (currentNode != null)
        {
            valueCheck(currentNode);
            fizzBuzzTreeRecursive(currentNode.leftChild);
            fizzBuzzTreeRecursive(currentNode.rightChild);
        }
        return currentNode;
    }

    public void valueCheck(Node currentNode)
    {
        if (( (int) currentNode.dataValue % 3 == 0) && ( (int) currentNode.dataValue % 5 == 0))
        {
            currentNode.dataValue = "FizzBuzz";
        }
        else if ((int) currentNode.dataValue % 3 == 0)
        {
            currentNode.dataValue = "Fizz";
        }
        else if ( (int) currentNode.dataValue % 5 == 0)
        {
            currentNode.dataValue = "Buzz";
        }
    }
}
