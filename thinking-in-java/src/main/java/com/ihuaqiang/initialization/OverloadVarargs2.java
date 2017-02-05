package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class OverloadVarargs2 {

    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }


    public static void main(String args[]) {
        f(1, 'a');
        //f('a','a','a');
    }
}
