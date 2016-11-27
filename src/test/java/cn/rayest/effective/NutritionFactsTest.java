package cn.rayest.effective;

import org.junit.Test;

/**
 * Created by Rayest on 2016/11/28 0028.
 */
public class NutritionFactsTest {
    @Test
    public void testNutritionFacts() throws Exception {
        // 创建对象, 并设置相应参数
        NutritionFacts cocaCola = new NutritionFacts
                .Builder(240, 8)
                .setCalories(2000)
                .setSodium(35)
                .setCarbohydrate(27)
                .build();
    }
}
