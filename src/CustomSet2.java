import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CustomSet2<T> implements Set1<T> {

    private int capacity = 100;
    private int current  = 0;
    private T[] content;

    public CustomSet2(int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException(0);
        }
        this.current = 0;
        this.capacity = capacity;
        this.content = (T[]) (new Object[capacity]);
    }

    public CustomSet2(T[] c, int s) throws InvalidCapacityException {
        this.content = (T[]) (new Object[capacity]);
        for (final T t : c) {
            content[current] = t;
            current++;
        }
    }

    public CustomSet2() {
        this.current = 0;
        this.content = (T[]) (new Object[capacity]);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return current;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean contains(Object o) {
        final T element = (T) o;
        boolean STOP = false;

        for (int index = 0; index < current && !STOP; index++) {
            if (content[index].equals(element))
                STOP = true;
        }
        return STOP;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(content, size());

    }

    public boolean equals(CustomSet2<T> set) {
        final boolean result = false;
        final ArraySet<T> temp1 = new ArraySet<T>();
        final ArraySet<T> temp2 = new ArraySet<T>();
        final T obj;
        boolean res = false;
        if (size() == set.size()) {
            res = Arrays.equals(this.content, set.content);
        }
        return res;
        //        if (size() == set.size()) {
        //            temp1.addAll(this);
        //            temp2.addAll(set);
        //
        //            final Iterator<T> scan = set.iterator();
        //
        //            while (scan.hasNext()) {
        //                obj = scan.next();
        //                if (temp1.contains(obj)) {
        //                    temp1.remove(obj);
        //                    temp2.remove(obj);
        //                }
        //
        //            }
        //
        //            result = (temp1.isEmpty() && temp2.isEmpty());
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean add(T e) {
        boolean res = false;
        if (e != null) {
            if (!contains(e)) {
                if (size() == capacity) {
                    expandCapacity();
                }
                content[current] = e;
                current++;
                res = true;
            }
        }
        return res;
    }

    private void expandCapacity() {
        final T[] larger = (T[]) (new Object[content.length * 2]);

        for (int index = 0; index < content.length; index++)
            larger[index] = content[index];

        content = larger;
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {

        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public int getCapacity() {
        // TODO Auto-generated method stub
        return this.capacity;
    }

}
