package Task1;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        // Add queue element
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        for(Object i : q){
            System.out.println(i);
        }
        q.insertFront(0);
        for(Object i : q){
            System.out.println(i);
        }
       // System.out.print(" Size : " + q.isSize());
        // Remove queue element
        System.out.print("\n Dequeue Node : " + q.dequeue());
        System.out.print("\n Dequeue Node : " + q.dequeue());
        System.out.print("\n Dequeue Node : " + q.dequeue() + "\n");
        for(Object i : q){
            System.out.println(i);
        }
        //System.out.print(" Size : " + q.isSize());
    }
}
