package doubleshot;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListStackTest {
    @Test
    public void test() {
        Stack<Integer> stack = new LinkedListStack<>();

        Assert.assertEquals(0, stack.size());
        Assert.assertTrue(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(3, stack.size());

        Assert.assertEquals(3, stack.peek().intValue());
        Assert.assertEquals(3, stack.pop().intValue());

        Assert.assertEquals(2, stack.size());

        Assert.assertEquals(2, stack.peek().intValue());
        Assert.assertEquals(2, stack.pop().intValue());

        Assert.assertEquals(1, stack.size());

        Assert.assertEquals(1, stack.peek().intValue());
        Assert.assertEquals(1, stack.pop().intValue());

        Assert.assertEquals(0, stack.size());
        Assert.assertTrue(stack.isEmpty());
    }
}
