package stacksandqueues;

public class Node <Type>
{
    Type data;
    Node <Type> next;

    Node() {}

    Node(Type dataValue)
    {
        this.data = dataValue;
        this.next = null;
    }
}