package stacksandqueues;


import java.util.NoSuchElementException;

public class Stack <Type>
{
    Node <Type> top;
    int stackSize;

    public Stack()
    {
        top = null;
        stackSize = 0;
    }

    public void push(Type dataValue)
    {
        Node previousTop = top;
        top = new Node(dataValue);
        top.next = previousTop;
        stackSize++;
    }

    public Type pop()
    {
        if (stackSize == 0)
        {
            throw new NoSuchElementException("Stack underflow.");
        }
        Type dataToReturn = top.data;
        top = top.next;
        stackSize--;

        return dataToReturn;
    }

    public Type peek()
    {
        if (stackSize == 0)
        {
            throw new NoSuchElementException("Stack empty.");
        }
        return top.data;
    }

    public String top()
    {
        if (stackSize == 0)
        {
            throw new NoSuchElementException("Stack empty.");
        }
        return "Top entry: " + top.data;
    }

    public int size()
    {
        return stackSize;
    }

    public String toString()
    {
        Node<Type> currentNode = top;
        StringBuilder outputMessage = new StringBuilder();
        int counter = 0;

        outputMessage.append("Stack size: ").append(stackSize).append("\n");
        while (currentNode != null)
        {
            outputMessage.append("Entry #").append(counter).append(": ").append(currentNode.data).append("\n");
            currentNode = currentNode.next;
            counter++;
        }

        return outputMessage.toString();
    }

}

// Resources:
// https://introcs.cs.princeton.edu/java/43stack/Stack.java.html
// https://www.sanfoundry.com/java-program-implement-stack/