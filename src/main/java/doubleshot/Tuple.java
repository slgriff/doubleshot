package doubleshot;

public interface Tuple<T> {
    T get(int idx);

    void set(int idx, T obj);
}
