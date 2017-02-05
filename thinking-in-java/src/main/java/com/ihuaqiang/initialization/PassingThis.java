package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/5
 */
public class PassingThis {
    public static void main(String args[]) {
        new Person().eat(new Apple());
    }
}

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple) {//外部工具方法
        return apple;
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
        //为了将其自身传递给外部方法,Apple必须使用this关键字
    }
}


