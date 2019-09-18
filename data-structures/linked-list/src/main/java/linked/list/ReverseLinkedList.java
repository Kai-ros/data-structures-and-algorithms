package linked.list;

public class ReverseLinkedList {
    public LinkedList reverseLinkedListInPlace(LinkedList inputList) {
        if ((inputList == null) || (inputList.head.next == null)) {
            return inputList;
        }
        Node currentNode = inputList.head;
        Node previousNode = null;

        while (currentNode != null) {
            Node tempNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = tempNode;
        }
        inputList.head = previousNode;
        return inputList;
    }

    // This recursive solution was devised by my friend, Chris Coulon.
    public static LinkedList reverseRecursion(Node previous, Node currNode, LinkedList list) {
        Node tempNext = currNode.next;
        currNode.next = previous;
        if (tempNext == null) {
            list.head = currNode;
            return list;
        }
        reverseRecursion(currNode, tempNext, list);
        return list;
    }
}
