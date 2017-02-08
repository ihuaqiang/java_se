package com.ihuaqiang.util;

import java.io.PrintStream;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/7
 */
public class Print {
    public static void print(Object object){
        System.out.println(object);
    }

    public static void print(){
        System.out.println();
    }

    public static void printb(Object object){
        System.out.println(object);
    }

    public static PrintStream printf(String format,Object...args){
        return System.out.printf(format,args);
    }
}
