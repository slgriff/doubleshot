package doubleshot;

import java.util.Map;
import java.util.HashMap;

public class DefaultHashMap<T> implements Counter<T> {
    private final Map<T, Integer> m;

    public DefaultHashMap() {
        m = new HashMap<T, Integer>();
    }

    @Override
    public int getCount(T obj) {
        if (!m.containsKey(obj)) {
            return 0;
        }

        return m.get(obj);
    }

    @Override
    public int increment(T obj) {
        if (!m.containsKey(obj)) {
            m.put(obj, 0);
        }

        return m.put(obj, m.get(obj) + 1);
    }

    @Override
    public int decrement(T obj) {
        if (!m.containsKey(obj)) {
            m.put(obj, 0);
        }

        return m.put(obj, m.get(obj) - 1);
    }
}
