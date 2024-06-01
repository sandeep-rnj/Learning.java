package algorithm;

class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    void swapKth(int k) {
        int length = getLength();
        if (k <= 0 || k > length)
            return;
        if (2 * k - 1 == length)
            return;
        Node prevX = null;
        Node currX = head;
        for (int i = 1; i < k; i++) {
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = null;
        Node currY = head;
        for (int i = 1; i < length - k + 1; i++) {
            prevY = currY;
            currY = currY.next;
        }
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    int getLength() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Original linked list:");
        list.printList();

        int k = 2;
        list.swapKth(k);

        System.out.println("Linked list after swapping " + k + "th node from both ends:");
        list.printList();
    }
}
