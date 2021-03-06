package cn.rayest.java8.lambda;

/**
 * Created by Rayest on 2016/11/19 0019.
 * lambda 表达式的基础是在匿名了内部类上
 * 1.(参数)-> 单行语句
 * 2.(参数)-> { 单行语句 }
 * 3.(参数)-> 表达式
 */
public class Application {
    public static void main(String[] args) {
        // 1. 匿名内部类，实例化接口，普通的方法调用
        showLambda(new Lambda() {
            @Override
            public void showLambda() {
                System.out.println("This is lambda expression");
            }
        });

        // 2. lambda 表达式：单行表达式
        showLambda(() -> System.out.println("This is also lambda expression"));

        // 3. lambda 表达式：多行表达式
        showLambdaDouble((s) -> {
            s = s.toUpperCase();
            System.out.println(s);
        });

        // 4.lambda 表达式
        add((s1, s2) -> s1 + s2);
    }

    public static void showLambda(Lambda lambda) {
        lambda.showLambda();
    }

    public static void showLambdaDouble(LambdaDouble lambdaDouble) {
        lambdaDouble.showLambdaDouble("showLambdaDouble()");
    }

    public static void add(LambdaAdd lambdaAdd) {
        System.out.println(lambdaAdd.add(10, 20));
    }
}
