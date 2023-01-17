package doubleshot;

public class ArrayBinaryHeap<T extends Comparable<? super T>> implements PriorityQueue<T> {
    private T[] data;

    @SuppressWarnings("unchecked")
    public ArrayBinaryHeap() {
        data = (T[]) new Object[16];
    }

    @SuppressWarnings("unchecked")
    public ArrayBinaryHeap(int capacity) {
        data = (T[]) new Object[capacity];
    }

    public ArrayBinaryHeap(T[] arr) {

    }

    public ArrayBinaryHeap(Iterable<T> objs) {

    }

    @Override
    public void enqueue(T obj) {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
