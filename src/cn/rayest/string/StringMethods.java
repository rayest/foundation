package cn.rayest.string;

/**
 * Created by Rayest on 2016/8/28 0028.
 */
public class StringMethods {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = "Hello";
        String d = "HELLO";
        String f = "helloWorld";
        String g = "h e l l o w o r l d";
        String h = "hello pay ray lee candy";
        String i = "hello|pay|ray|lee|candy";
        String k = "   -- hello candy --   ";

        String[] h2 = h.split(" ");   // 直接空格
        String[] i2 = i.split("\\|"); // 转义符号: \\

        System.out.println(a.equals(b)); // true
        System.out.println(a.indexOf(0)); // h
        System.out.println(a.compareToIgnoreCase(d)); // 0
        System.out.println(a.contains("he")); // true
        System.out.println("".isEmpty()); // true
        System.out.println(k.trim()); // -- hello candy --

        char[] as = a.toCharArray();
        for (int j = 0; j < as.length; j++) {
            System.out.print(as[j] + " "); // h e l l o
        }
        System.out.println(b.compareTo(a));  // 0
        System.out.println(c.compareTo(a));  // -32
        System.out.println(d.compareTo(a));  // -32
        System.out.println(d.compareToIgnoreCase(a)); // 0
        System.out.println(f.substring(5)); // World
        System.out.println(g.replaceAll(" ", "")); // helloWorld
        for (int j = 0; j < h2.length; j++) {
            System.out.print(h2[j] + " "); // hello pay ray lee candy
        }
        System.out.println();
        for (int j = 0; j < i2.length; j++) {
            System.out.print(i2[j] + " "); // hello pay ray lee candy
        }
        System.out.println();
        System.out.println(initCap("paytian")); // 调用首字母大写方法
    }

    // 自定义首字母大写方法
    public static String initCap(String str) {
        if (str == null || (str.length() == 0)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
