package com.ihuaqiang.access;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/7
 */
public class Lunch extends Object{
   void testPrivate(){
       //Soup1 soup1=new Soup1();
   }

   void testStatic(){
       Soup1 soup=Soup1.makeSoup();
   }

   void testSingleton(){
       Soup2.access().f();
   }

}

class Soup1{
    private Soup1(){

    }

    public static Soup1 makeSoup(){
        return new Soup1();
    }

}

class Soup2 {
    private Soup2() {

    }

    private static Soup2 ps2 = new Soup2();

    public static Soup2 access() {
        return ps2;
    }

    public void f(){

    }

}
