package Task1;

public class Node {
    public int data;
    public Node prev;
    public Node next;

    public Node(int data, Node prev) {
        this.data = data;
        this.next = null;
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
