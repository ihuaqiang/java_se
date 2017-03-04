package com.ihuaqiang.strings;

import java.util.Formatter;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/26
 */
public class Conversion {
    public static void main(String args[]) {
        Formatter f = new Formatter(System.out);

        char u = 'a';
        System.out.println("u='a'");
        f.format("s:%s\n", u);
    }
}
