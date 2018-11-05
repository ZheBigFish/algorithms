package com.ziyu.one1_3.Bag;

//下压栈（能动态调整数组大小）
public abstract class FixedCapacityStack<Item> implements Iterable<Item>{

    private Item[] a;
    private int N;

    public FixedCapacityStack(int cap){
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(Item item){
        //将元素添加到栈顶
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop(){
        //从栈顶删除元素
        N--;
        a[N] = null;    //避免对象游离
        if (N > 0 && N == a.length/4)   resize(a.length / 2);
        return a[N-1];
    }

    private  void resize(int max){
        //将大小为N<=max的栈移动到一个新的大小为max的数组中
        Item[] temp = (Item[]) new Object[max];
        for(int i = 0; i < max; i++)     temp[i] = a[i];
        a = temp;
    }

/*
    public Iterable<Item> iterator(){
        return new ReverserArrayIterator();
    }

    private class ReverserArrayIterator implements Iterable<Item>{
        private int i = N;
        public boolean hasNext(){   return i > 0;    }
        public Item next()      {   return a[--i];   }
        public void remove()    {                    }
    }
*/

}
