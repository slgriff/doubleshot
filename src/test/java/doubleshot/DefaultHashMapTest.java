package doubleshot;

import org.junit.Assert;
import org.junit.Test;

public class DefaultHashMapTest {

    @Test
    public void test() {
        Counter<Character> counter = new DefaultHashMap<>();

        Assert.assertEquals(0, counter.getCount('a'));

        counter.increment('a');

        Assert.assertEquals(1, counter.getCount('a'));

        counter.decrement('a');

        Assert.assertEquals(0, counter.getCount('a'));
    }
}
