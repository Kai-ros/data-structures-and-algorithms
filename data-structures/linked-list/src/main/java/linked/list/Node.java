package linked.list;

public class Node
{
    Object data;
    Node next;

    // Constructor
    // Next is null by default
    Node(Object dataValue)
    {
        this.data = dataValue;
        this.next = null;
    }
}

