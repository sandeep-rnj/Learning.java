package algorithm;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class CircularQueue {
    Node front, rear;
    public CircularQueue() {
        front = rear = null;
    }
    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }
    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int data = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
        return data;
    }
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }
}
