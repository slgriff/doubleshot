package doubleshot;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayStack<T> implements Stack<T> {
    private final Deque<T> delegate;

    public ArrayStack() {
        delegate = new ArrayDeque<T>();
    }

    @Override
    public void push(T obj) {
        delegate.push(obj);
    }

    @Override
    public T pop() {
        return delegate.pop();
    }

    @Override
    public T peek() {
        return delegate.peek();
    }

    @Override
    public int size() {
        return delegate.size();
    }

    @Override
    public boolean isEmpty() {
        return delegate.isEmpty();
    }
}
