package stacksandqueues;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest
{

    Queue<Integer> testQueue;

    @Before
    public void initializeTestData()
    {
        testQueue = new Queue<>();
        testQueue.enqueue(12);
        testQueue.enqueue(19);
        testQueue.enqueue(4);
    }

    @Test
    public void testQueue()
    {
        assertEquals(
                "Enqueue successfully adds the desired value to the back of the queue.",
                "First entry: 12",
                testQueue.front());
    }

    @Test
    public void testQueue_Enqueue()
    {
        assertEquals(
                "Enqueue successfully adds many values to the back of the queue.",
                "Queue size: 3\n" +
                        "Entry #0: 12\n" +
                        "Entry #1: 19\n" +
                        "Entry #2: 4\n",
                testQueue.toString());
    }

    @Test
    public void testQueue_Dequeue()
    {
        testQueue.dequeue();

        assertEquals(
                "Dequeue successfully removes a value from the front of the queue.",
                "Queue size: 2\n" +
                        "Entry #0: 19\n" +
                        "Entry #1: 4\n",
                testQueue.toString());
    }

    @Test
    public void testQueue_PopMany()
    {
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();

        assertEquals(
                "Pop successfully removes all the values from the queue.",
                "Queue size: 0\n",
                testQueue.toString());
    }

    @Test
    public void testQueue_Peek()
    {
        testQueue.peek();

        assertEquals(
                "Peek successfully returns the value from the front of the queue.",
                (Integer) 12,
                testQueue.peek());
    }

    @Test (expected = Exception.class)
    public void testQueue_EmptyStack()
    {
        testQueue = new Queue<>();


        assertEquals(
                "Peek successfully returns an exception for an empty queue.",
                "Queue empty.",
                testQueue.peek());
    }
}
