package cn.rayest.effective;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rayest on 2016/11/27 0027.
 */
public class ObjectsTest {

    @Test
    public void testValueOf() throws Exception {
        assertEquals(Objects.valueOf(true), true);
    }

    @Test
    public void test() throws Exception {
        Objects objects = new Objects();
        assertEquals(objects.s, "You created an unnecessary string content");
    }
    
}
