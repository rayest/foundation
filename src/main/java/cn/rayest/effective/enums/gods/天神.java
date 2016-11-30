package cn.rayest.effective.enums.gods;

/**
 * Created by Rayest on 2016/11/29 0029.
 */
public enum 天神 {
    如来佛祖,
    玉皇大帝,
    王母娘娘,
    太白金星,
    十八罗汉,;

    public int 天神的顺序() {
        return ordinal() + 1;
    }
}
