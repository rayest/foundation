package cn.rayest.java8.lambda;

/**
 * Created by Rayest on 2016/11/19 0019.
 */
public class Application {
    // lambda 表达式的基础是在匿名了内部类上
    public static void main(String[] args) {
        function(new Lambda() {
            @Override
            public void showLambda() {
                System.out.println("This is lambda expression");
            }
        });

        // lambda 表达式
        function(()-> System.out.println("This is also lambda expression"));
    }

    public static void function(Lambda lambda) {
        lambda.showLambda();
    }
}
