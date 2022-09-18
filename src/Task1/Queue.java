package Task1;

import java.util.Iterator;

public class Queue implements Iterable {
    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    // Add a node into queue
    public void enqueue(final int data) {
        final Node node = new Node(data, this.rear);
        if (this.front == null) {
            this.front = node;
            this.size = 1;
        } else {
            this.rear.next = node;
            this.size++;
        }
        this.rear = node;
    }

    void insertFront(final int data) {
        final Node node = new Node(data, this.rear);
        if (node == null)
            System.out.print("OverFlow\n");
        else {
            if (front == null)
                rear = front = node;
            else {
                node.next = front;
                front.prev = node;
                front = node;
            }
            size++;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public int peek() {
        if (this.isEmpty() == true) {
            System.out.println("\n Empty Queue");
            return -1;
        } else {
            return this.front.data;
        }
    }

    // Remove a front node of a queue
    public int dequeue() {
        if (this.isEmpty() == true) {
            return -1;
        } else {
            final int data = this.peek();
            final Node temp = this.front;
            if (this.front == this.rear) {
                this.rear = null;
                this.front = null;
            } else {
                this.front = this.front.next;
                this.front.prev = null;
            }
            this.size--;
            return data;
        }
    }

    void deleteRear() {
        if (isEmpty()) {

            System.out.print("UnderFlow\n");
        }
        else {
            final Node temp = rear;
            rear = rear.prev;
            if (rear == null)
                front = null;
            else
                rear.next = null;
            size--;
        }
    }

    @Override
    public Iterator iterator() {
        return new Iter(this);
    }

    public int getByIndex(final int index) {
        if (!(index >= 0 && index < size)) {
            throw new IndexOutOfBoundsException();
        }
        Node x = front;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x.data;
    }
}
