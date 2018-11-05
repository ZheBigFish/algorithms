package com.ziyu.one1_1;

import com.ziyu.one1_1.Counter;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class Flips {

    public static void main(String[] args) {

        int T = Integer.parseInt("10");
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for(int t = 0; t < T; t++){
            if(StdRandom.bernoulli(0.5)) {
                heads.increment();
            }else {
                tails.increment();
            }
        }
        StdOut.println(heads);
        StdOut.println(tails);
        int d = heads.tally() - tails.tally();
        StdOut.println("delte:" + Math.abs(d));

    }

}
