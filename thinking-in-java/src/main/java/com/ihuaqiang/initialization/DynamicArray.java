package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class DynamicArray {
    public static void main(String args[]) {
        Other.main(new String[]{"fiddle", "de", "dum"});
    }
}

class Other {
    public static void main(String args[]) {
        for (String s : args) {
            System.out.println(s + " ");
        }
    }
}
