package cn.rayest.effective.general.string;

/**
 * Created by Rayest on 2016/12/1 0001.
 */
public class Number {
    public static void main(String[] args) {
        System.out.println(spellWords());
    }

    // StringBuilder 的性能好于 string 的 + 操作， StringBuffer 已经过时
    public static String spellWords() {
        StringBuilder stringBuilder = new StringBuilder("H");
        stringBuilder.append("e").append("l").append("l").append("o");
        return stringBuilder.toString();
    }
}
