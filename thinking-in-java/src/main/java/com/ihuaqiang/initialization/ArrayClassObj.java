package com.ihuaqiang.initialization;

import java.util.Arrays;
import java.util.Random;

import static com.ihuaqiang.initialization.Print.print;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class ArrayClassObj {
    public static void main(String args[]) {
        Integer[] a;
        Random random = new Random();
        a = new Integer[random.nextInt(20)];
        print(a.length);
        print(Arrays.toString(a));

    }
}
