package com.ihuaqiang.initialization;

import static com.ihuaqiang.initialization.Print.print;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class ArraysOfPrimitives {

    public static void main(String args[]) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a2.length; i++) {
            a2[i] = a1[i] + 9;
        }
        for (int i = 0; i < a1.length; i++) {
            print("a1[" + i + "]=" + a1[i]);
        }
    }


}
