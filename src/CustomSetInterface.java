import java.util.Collection;

public interface CustomSetInterface<E> extends Collection<E> {
    @Override
    public boolean add(E val);

    @Override
    int size();
}
