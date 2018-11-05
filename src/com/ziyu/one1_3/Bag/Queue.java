package com.ziyu.one1_3.Bag;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

//队列的链表实现
public class Queue<Item> implements Iterable<Item>{

    private int N;
    private Node first;//指向最早添加的结点的链接
    private Node last;//指向最近添加的结点的链接

    public class Node{
        public Item item;
        public Node next;
    }

    public void enqueue(Item item){
        //向表尾添加元素
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else {
            oldlast.next = last;
        }
        N++;
    }

    public Item dequeue(){
        //从表头删除元素
        Item item = first.item;
        first = first.next;
        if(isEmpty())   last = null;
        N--;
        return item;
    }

    public boolean isEmpty(){
        return first == null;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public String toString(){
        for(Node x = first; x != null; x = x.next){
            System.out.print(x.item + "\t");
        }
        return null;
    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }

    public static void main(String[] args){

        Queue<Integer> list = new Queue<Integer>();
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(4);
        list.enqueue(5);
        System.out.println(list.toString());
        System.out.println(list.first.next);

    }

}
