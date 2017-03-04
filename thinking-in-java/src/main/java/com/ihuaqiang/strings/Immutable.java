package com.ihuaqiang.strings;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/26
 */
public class Immutable {

    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String args[]) {
        String q = "howdy";
        System.out.println(q);
        String qq = upcase(q);//实际传递的是引用的一个拷贝
        //每当
        System.out.println(qq);
        System.out.println(q);

    }
}
