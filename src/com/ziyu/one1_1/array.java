package com.ziyu.one1_1;

public class array {

    public static void main(String[] args) {

        double[] max = new double[]{1,5,78,12,0.5,6.7,5.8,12};
        double[] copy = copyArray(max);
        System.out.println(copy);
        System.out.println(fanzhuanArray(max).toString());

    }

    public static double max(double[] a){

        double max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;

    }

    public static double[] copyArray(double[] a){

        double[] copy = new double[a.length];
        for(int i = 0; i < a.length; i++){
            copy[i] = a[i];
        }
        return copy;

    }

    public static double[] fanzhuanArray(double[] a){


        for(int i = 0; i < a.length / 2; i++){
            a[i] = a[a.length - 1 - i];
        }
        System.out.println(a);
        return a;

    }

}