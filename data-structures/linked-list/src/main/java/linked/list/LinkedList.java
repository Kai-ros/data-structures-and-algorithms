package linked.list;

public class LinkedList
{
    Node head;

    public void insert(Object data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public boolean includes(Object data)
    {
        Node currentNode = head;
        boolean result = false;

        while (currentNode != null)
        {
            if (currentNode.data == data) result = true;
            currentNode =  currentNode.next;
        }
        return result;
    }

    public String toString()
    {
        Node currentNode = head;
        StringBuilder output = new StringBuilder();
        int iterator = 0;

        if(currentNode == null)
        {
            output.append("This linked list currently contains no data.");
        }

        while (currentNode != null)
        {
            output.append("Data at node position ").append(iterator).append(" is ").append(currentNode.data).append(".\n");
            currentNode =  currentNode.next;
            iterator++;
        }
        return output.toString();
    }
}

// Resources:
// https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
// https://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/
// https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
// https://www.javatpoint.com/java-program-to-create-and-display-a-singly-linked-list