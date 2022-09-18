package Task1;

public class Node {
    public int data;
    public Node prev;
    public Node next;

    public Node(final int data,final  Node prev) {
        this.data = data;
        this.next = null;
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(final int data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(final Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(final Node next) {
        this.next = next;
    }
}
