package com.ihuaqiang.access;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/7
 *
 */
public class IceCream{
    public static void main(String args[]){
        //Sundae x=new Sundae();
        Sundae x=Sundae.makeSundae();
    }
}


class Sundae {
    private  Sundae(){

    }

    static Sundae makeSundae(){
        return new Sundae();
    }

}
