package stacksandqueues;


import java.util.NoSuchElementException;

public class PseudoQueue <Type>
{
    Stack <Type> frontStack;
    Stack <Type> backStack;
    int queueSize;

    PseudoQueue()
    {
        this.frontStack = new Stack<>();
        this.backStack = new Stack<>();
        queueSize = 0;
    }

    public void enqueue(Type value)
    {
        this.backStack.push(value);
        this.queueSize++;
    }

    public Type dequeue()
    {
        Type returnValue;

        if (queueSize == 0)
        {
            throw new NoSuchElementException("Queue underflow.");
        }
        else if (queueSize == 1)
        {
            returnValue = backStack.pop();
            this.queueSize--;
        }
        else
        {
            // While there are nodes in back stack, empty them into front stack.
            while (backStack.top != null)
            {
                Type temporaryValue = backStack.pop();
                frontStack.push(temporaryValue);
            }

            // Pop the top node of front stack and set it as the return value.
            returnValue = frontStack.pop();

            // While there are nodes in front stack, return them to back stack.
            while (frontStack.top != null)
            {
                Type temporaryValue = frontStack.pop();
                backStack.push(temporaryValue);
            }
            this.queueSize--;
        }
        return returnValue;
    }

    public int size()
    {
        return queueSize;
    }

    public String toString()
    {
        return backStack.toString();
    }
}
