package com.ihuaqiang.reusing;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/8
 */
public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    public static void main(String args[]){
        SpaceShip protector=new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
