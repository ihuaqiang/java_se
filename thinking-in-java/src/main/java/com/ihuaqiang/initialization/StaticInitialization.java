package com.ihuaqiang.initialization;


import static com.ihuaqiang.initialization.Print.print;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/4
 */
public class StaticInitialization {
    public static void main(String args[]) {
        print("creating new Cupboard() in main");
        new Cupboard();
        print("creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}

class Bowl {
    Bowl(int maker) {
        print("Bowl(" + maker + ")");
    }

    void f1(int maker) {
        Print.print("f1(" + maker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    //静态初始化只有在必要时刻才会进行.如果不创建Table对象,也不引用Table.b1或者b2,那么静态的Bowl 永远不会被创建
    Table() {
        print("Table()");
        bowl2.f1(1);
    }

    void f2(int maker) {
        print("f2(" + maker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}


class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        print("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int maker) {
        print("f3(" + maker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

