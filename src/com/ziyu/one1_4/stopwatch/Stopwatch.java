package com.ziyu.one1_4.stopwatch;

import edu.princeton.cs.introcs.StdRandom;

public class Stopwatch {

    private final long start;

    public double elapseTime(){
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    public Stopwatch(){
        start = System.currentTimeMillis();
    }

    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform(-100000, 1000000);
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        double time = timer.elapseTime();
        System.out.println(time);
    }

}


