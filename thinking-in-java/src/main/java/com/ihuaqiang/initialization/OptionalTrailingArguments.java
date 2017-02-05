package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class OptionalTrailingArguments {
    static void f(int required, String... trailing) {
        System.out.println("required:" + required + "");
        for (String s : trailing) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }
}
