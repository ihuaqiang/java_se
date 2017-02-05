package com.ihuaqiang.initialization;

import java.util.Arrays;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class ArrayInit {
    public static void main(String args[]) {
        Integer[] a = {new Integer(1), new Integer(2), 3};
        Integer[] b = new Integer[]{new Integer(1), new Integer(2), 3};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
