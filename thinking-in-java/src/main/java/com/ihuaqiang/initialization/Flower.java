package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/5
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only,petalCount=" + petalCount);
    }

    Flower(String ss){
        System.out.println("Constructor w/ String arg only,ss"+ss);
        s=ss;
    }

    Flower(String s,int petals){
        this(petals);//必须将构造器调用置于最起始处,否则编译会报错
        //this(s); 不能调用两个
        this.s=s;
        System.out.println("String & int args");
    }

    Flower(){
        this("hi",47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount(){
        //this(11);
        System.out.println("petalCount="+petalCount+"s="+s);
    }

    public static void main(String args[]) {
        Flower x=new Flower();
        x.printPetalCount();
    }
}
