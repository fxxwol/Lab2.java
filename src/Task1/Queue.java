package Task1;

import java.util.Iterator;

public class Queue implements Iterable{
    protected Node front;
    protected Node rear;
    protected int size;
    public Queue()
    {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    public int size() {
        return size;
    }
    // Add a node into queue
    public void enqueue(int data)
    {
        // Create a new node
        Node node = new Node(data, this.rear);
        if (this.front == null)
        {
            // When adding a first node of queue
            this.front = node;
            this.size = 1;
        }
        else
        {
            this.rear.next = node;
            this.size++;
        }
        this.rear = node;
    }

    void insertFront(int data)
    {
        Node node = new Node(data, this.rear);
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
    public boolean isEmpty()
    {
        return size == 0;
    }
    // Get a front element of queue
    public int peek()
    {
        if (this.isEmpty() == true)
        {
            System.out.println("\n Empty Queue");
            // When stack is empty
            return -1;
        }
        else
        {
            return this.front.data;
        }
    }
    // Remove a front node of a queue
    public int dequeue() {
        if (this.isEmpty() == true) {
            // When queue is empty
            return -1;
        } else {
            int data = this.peek();
            Node temp = this.front;
            if (this.front == this.rear) {
                // When queue contains only one node
                this.rear = null;
                this.front = null;
            } else {
                this.front = this.front.next;
                this.front.prev = null;
            }
            // Change queue size
            this.size--;
            // Delete node value
            return data;
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
