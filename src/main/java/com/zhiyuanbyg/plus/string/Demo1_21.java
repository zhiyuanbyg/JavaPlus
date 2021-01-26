package com.zhiyuanbyg.plus.string;

/**
 * 演示字符串相关面试题
 */
public class Demo1_21 {

    public static void main(String[] args) {
        String s1 = "a";// a，常量池中
        String s2 = "b";// b，常量池中
        String s3 = "a" + "b"; // ab，常量池中
        String s4 = s1 + s2;   // new String("ab")，堆中
        String s5 = "ab";// ab，常量池中
        String s6 = s4.intern();// ab，常量池中

// 问
        System.out.println(s3 == s4); // false
        System.out.println(s3 == s5); // true
        System.out.println(s3 == s6); // true

        String x2 = new String("c") + new String("d"); // new String("cd")
//        x2.intern();  //常量池没有，入池
        String x1 = "cd";
        x2.intern();//常量池中有了，不入池


// 问，如果调换了【最后两行代码】的位置呢，如果是jdk1.6呢
        System.out.println(x1 == x2);
    }
}
