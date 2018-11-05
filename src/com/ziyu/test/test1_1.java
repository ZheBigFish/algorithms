package com.ziyu.test;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class test1_1 {

    public static void main(String[] args) {

/* t15       int[] a = new int[]{2,15,1,4,3,6,1,4,2};
        int b[] = t15(a, 10);
        for (int c : b) {
            System.out.print(c);
        }*/

        System.out.println(t16(6));

    }


    public static void t1() {

        System.out.println((0 + 15) / 2);
//        System.out.println(2.0e - 6 * 100000000.1);
        System.out.println(true && false || true && true);

    }

    public static void t2() {

        System.out.println(4.1 >= 4);
//        System.out.println(2.0e - 6 * 100000000.1);
        System.out.println(1 + 2 + "3");

    }

    //编写一个程序，从命令行得到三个整数，如果他们都相等则打印equal，否则打印not equal
    public static void t3() {

        int i = 0;
        int[] key = new int[3];
        while (!StdIn.isEmpty() && i < 2) {
            key[i] = StdIn.readInt();
            if (i >= 1) {
                if (key[i] != key[i - 1]) {
                    System.out.println("not equal!");
                    return;
                }
            }
            i++;
        }
        System.out.println("equal!");

    }

    public static void t8() {

        System.out.println("b" + 'c');
        System.out.println((char) (4 + 'a'));
        System.out.println('f');

    }

    //编写一段代码，打印出一个二维布尔数组的内容。其中，用*表示真，空格表示假，打印出行号和列号
    public static void t11() {

        boolean b[][] = new boolean[][]{{true, false, true, true, true, false, true, false, false, true},
                {false, true, true, false, true, false, false, false, true},
                {false, false, false, true, false, true, true},
                {true, false, true, false, false, true, true, true},
                {false, false, true, true, true, false, true},
                {false, true, true, false, true, false, false, true}};

        int max = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i].length > max) {
                max = b[i].length;
            }
        }
        System.out.print("\t");
        for(int i = 1; i <= max; i++){
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (j == 0) {
                    System.out.print(i + 1 + "\t");
                }
                if (b[i][j]) {
                    System.out.print("*" + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

    private static int[] t15(int[] a, int M){

        int[] m = new int[M];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < a.length; j++){
                if(i ==  a[j]){
                    m[i]++;
                }
            }
        }
        return m;

    }

    public static String t16(int n){

        if(n <= 0) {
            return "";
        }
        return t16(n-3) + n + t16(n-2) + n;

    }
}
