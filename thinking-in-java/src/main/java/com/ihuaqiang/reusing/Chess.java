package com.ihuaqiang.reusing;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/8
 */
public class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Chess constructor");
    }
    public static void main(String args[]){
        Chess x=new Chess();
    }


}

class Game{
    Game(int i){
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game{

    BoardGame(int i) {
        super(i);
        System.out.println("BoradGame constructor");
    }
}
