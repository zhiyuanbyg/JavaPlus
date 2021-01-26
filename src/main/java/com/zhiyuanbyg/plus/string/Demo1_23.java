package com.zhiyuanbyg.plus.string;

public class Demo1_23 {

    //  ["ab", "a", "b"]
    public static void main(String[] args) {

        String x = "ab";
        String s = new String("a") + new String("b");

        // 堆  new String("a")   new String("b") new String("ab")
        String s2 = s.intern(); // 将这个字符串对象尝试放入串池，如果有则并不会放入，如果没有则放入串池， 会把串池中的对象返回

        System.out.println( s2 == x);//true,s2始终会返回串池中的内容
        System.out.println( s == x );//false，串池中有了，则s不放入了，所以s还是在堆里
    }

}
