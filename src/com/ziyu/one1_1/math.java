package com.ziyu.one1_1;

public class math {

    public static void main(String[] args) {

        int a = -4;
        System.out.println(a);
        System.out.println(abs(a));

    }

    public static int abs(int x){

        if(x < 0){
            return -x;
        }else{
            return x;
        }

    }


    public static double abs(double x){

        if(x < 0){
            return -x;
        }else{
            return x;
        }

    }

    public static boolean isPrime(double x){

        if(x < 2){
            return false;
        }
        for(int i = 2; i * i <= x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;

    }

}