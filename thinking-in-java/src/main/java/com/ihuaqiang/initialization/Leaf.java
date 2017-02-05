package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class Leaf {
    int i = 0;

    Leaf increment() {
        i++;
        return this;
        //返回了对当前对象的引用
    }

    void print() {
        System.out.println("i=" + i);
    }

    public static void main(String args[]) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}
