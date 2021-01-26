package com.zhiyuanbyg.plus.string;

import java.io.UnsupportedEncodingException;

public class StringDemo {

    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.1,不变性，s从一个内存地址指向了另外一个内存地址
        String s ="hello";
        s ="world";

        s.replace("w","H");
        System.out.println(s);//这种的输出结果还是world

        s = s.replace("w","H");
        System.out.println(s);//这种就可以变了，Horld





    }

}
