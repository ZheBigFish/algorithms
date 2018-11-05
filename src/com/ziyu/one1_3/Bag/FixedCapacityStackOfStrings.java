package com.ziyu.one1_3.Bag;

//String类型的栈
public class FixedCapacityStackOfStrings {

    private String[] a;
    private int N;

    public static void main(String[] args) {

/*        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty())
                StdOut.println(s.pop() + " ");
        }
        System.out.println("(" + s.size() + "left on stack");*/
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        String a = s.pop();
        s.push("5");
        System.out.println(s);

    }

    public FixedCapacityStackOfStrings(int cap){
        a = new String[cap];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(String item){
        a[N++] = item;
    }

    public String pop(){
        N--;
        a[N] = null;    //避免对象游离
        return a[N-1];
    }

    //数组是否已满
    public boolean isFull(){
        return N >= 100;
    }

}
