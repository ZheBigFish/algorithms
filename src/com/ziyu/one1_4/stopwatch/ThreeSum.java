package com.ziyu.one1_4.stopwatch;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class ThreeSum {

    public static int count(int[] a){
        //统计和为0的元组的数量
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++){
            for (int j = i+1; j < N; j++){
                for (int k = j+1; k < N; k++){
                    if (a[i] + a[j] + a[k] == 0){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        int[] a = In.readInts("D:\\360极速浏览器下载\\data\\algs4-data\\1Kints.txt");
        StdOut.println(count(a));
    }

}
