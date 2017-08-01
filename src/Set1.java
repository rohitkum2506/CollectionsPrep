import java.util.Collection;
import java.util.Iterator;

public interface Set1<E> extends Collection<E> {

    @Override
    public int size();

    @Override
    boolean isEmpty();

    @Override
    boolean contains(Object o);

    @Override
    Iterator<E> iterator();

    @Override
    Object[] toArray();

    @Override
    boolean add(E e);

    @Override
    boolean remove(Object o);

    @Override
    boolean containsAll(Collection<?> c);

    @Override
    boolean addAll(Collection<? extends E> c);

    @Override
    boolean retainAll(Collection<?> c);

    @Override
    boolean removeAll(Collection<?> c);

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();
}
