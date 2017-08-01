import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomSet<E> implements CustomSetInterface<E> {

    private final HashMap<E, Object> map   = new HashMap<>();

    final Object                     DUMMY = new Object();
    final boolean                    TRUE  = true;
    final boolean                    FALSE = false;
    Set<Integer>                     s     = new HashSet<>();

    @Override
    public int size() {
        return map.size();
    }

    public CustomSet(ArrayList<E> e) {
        if (e != null && e.size() != 0) {
            for (final E ele : e) {
                this.add(ele);
            }
        }
    }

    @Override
    public boolean add(E val) {
        return (map.put(val, DUMMY) == null);
    }

    @Override
    public boolean isEmpty() {
        return map.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public Iterator<E> iterator() {
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
    public boolean addAll(Collection<? extends E> c) {
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

}
