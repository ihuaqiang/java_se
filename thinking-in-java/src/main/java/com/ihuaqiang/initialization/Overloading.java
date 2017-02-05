package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class Overloading {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("overloaded method");
        }
    }
}

class Tree {
    int height;

    Tree() {
        System.out.println("planting a seeding");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " + height + " feet tall");
    }

    void info() {
        System.out.println("this is a " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ":Tree is " + height + " feet tall");
    }
}
