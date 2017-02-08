package com.ihuaqiang.access;

import com.ihuaqiang.access.dessert.Cookie;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/7
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp(){
        //bite();

    }

    public static void main(String args[]){
        ChocolateChip x=new ChocolateChip();
        x.chomp();
    }
}
