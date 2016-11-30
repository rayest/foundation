package cn.rayest.effective.objects;

/**
 * Created by Rayest on 2016/11/27 0027.
 */
public class Objects {

    // 创建了不必要的对象
    String s = new String("You created an unnecessary string content");

    // 静态工厂方法
    public static boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
