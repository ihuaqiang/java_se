package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class AutoboxingVarags {
    public static void f(Integer... args) {
        for (Integer integer : args) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        f(new Integer(1), new Integer(2));
        f(4, 5, 6, 7, 8, 9);
        f(10, new Integer(11), 12);
    }
}
