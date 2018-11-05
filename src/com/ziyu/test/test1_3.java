package com.ziyu.test;

import com.ziyu.one1_3.Bag.Queue;
import com.ziyu.one1_3.Bag.Stack;
import edu.princeton.cs.introcs.StdIn;

public class test1_3 {

    public static void main(String[] args) {

/*        Queue<String> queue = new Queue<>();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.toString();
        test6(queue);
        queue.toString();*/

        Queue<String> queue = new Queue<>();
        queue.enqueue("1");
        queue.enqueue("2");

    }

    public void t4(){

        Stack<String> stack = new Stack<>();
        while (!StdIn.isEmpty()) {
            String ss = StdIn.readString();
            for(int i = 0; i < ss.length(); i++){
                String s = ss.substring(i, i+1);
                stack.push(s);
            }
        }
        try {
            while(!stack.isEmpty()){
                String s = stack.pop();
                if(s.equals(")")){
                    if(!stack.pop().equals("(")){
                        System.out.println("false");
                        return;
                    }
                }
            }
        }catch (Exception e){
            System.out.println("false");
        }

    }

    public static Queue test6(Queue q){

        Stack<String> stack = new Stack<>();
        while(!q.isEmpty()){
            stack.push(q.dequeue().toString());
        }
        while (!stack.isEmpty()){
            q.enqueue(stack.pop());
        }
        return q;

    }

    public static void test9(String ss){

        for(int i = 0; i < ss.length(); i++){
            String s = ss.substring(i, i+1);
        }

    }

    public static void test19(Queue.Node n){
        //删除链表的尾节点
        Queue.Node old = n;
        while(n.next != null){
            old = n;
            n = n.next;
        }
        old.next = null;
        n = old;
    }

}
