import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class QueueA<T> implements Queue<T> {

    private final T[] content;
    private int       head;
    private int       tail;
    private final int capacity = 10;
    private int       total;

    public QueueA() {
        content = (T[]) (new Object[capacity]);
    }

    @Override
    public int size() {
        if (content == null) {
            throw new NullPointerException();
        }
        return total;
    }

    @Override
    public boolean isEmpty() {
        if (content == null) {
            throw new NullPointerException();
        }
        return content.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean add(T e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean offer(T e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T poll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T element() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return null;
    }

}
