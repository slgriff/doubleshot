package doubleshot;

public class ArrayTuple<T> implements Tuple<T> {
    private T[] data;

    @SuppressWarnings("unchecked")
    public ArrayTuple(int size) {
        data = (T[]) new Object[size];
    }

    @Override
    public T get(int idx) {
        if (idx < 0 || idx >= data.length) {
            throw new IllegalArgumentException();
        }

        return data[idx];
    }

    @Override
    public void set(int idx, T obj) {
        if (idx < 0 || idx >= data.length) {
            throw new IllegalArgumentException();
        }

        data[idx] = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (this == o) {
            return true;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        ArrayTuple<T> tuple = (ArrayTuple<T>) o;

        if (data.length != tuple.data.length) {
            return false;
        }

        for (int i = 0; i < data.length; i++) {
            if (!data[i].equals(tuple.data[i])) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        int res = 0;
        for (T obj : data) {
            res += obj.hashCode();
        }
        return res;
    }
}
