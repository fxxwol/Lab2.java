package Task1;

public class Main {
    public static void main(final String[] args) {
       final Queue q = new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        for(final Object i : q){
            System.out.println(i);
        }
        q.insertFront(0);
        for(final Object i : q){
            System.out.println(i);
        }

        System.out.print("\n Dequeue Node : " + q.dequeue());
        System.out.print("\n Dequeue Node : " + q.dequeue());
        System.out.print("\n Dequeue Node : " + q.dequeue() + "\n");

        for(final Object i : q){
            System.out.println(i);
        }
        q.deleteRear();
        for(final Object i : q){
            System.out.println(i);
        }
    }
}
