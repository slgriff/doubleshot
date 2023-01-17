package doubleshot;

public interface PriorityQueue<T extends Comparable<? super T>> {
    void enqueue(T obj);

    T dequeue();

    int size();
}
