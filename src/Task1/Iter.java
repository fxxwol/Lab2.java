package Task1;

import java.util.Iterator;

public class Iter implements Iterator {
    private int index = 0;
    private Queue myQueue;

    public Iter( Queue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public boolean hasNext() {
        return index < myQueue.size();
    }

    @Override
    public Object next() {
        return myQueue.getByIndex(index++);
    }
}
