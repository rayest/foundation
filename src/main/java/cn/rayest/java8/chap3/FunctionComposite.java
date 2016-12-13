package cn.rayest.java8.chap3;

import java.util.function.Function;

/**
 * Created by Rayest on 2016/12/13 0013.
 */
public class FunctionComposite {
    public int getAndThen() {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        Function<Integer, Integer> h = f.andThen(g);
        return h.apply(1);
    }

    public int getCompose() {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        Function<Integer, Integer> h = f.compose(g);
        return h.apply(1);
    }
}
