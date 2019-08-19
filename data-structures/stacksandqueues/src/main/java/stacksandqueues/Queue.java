package stacksandqueues;

import java.util.NoSuchElementException;

public class Queue <Type>
{
    Node <Type> front;
    Node <Type> back;
    int queueSize;

    public Queue()
    {
        front = null;
        back = null;
        queueSize = 0;
    }

    public void enqueue(Type dataValue)
    {
        Node previousBack = back;

        if(queueSize == 0)
        {
            back = new Node(dataValue);
            front = back;
        }
        else
        {
            back.next = new Node(dataValue);
            back = back.next;
        }

        queueSize++;
    }

    public Type dequeue()
    {
        if (queueSize == 0)
        {
            throw new NoSuchElementException("Queue underflow.");
        }
        Type dataToReturn = front.data;
        front = front.next;
        queueSize--;

        return dataToReturn;
    }

    public Type peek()
    {
        if (queueSize == 0)
        {
            throw new NoSuchElementException("Queue empty.");
        }
        return front.data;
    }

    public String front()
    {
        if (queueSize == 0)
        {
            throw new NoSuchElementException("Queue empty.");
        }
        return "First entry: " + front.data;
    }

    public String back()
    {
        if (queueSize == 0)
        {
            throw new NoSuchElementException("Queue empty.");
        }
        return "Last entry: " + back.data;
    }

    public int size()
    {
        return queueSize;
    }

    public String toString()
    {
        Node<Type> currentNode = front;
        StringBuilder outputMessage = new StringBuilder();
        int counter = 0;

        outputMessage.append("Queue size: ").append(queueSize).append("\n");
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
// https://algs4.cs.princeton.edu/13stacks/Queue.java.html