package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class VarArgs {
    static void printArray(Object[] args) {
        for (Object object : args) {
            System.out.print(object + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        printArray(new Object[]{new Integer(32), new Float(3.14), new Double(11.11)});
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
}

class A {

}
