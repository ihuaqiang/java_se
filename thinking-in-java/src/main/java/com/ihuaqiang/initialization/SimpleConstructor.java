package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class SimpleConstructor {

    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            new Rock();
            //创建对象时,将会为对象分配存储空间,并调用相应的构造器.这就确保了在操作对象前,已经恰当初始化了
        }
    }


}

class Rock {
    Rock() {
        System.out.println("Rock");
    }

    Rock(int i) {
        System.out.println("Rock" + i);
    }
}
