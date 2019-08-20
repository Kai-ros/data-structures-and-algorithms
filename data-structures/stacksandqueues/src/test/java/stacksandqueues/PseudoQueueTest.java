package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PseudoQueueTest
{
    PseudoQueue<Integer> testWeirdQueue;

    @Before
    public void initializeTestData()
    {
        testWeirdQueue = new PseudoQueue<>();
        testWeirdQueue.enqueue(12);
        testWeirdQueue.enqueue(19);
        testWeirdQueue.enqueue(4);
        testWeirdQueue.enqueue(2);
        testWeirdQueue.enqueue(88);
    }

    @Test
    public void testPseudoQueue()
    {
        assertEquals(
                "To string successfully calls on the internal stacks toString() and accurately reflects the pseudo queue's contents.",
                "Stack size: 5\n" +
                        "Entry #0: 88\n" +
                        "Entry #1: 2\n" +
                        "Entry #2: 4\n" +
                        "Entry #3: 19\n" +
                        "Entry #4: 12\n",
                testWeirdQueue.toString());
    }

    @Test
    public void testPseudoQueue_Enqueue()
    {
        testWeirdQueue.enqueue(39);

        assertEquals(
                "Enqueue successfully adds a value to the back of the queue.",
                6,
                testWeirdQueue.size());
    }

    @Test
    public void testPseudoQueue_EnqueueEmptyQueue()
    {
        testWeirdQueue = new PseudoQueue<>();
        testWeirdQueue.enqueue(6);

        assertEquals(
                "Enqueue successfully adds a value to the front of an empty queue.",
                (Integer) 6,
                testWeirdQueue.dequeue());
    }

    @Test
    public void testPseudoQueue_Dequeue()
    {
        assertEquals(
                "Dequeue successfully removes a value from the front of the pseudo queue.",
                (Integer) 12,
                testWeirdQueue.dequeue());
    }

    @Test (expected = Exception.class)
    public void testPseudoQueue_DequeueEmptyQueue()
    {
        testWeirdQueue = new PseudoQueue<>();

        assertEquals(
                "Peek successfully returns an exception for an empty queue.",
                "Stack empty.",
                testWeirdQueue.backStack.peek());

    }
}
