import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private final int size;
    private final T[] items;
    private int       current;

    public ArrayIterator(T[] Collection, int size) {
        this.size = size;
        this.items = Collection;
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return (current < size);
    }

    @Override
    public T next() {
        if (!hasNext())
            try {
                throw new Exception();
            } catch (final Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        return items[current++];
    }

}
