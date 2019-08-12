package linked.list;

public class Node <Type>
{
    Type data;
    Node <Type> next;

    // Constructor
    // Next is null by default
    Node(Type dataValue)
    {
        this.data = dataValue;
        this.next = null;
    }
}

