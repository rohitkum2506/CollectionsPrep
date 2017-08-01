
public class InvalidCapacityException extends Exception {
    int capacity = 0;

    public InvalidCapacityException(int c) {
        capacity = c;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
