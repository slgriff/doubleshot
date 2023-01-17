package doubleshot;

public interface Counter<T> {
    int getCount(T obj);

    int increment(T obj);

    int decrement(T obj);
}
