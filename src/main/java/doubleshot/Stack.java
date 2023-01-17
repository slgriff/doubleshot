package doubleshot;

public interface Stack<T> {
    T pop();

    void push(T obj);

    T peek();

    int size();

    boolean isEmpty();
}
