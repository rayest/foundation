package cn.rayest.effective.builder;

/**
 * Created by Rayest on 2016/11/27 0027.
 */

// Builder Patter
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // 必选参数
        private final int servingSize;
        private final int servings;

        // 选填参数，默认值为 0
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        // 仅包含必填参数的构造器
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        // 每个选填参数各自有一个 set 方法，并返回 Builder 本身
        public Builder setCalories(int value) {
            calories = value;
            return this;
        }

        public Builder setFat(int value) {
            fat = value;
            return this;
        }

        public Builder setCarbohydrate(int value) {
            carbohydrate = value;
            return this;
        }

        public Builder setSodium(int value) {
            sodium = value;
            return this;
        }

        // 获取 NutritionFacts 实例对象
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }
}
