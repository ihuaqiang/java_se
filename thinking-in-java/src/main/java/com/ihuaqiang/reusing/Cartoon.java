package com.ihuaqiang.reusing;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/8
 */
public class Cartoon extends Drawing{
    Cartoon(){
        System.out.println("Cartoon constructor");
    }

   public static void main(String args[]){
       Cartoon x=new Cartoon();
   }
}

class Art{
    Art(){
        System.out.println("Art constructor");
    }
}

class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing constructor");
    }
}


