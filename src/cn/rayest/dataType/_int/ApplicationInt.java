package cn.rayest.dataType._int;

/**
 * Created by Rayest on 2016/8/26 0026.
 */
public class ApplicationInt {
    public static void main(String args[]){
        // 1.int
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max); //  2147483647
        System.out.println(min); // -2147483648
        // 数据溢出导致循环
        System.out.println(max + 1); // -2147483648
        System.out.println(max + 2); // -2147483647
        System.out.println(min - 1); //  2147483647
        System.out.println(min - 2); //  2147483646

        // 2.long
        long num = 100000000000000235L; // 以 L 结尾
        int x = (int) num; // 数据溢出，结果为负
        System.out.println(x);
        System.out.println(11 + 11); // 22
        System.out.println(11 + 1l); // 12

        // 3.byte: -128 ~ 127
        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println(byteMax); // 127
        System.out.println(byteMin); // -128

        // 4.char
        char A = 'A';
        int number_A = A;
        char a = 'a';
        int number_a = a;
        char zero = '0';
        int number_zero = zero;
        System.out.println(number_A);  // 'A'(65) ~ 'Z'(90)
        System.out.println(number_a);  // 'a'(97) ~ 'z'(122)
        System.out.println(number_zero);  // '0'(48) ~ '9'(57)

        char 李 = '李';
        char 锐 = '锐';
        int number_李 = 李;
        int number_锐 = 锐;
        System.out.println(number_李); // 26446
        System.out.println(number_锐); // 38160

        // A ---> a
        char c = 'A'; // A
        int number_c = c;
        number_c = number_c + 32;
        c = (char) number_c;
        System.out.println(c); // a

        // 5.boolean ...
        // 6.String:引用数据类型
        String s = "Hello";
        System.out.println(s + 1);
        System.out.println("Pay's a nice girl");
        System.out.println("Her name is \"Pay\"");
    }
}
