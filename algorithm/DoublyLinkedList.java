package algorithm;

class ListNode {
    int val;
    ListNode prev;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void insertAtBeginning(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int val) {
        ListNode newNode = new ListNode(val);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void printListForward() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printListBackward() {
        ListNode current = tail;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        System.out.println("Forward traversal:");
        list.printListForward();

        System.out.println("Backward traversal:");
        list.printListBackward();
    }
}
