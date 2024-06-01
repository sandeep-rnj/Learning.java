package algorithm;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class CircularLinkedList {
    private ListNode head;

    public CircularLinkedList() {
        this.head = null;
    }
    public void insertAtBeginning(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            newNode.next = head; 
        } else {
            ListNode current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            newNode.next = head; 
        } else {
            ListNode current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }
    public void printList() {
        if (head == null) {
            System.out.println("Circular Linked List is empty");
            return;
        }
        ListNode current = head;
        do {
            System.out.print(current.val + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insertAtBeginning(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtBeginning(0);

        System.out.println("Circular Linked List:");
        list.printList();
    }
}
