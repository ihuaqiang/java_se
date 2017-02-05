package com.ihuaqiang.initialization;

import static com.ihuaqiang.initialization.Print.print;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class ExplicitStatic {
    public static void main(String args[]) {
        print("Inside main()");
        Cups.cup1.f(99);
    }

    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}

class Cup {
    Cup(int maker) {
        print("Cup(" + maker + ")");
    }

    void f(int maker) {
        print("f(" + maker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        //这段代码只执行一次;当首次生成这个类的一个对象时,或者首次访问属于那个类的静态数据成员时
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        print("Cups()");
    }
}
