package com.ihuaqiang.initialization.exercise;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/5
 */
public class Dog {

    public void bark() {
        System.out.println("barking ");
    }

    public void bark(int i, double d) {
        System.out.println("int double");
    }

    public void bark(double d, int i) {
        System.out.println("double int");
    }


    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.bark(1, 2.2);
        dog.bark(2.2, 1);
    }
}
