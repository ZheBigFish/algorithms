package com.ziyu.one1_1;

public class Counter {

    private int temp = 0;

    Counter(String id){}

    void increment(){
        temp++;
    }

    int tally(){
        return temp;
    }

    @Override
    public String toString(){
        return String.valueOf(temp);
    }

}
