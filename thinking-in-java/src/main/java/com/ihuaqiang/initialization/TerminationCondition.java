package com.ihuaqiang.initialization;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/5
 */
public class TerminationCondition {


    public static void main(String args[]) {
        Book novel = new Book(true);

        novel.checkIn();

        new Book(true);

        System.gc();
    }
}

class Book {
    boolean checkedOut = false;

    Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkedOut){
            System.out.println("Error");
        }
    }
}
