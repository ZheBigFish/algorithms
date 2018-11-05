package com.ziyu.one1_1;


import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] whitelist = new int[]{1,5,78,12,35,67,58,12};
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(rank(key, whitelist) == -1){
                StdOut.println(key);
            }
        }

    }

    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length -1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            }else if (key > a[mid]) {
                lo = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
