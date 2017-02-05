package com.ihuaqiang.initialization;


import static com.ihuaqiang.initialization.Print.print;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class OrderOfInitialization {
    public static void main(String args[]) {
        House h = new House();
        h.f();
    }
}


class Window {
    Window(int maker) {
      print("Window(" + maker + ")");
    }
}

class House {
    Window w1 = new Window(1);

    House() {
        print("House");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        print("f()");
    }

    Window w3 = new Window(3);
}
