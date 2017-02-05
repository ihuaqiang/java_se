package com.ihuaqiang.initialization;

import static com.ihuaqiang.initialization.Print.print;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class Mugs {

    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        print("mug1&mug2 initialized");
    }

    Mugs() {
        print("Mugs");
    }

    Mugs(int maker) {
        print("Mugs(int)");
    }

    public static void main(String args[]) {
        print("Inside main");
        new Mugs();
        print("new Mugs() completed");
        new Mugs(1);
        print("new Mugs() completed");
    }
}

class Mug {
    Mug(int maker) {
        print("Mug(" + maker + ")");
    }

    void f(int maker) {
        print("f(" + maker + ")");
    }
}


