package algorithm;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class QueueUsingLinkedList {
    private ListNode front;
    private ListNode rear;

    public QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int val) {
        ListNode newNode = new ListNode(val);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; 
        }
        int dequeuedValue = front.val;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return dequeuedValue;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.val;
    }
    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element of the queue: " + queue.peek());

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}