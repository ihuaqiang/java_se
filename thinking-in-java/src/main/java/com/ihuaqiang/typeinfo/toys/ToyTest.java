package com.ihuaqiang.typeinfo.toys;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/26
 */
public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class Name:" + cc.getName() + " is interface?[" + cc.isInterface() + "]");
        System.out.println("Simple name:" + cc.getSimpleName());
        System.out.println("Canonical name:" + cc.getCanonicalName());
    }

    public static void main(String args[]) {
        Class c = null;
        try {
            c = Class.forName("com.ihuaqiang.typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        System.out.println("--------------------------------------");
        Class up = c.getSuperclass();
        Object object = null;
        try {
            object = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(object.getClass());
    }
}


class Toy {

    Toy(int i) {

    }
}

class FancyToy extends Toy implements HasBatteries, Shoots, Waterproof {
    FancyToy() {
        super(1);
    }
}
