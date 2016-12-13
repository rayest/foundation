package cn.rayest.java8;

import cn.rayest.java8.chap3.FunctionComposite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rayest on 2016/12/13 0013.
 */
public class FunctionCompositeTest {
    @Test
    public void testGetAndThen() throws Exception {
        FunctionComposite functionComposite = new FunctionComposite();
        assertEquals(4, functionComposite.getAndThen());
    }

    @Test
    public void testGetCompose() throws Exception {
        FunctionComposite functionComposite = new FunctionComposite();
        assertEquals(3, functionComposite.getCompose());
    }
}