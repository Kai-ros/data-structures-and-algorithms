package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StackTest
{
    Stack<Integer> testStack;

    @Before
    public void initializeTestData()
    {
        testStack = new Stack<>();
        testStack.push(12);
        testStack.push(19);
        testStack.push(4);
    }

    @Test
    public void testStack()
    {
        assertEquals(
                "Push successfully adds the desired value to the top of the stack.",
                "Top entry: 4",
                testStack.top());
    }

    @Test
    public void testStack_Push()
    {
        assertEquals(
                "Push successfully adds many values to the top of the stack.",
                "Stack size: 3\n" +
                "Entry #0: 4\n" +
                "Entry #1: 19\n" +
                "Entry #2: 12\n",
                testStack.toString());
    }

    @Test
    public void testStack_Pop()
    {
        testStack.pop();

        assertEquals(
                "Pop successfully removes a value from the top of the stack.",
                "Stack size: 2\n" +
                        "Entry #0: 19\n" +
                        "Entry #1: 12\n",
                testStack.toString());
    }

    @Test
    public void testStack_PopMany()
    {
        testStack.pop();
        testStack.pop();
        testStack.pop();

        assertEquals(
                "Pop successfully removes all values from the stack.",
                "Stack size: 0\n",
                testStack.toString());
    }

    @Test
    public void testStack_Peek()
    {
        testStack.peek();

        assertEquals(
                "Peek successfully returns the value from the top of the stack.",
                (Integer) 4,
                testStack.peek());
    }

    @Test (expected = Exception.class)
    public void testStack_EmptyStack()
    {
        testStack = new Stack<>();


        assertEquals(
                "Peek successfully returns returns an exception for an empty stack.",
                "Stack empty.",
                testStack.peek());
    }
}
