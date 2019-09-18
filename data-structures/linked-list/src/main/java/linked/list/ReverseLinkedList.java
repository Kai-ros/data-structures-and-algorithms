package linked.list;

public class ReverseLinkedList
{
    public LinkedList reverseLinkedListInPlace(LinkedList inputList)
    {
        if ((inputList == null) || (inputList.head.next == null))
        {
            return inputList;
        }
        Node currentNode = inputList.head;
        Node previousNode = null;

        while(currentNode != null)
        {
            Node tempNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = tempNode;
        }
        inputList.head = previousNode;
        return inputList;
    }

    public LinkedList reverseLinkedListInPlace_Recursive(LinkedList inputList)
    {
        if ((inputList == null) || (inputList.head.next == null))
        {
            return inputList;
        }
        Node currentNode = inputList.head;
        Node previous = null;

        inputList.head = recursiveReverseLinkedListInPlace(previous, currentNode, currentNode.next);

        return inputList;
    }

    public Node recursiveReverseLinkedListInPlace(Node previous, Node current, Node next)
    {
        if(current != null)
        {
            Node tempNode = next;
            next = previous;
            previous = current;
            current = tempNode;
            return recursiveReverseLinkedListInPlace(previous, current, next);
        }
        else
        {
            return previous;
        }
    }
}
