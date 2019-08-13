package linked.list;

public class LinkedList <Type>
{
    Node <Type> head;

    public LinkedList()
    {

    }

    public void prepend(Type data)
    {
        Node <Type> newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(Type dataValue)
    {
        Node <Type> newNode = new Node(dataValue);
        Node <Type> currentNode = head;

        if (currentNode != null)
        {
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            return;
        }
    }

    public void insertBefore(Type targetValue, Type newValue)
    {
        Node <Type> newNode = new Node(newValue);
        Node <Type> currentNode = head;
        Node <Type> previous = head;

        if (includes(targetValue))
        {
            if (head.data == targetValue)
            {
                newNode.next = head;
                head = newNode;
                return;
            }
            while (currentNode != null)
            {
                if (currentNode.data == targetValue)
                {
                    newNode.next = currentNode;
                    previous.next = newNode;
                    return;
                }
                previous = currentNode;
                currentNode = currentNode.next;
            }
        }
    }

    public void insertAfter(Type targetValue, Type newValue)
{
    Node <Type> newNode = new Node(newValue);
    Node <Type> currentNode = head;

    if (includes(targetValue))
    {
        if (head == targetValue)
        {
            head.next = newNode;
            return;
        }
        while (currentNode != null)
        {
            if (currentNode.data == targetValue)
            {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }
    }
}

    public boolean includes(Type data)
    {
        Node <Type> currentNode = head;

        while (currentNode != null)
        {
            if (currentNode.data == data)
                return true;
            currentNode =  currentNode.next;
        }
        return false;
    }

    public String toString()
    {
        Node <Type> currentNode = head;
        StringBuilder outputString = new StringBuilder();
        int iterator = 0;

        if(currentNode == null)
        {
            outputString.append("This linked list currently contains no data.");
        }

        while (currentNode != null)
        {
            outputString.append("Data at node position ").append(iterator).append(" is ").append(currentNode.data).append(".\n");
            currentNode =  currentNode.next;
            iterator++;
        }
        return outputString.toString();
    }


}

// Resources:
// https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
// https://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/
// https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
// https://www.javatpoint.com/java-program-to-create-and-display-a-singly-linked-list