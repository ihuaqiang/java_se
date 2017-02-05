package com.ihuaqiang.initialization.exercise;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class Second {

    public static String s1 = "s1";
    public static String s2;

    Second(String s) {
        s2 = s;
    }

    public static void main(String args[]) {
        Second second = new Second("hello");
        System.out.println("si.s1 = " + second.s1);
        System.out.println("si.s2 = " + second.s2);


        /*The s1 field is initialized before the constructor is entered; technically, so is the
        s2 field, which is set to null as the object is created. The more flexible s2 field
        lets you choose what value to give it when you call the constructor, whereas s1
        always has the same value.*/
    }
}
