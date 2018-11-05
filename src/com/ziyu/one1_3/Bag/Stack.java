package com.ziyu.one1_3.Bag;

import java.util.Iterator;

//栈的链表实现
public class Stack<Item> implements Iterable<Item> {

    private Node first;//栈顶（最近添加的元素）
    private int N;//元素数量

    @Override
    public Iterator<Item> iterator() {
        return (Iterator<Item>) new ListIterator();
    }

    private class ListIterator implements Iterable<Item>{

        private Node current = first;
        public boolean hasNext(){
            return current != null;
        }
        public void remove(){}
        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public Iterator<Item> iterator() {
            return null;
        }
    }

    private class Node{
        //定义结点的嵌套类
        Item item;
        Node next;

    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    public void push(Item item){
        //向栈顶添加元素
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop(){
        //从栈顶删除元素
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Item peek(){
        //返回最近添加的元素
        return first.item;
    }

    public static void main(String[] args)  {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.push(5);
        Iterator itemIterator = (Iterator) stack.iterator();
        if(itemIterator.hasNext()){
            System.out.println(itemIterator.next());
        }

    }

}
