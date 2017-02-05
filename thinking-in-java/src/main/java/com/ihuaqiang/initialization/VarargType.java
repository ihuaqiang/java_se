package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class VarargType {
    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println("length =" + args.length);
    }

    static void g(int... args) {
        System.out.println(args.getClass());
        System.out.println("length =" + args.length);
    }

    public static void main(String args[]) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
}
