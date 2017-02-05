package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object object : args) {
            System.out.print(object + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        printArray(new Object[]{new Integer(32), new Float(3.14), new Double(11.11)});
        printArray(32, 3.14F, 11.11);
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
        printArray(new Integer[]{1, 2, 3, 4});
        printArray();
    }
}
