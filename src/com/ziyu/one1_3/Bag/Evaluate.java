package com.ziyu.one1_3.Bag;

import edu.princeton.cs.introcs.StdIn;

import java.util.Stack;

//解释器：解释给定字符串所表达的运算并计算得到的结果
public class Evaluate {

    public static void main(String[] args) {

        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();


        while (!StdIn.isEmpty()) {
            String ss = StdIn.readString();
            for(int i = 0; i < ss.length(); i++){
                String s = ss.substring(i, i+1);
                if      (s.equals("("))                    ;
                else if (s.equals("+"))         ops.push(s);
                else if (s.equals("-"))         ops.push(s);
                else if (s.equals("*"))         ops.push(s);
                else if (s.equals("/"))         ops.push(s);
                else if (s.equals("sqrt"))      ops.push(s);
                else if (s.equals(")"))
                {
                    String op = ops.pop();
                    double v = vals.pop();
                    if      (op.equals("+"))        v = vals.pop() + v;
                    else if (op.equals("-"))        v = vals.pop() - v;
                    else if (op.equals("*"))        v = vals.pop() * v;
                    else if (op.equals("/"))        v = vals.pop() / v;
                    else if (op.equals("sqrt"))     v = Math.sqrt(v);
                    vals.push(v);
                }
                else vals.push(Double.parseDouble(s));
            }
            System.out.println(vals.pop());
        }
    }
}
