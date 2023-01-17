package doubleshot;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    private final Deque<T> delegate;

    public LinkedListStack() {
        delegate = new LinkedList<T>();
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
