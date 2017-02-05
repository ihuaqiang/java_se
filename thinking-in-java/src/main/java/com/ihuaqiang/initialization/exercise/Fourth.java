package com.ihuaqiang.initialization.exercise;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/5
 */
public class Fourth {
    Fourth() {
        System.out.println("default Constructor");
    }

    Fourth(String ss) {
        System.out.println("s----->" + ss);
    }


    public static void main(String args[]) {
        new Fourth("fourth");
    }
}
