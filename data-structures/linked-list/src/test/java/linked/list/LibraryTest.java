/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest
{
    @Test
    public void testLinkedList()
    {
        LinkedList linkedList = new LinkedList();
        String testMessage = linkedList.toString();

        assertEquals(
                "Instantiating a new linked list should return an empty linked list.",
                "This linked list currently contains no data.",
                testMessage);
    }

    @Test
    public void testLinkedList_Head()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend("Head");
        String testMessage = linkedList.toString();

        assertEquals(
                "Head should be the first index of the linked list.",
                "Data at node position 0 is Head.\n",
                testMessage);
    }

    @Test
    public void testLinkedList_Prepend()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(12);
        linkedList.prepend(4);
        String testMessage = linkedList.toString();

        assertEquals(
                "Inserting elements to the linked list should occur in FILO order.",
                "Data at node position 0 is 4.\n" +
                        "Data at node position 1 is 12.\n",
                testMessage);
    }

    @Test
    public void testLinkedList_PrependMany()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(12);
        linkedList.prepend(4);
        linkedList.prepend(1);
        linkedList.prepend(8);
        linkedList.prepend(19);
        linkedList.prepend(3);
        String testMessage = linkedList.toString();

        assertEquals(
                "Many elements can be inserted into the linked list.",
                "Data at node position 0 is 3.\n" +
                        "Data at node position 1 is 19.\n" +
                        "Data at node position 2 is 8.\n" +
                        "Data at node position 3 is 1.\n" +
                        "Data at node position 4 is 4.\n" +
                        "Data at node position 5 is 12.\n",
                testMessage);
    }

    @Test
    public void testLinkedList_ToString()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(12);
        String testMessage = linkedList.toString();

        assertEquals(
                "ToString method should provide index location of elements.",
                "Data at node position 0 is 12.\n",
                testMessage);
    }

    @Test
    public void testLinkedList_DataTypes()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend("TEST");
        String testMessage = linkedList.toString();

        assertEquals(
                "ToString method should store data of any type.",
                "Data at node position 0 is TEST.\n",
                testMessage);
    }

    @Test
    public void testLinkedList_IncludesTrue()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend("TEST");
        boolean testValue = linkedList.includes("TEST");

        assertTrue("ToString method should return true if data is present.", testValue);
    }

    @Test
    public void testLinkedList_IncludesFalse()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend("TEST");
        boolean testValue = linkedList.includes("NOT HERE");

        assertFalse("ToString method should return true if data is present.", testValue);
    }

    @Test
    public void testLinkedList_Append()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.append(12);
        String testMessage = linkedList.toString();

        assertEquals(
                "Append method should add the correct value at the end of the linked list.",
                "Data at node position 0 is 12.\n",
                testMessage);
    }

    @Test
    public void testLinkedList_AppendMany()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.append(12);
        linkedList.append(4);
        linkedList.append(1);
        String testMessage = linkedList.toString();

        assertEquals(
                "Append method should add many values at the end of the linked list.",
                "Data at node position 0 is 12.\n" +
                        "Data at node position 1 is 4.\n" +
                        "Data at node position 2 is 1.\n",
                testMessage);
    }

    @Test
    public void testLinkedList_InsertBefore()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(12);
        linkedList.prepend(4);
        linkedList.prepend(1);
        linkedList.prepend(8);
        linkedList.prepend(19);
        linkedList.prepend(3);
        linkedList.insertBefore(1, 62);
        String testMessage = linkedList.toString();

        assertEquals(
                "Insert before method should add correct number prior to the target value.",
                "Data at node position 0 is 3.\n" +
                        "Data at node position 1 is 19.\n" +
                        "Data at node position 2 is 8.\n" +
                        "Data at node position 3 is 62.\n" +
                        "Data at node position 4 is 1.\n" +
                        "Data at node position 5 is 4.\n" +
                        "Data at node position 6 is 12.\n",
                testMessage);
    }

    @Test
    public void testLinkedList_InsertBeforeFirstNode()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(12);
        linkedList.prepend(4);
        linkedList.prepend(1);
        linkedList.prepend(8);
        linkedList.prepend(19);
        linkedList.prepend(3);
        linkedList.insertBefore(3, 44);
        String testMessage = linkedList.toString();

        assertEquals(
                "Insert before method should add correct number prior to the target value.",
                "Data at node position 0 is 44.\n" +
                        "Data at node position 1 is 3.\n" +
                        "Data at node position 2 is 19.\n" +
                        "Data at node position 3 is 8.\n" +
                        "Data at node position 4 is 1.\n" +
                        "Data at node position 5 is 4.\n" +
                        "Data at node position 6 is 12.\n",
                testMessage);
    }

    @Test
    public void testLinkedList_InsertAfter()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(12);
        linkedList.prepend(4);
        linkedList.prepend(1);
        linkedList.prepend(8);
        linkedList.prepend(19);
        linkedList.prepend(3);
        linkedList.insertAfter(1, 62);
        String testMessage = linkedList.toString();

        assertEquals(
                "Insert before method should add correct number prior to the target value.",
                "Data at node position 0 is 3.\n" +
                        "Data at node position 1 is 19.\n" +
                        "Data at node position 2 is 8.\n" +
                        "Data at node position 3 is 1.\n" +
                        "Data at node position 4 is 62.\n" +
                        "Data at node position 5 is 4.\n" +
                        "Data at node position 6 is 12.\n",
                testMessage);
    }

    @Test
    public void testLinkedList_InsertAfterLastNode()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(12);
        linkedList.prepend(4);
        linkedList.prepend(1);
        linkedList.prepend(8);
        linkedList.prepend(19);
        linkedList.prepend(3);
        linkedList.insertAfter(12, 44);
        String testMessage = linkedList.toString();

        assertEquals(
                "Insert before method should add correct number prior to the target value.",
                "Data at node position 0 is 3.\n" +
                        "Data at node position 1 is 19.\n" +
                        "Data at node position 2 is 8.\n" +
                        "Data at node position 3 is 1.\n" +
                        "Data at node position 4 is 4.\n" +
                        "Data at node position 5 is 12.\n" +
                        "Data at node position 6 is 44.\n",
                testMessage);
    }

    @Test
    public void testLinkedList_KthFromEnd()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(12);
        linkedList.prepend(4);
        linkedList.prepend(1);
        linkedList.prepend(8);
        linkedList.prepend(19);
        linkedList.prepend(3);

        assertEquals(
                "KthFromEnd method should return the correct value at the Kth index.",
                1,
                linkedList.kthFromEnd(3));
    }

    @Test
    public void testLinkedList_KthFromEndLinkedListContainsOnlyHead()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(12);

        assertEquals(
                "KthFromEnd method should return the correct value at the Kth index.",
                12,
                linkedList.kthFromEnd(1));
    }

    @Test
    public void testLinkedList_KthFromEndKIsSameSizeAsLinkedList()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(12);
        linkedList.prepend(4);
        linkedList.prepend(1);
        linkedList.prepend(8);
        linkedList.prepend(19);
        linkedList.prepend(3);

        assertEquals(
                "KthFromEnd method should return the correct value at the Kth index.",
                3,
                linkedList.kthFromEnd(6));
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testLinkedList_KthFromEndNegativeValue()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(12);
        linkedList.prepend(4);

        linkedList.kthFromEnd(-6);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testLinkedList_KthFromEndKIsLargerThanLinkedList()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(12);
        linkedList.prepend(4);

        linkedList.kthFromEnd(12);
    }

    @Test
    public void testLinkedList_MergeLists()
    {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(1);
        linkedList1.append(2);
        linkedList1.append(3);
        linkedList1.append(4);
        linkedList1.append(5);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(6);
        linkedList2.append(7);
        linkedList2.append(8);
        linkedList2.append(9);
        linkedList2.append(10);

        LinkedList linkedList3 = new LinkedList();
        linkedList3.append(11);
        linkedList3.append(12);
        linkedList3.append(13);
        linkedList3.append(14);
        linkedList3.append(15);

        linkedList1.mergeLists(linkedList1, linkedList2);

        assertEquals(
                "Merge lists should add the lists together in alternating fashion..",
                "Data at node position 0 is 1.\n" +
                        "Data at node position 1 is 6.\n" +
                        "Data at node position 2 is 2.\n" +
                        "Data at node position 3 is 7.\n" +
                        "Data at node position 4 is 3.\n" +
                        "Data at node position 5 is 8.\n" +
                        "Data at node position 6 is 4.\n" +
                        "Data at node position 7 is 9.\n" +
                        "Data at node position 8 is 5.\n" +
                        "Data at node position 9 is 10.\n",
                linkedList1.toString());
    }

    @Test
    public void testLinkedList_MergeListsReturnsHeadNode()
    {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(1);
        linkedList1.append(2);
        linkedList1.append(3);
        linkedList1.append(4);
        linkedList1.append(5);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(6);
        linkedList2.append(7);
        linkedList2.append(8);
        linkedList2.append(9);
        linkedList2.append(10);

        Node linkedList1HeadAddress = linkedList1.head;

        assertEquals(
                "Merge lists should return the head node from the first linked list passed in as an argument.",
                linkedList1HeadAddress,
                linkedList1.mergeLists(linkedList1, linkedList2));
    }

    @Test
    public void testLinkedList_MergeListsWorksWithUnevenlySizedFirstList()
    {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(1);
        linkedList1.append(2);
        linkedList1.append(3);
        linkedList1.append(4);
        linkedList1.append(5);
        linkedList1.append(6);
        linkedList1.append(7);
        linkedList1.append(8);
        linkedList1.append(9);
        linkedList1.append(10);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(11);
        linkedList2.append(12);
        linkedList2.append(13);
        linkedList2.append(14);
        linkedList2.append(15);

        linkedList1.mergeLists(linkedList1, linkedList2);

        assertEquals(
                "Merge lists should successfully merge the two lists if the second list is shorter.",
                "Data at node position 0 is 1.\n" +
                        "Data at node position 1 is 11.\n" +
                        "Data at node position 2 is 2.\n" +
                        "Data at node position 3 is 12.\n" +
                        "Data at node position 4 is 3.\n" +
                        "Data at node position 5 is 13.\n" +
                        "Data at node position 6 is 4.\n" +
                        "Data at node position 7 is 14.\n" +
                        "Data at node position 8 is 5.\n" +
                        "Data at node position 9 is 15.\n" +
                        "Data at node position 10 is 6.\n" +
                        "Data at node position 11 is 7.\n" +
                        "Data at node position 12 is 8.\n" +
                        "Data at node position 13 is 9.\n" +
                        "Data at node position 14 is 10.\n",
                linkedList1.toString());
    }

    @Test
    public void testLinkedList_MergeListsWorksWithUnevenlySizedSecondList()
    {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(1);
        linkedList1.append(2);
        linkedList1.append(3);
        linkedList1.append(4);
        linkedList1.append(5);
        linkedList1.append(6);
        linkedList1.append(7);
        linkedList1.append(8);
        linkedList1.append(9);
        linkedList1.append(10);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(11);
        linkedList2.append(12);
        linkedList2.append(13);
        linkedList2.append(14);
        linkedList2.append(15);

        linkedList2.mergeLists(linkedList2, linkedList1);

        assertEquals(
                "Merge lists should successfully merge the two lists if the first list is shorter.",
                "Data at node position 0 is 11.\n" +
                        "Data at node position 1 is 1.\n" +
                        "Data at node position 2 is 12.\n" +
                        "Data at node position 3 is 2.\n" +
                        "Data at node position 4 is 13.\n" +
                        "Data at node position 5 is 3.\n" +
                        "Data at node position 6 is 14.\n" +
                        "Data at node position 7 is 4.\n" +
                        "Data at node position 8 is 15.\n" +
                        "Data at node position 9 is 5.\n" +
                        "Data at node position 10 is 6.\n" +
                        "Data at node position 11 is 7.\n" +
                        "Data at node position 12 is 8.\n" +
                        "Data at node position 13 is 9.\n" +
                        "Data at node position 14 is 10.\n",
                linkedList2.toString());
    }

    @Test
    public void testLinkedList_MergeListsWithStringNumbers()
    {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(1);
        linkedList1.append(2);
        linkedList1.append(3);
        linkedList1.append(4);
        linkedList1.append(5);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append("11");
        linkedList2.append("12");
        linkedList2.append("13");
        linkedList2.append("14");
        linkedList2.append("15");

        linkedList2.mergeLists(linkedList2, linkedList1);

        assertEquals(
                "Merge lists should successfully merge the two lists even if the data types are different.",
                "Data at node position 0 is 11.\n" +
                        "Data at node position 1 is 1.\n" +
                        "Data at node position 2 is 12.\n" +
                        "Data at node position 3 is 2.\n" +
                        "Data at node position 4 is 13.\n" +
                        "Data at node position 5 is 3.\n" +
                        "Data at node position 6 is 14.\n" +
                        "Data at node position 7 is 4.\n" +
                        "Data at node position 8 is 15.\n" +
                        "Data at node position 9 is 5.\n",
                linkedList2.toString());
    }

    @Test
    public void testLinkedList_MergeListsWithStringNumberWords()
    {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(1);
        linkedList1.append(2);
        linkedList1.append(3);
        linkedList1.append(4);
        linkedList1.append(5);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append("eleven");
        linkedList2.append("twelve");
        linkedList2.append("thirteen");
        linkedList2.append("fourteen");
        linkedList2.append("fiftten");

        linkedList2.mergeLists(linkedList2, linkedList1);

        assertEquals(
                "Merge lists should successfully merge the two lists even if the data types are different.",
                "Data at node position 0 is eleven.\n" +
                        "Data at node position 1 is 1.\n" +
                        "Data at node position 2 is twelve.\n" +
                        "Data at node position 3 is 2.\n" +
                        "Data at node position 4 is thirteen.\n" +
                        "Data at node position 5 is 3.\n" +
                        "Data at node position 6 is fourteen.\n" +
                        "Data at node position 7 is 4.\n" +
                        "Data at node position 8 is fiftten.\n" +
                        "Data at node position 9 is 5.\n",
                linkedList2.toString());
    }

}
