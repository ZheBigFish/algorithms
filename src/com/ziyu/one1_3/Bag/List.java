package com.ziyu.one1_3.Bag;

//链表实现
class List<Item> {

    private Node first;
    private Node end;
    private int n;

    private class Node{
        public Item item;
        public Node next;
        public Node last;
    }

    //添加一个结点
    private void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = null;
        if(isEmpty())   end = first;
        else            oldfirst.next = first;first.last = oldfirst;
        n++;
    }

    //删除首结点
    private void delFirst(){
        end = end.next;
        n--;
    }

    //删除尾结点
    private void delLast(){
        //遍历链表
        for (Node first = this.end; first != null; first = first.next){
            if(first.next.next == null){
                first.next = null;
                n--;
            }
        }
    }

    //链表长度
    private int size(){
        return n;
    }

    private boolean isEmpty(){
        return n <= 0;
    }

    //删除指定位置结点
    private void delete(int i){
        if (this.n > i){
            int j = 1;
            for (Node first = this.end; first != null; first = first.next){
                if(j+1 == i){
                    first.next = first.next.next;
                }
                j++;
            }
        }else if(this.n == i){
            delLast();
        }else{
            throw new RuntimeException("unfind!");
        }
    }

    public Object find(List<Item> list, String key){
        for(Node first = list.end; first != null; first = first.next){
            if(key.equals(first.item.toString())){
                return first;
            }
        }
        return false;
    }

    public Node get(String key){
        for(Node first = end; first != null; first = first.next){
            if(key.equals(first.item.toString())){
                return first;
            }
        }
        return null;
    }

    //删除该结点后的所有结点
    public void removeAfter(Node node){
        node.next = null;
    }

    //添加一个结点为后续结点
    public void insertAfter(Node first, Node second){
        Node oldNext = first.next;
        first.next = second;
        second.next = oldNext;
    }

    //传入一个key值，删除所有为key的结点
    public void remove(List<Item> list, String key){
        for(Node first = list.end; first != null; first = first.next){
            if (first.item.toString().equals(key)){
                first.last.next = first.next;
            }
        }
    }

    //获取最大值
    public Item max(){
        Item max = end.item;
        for(Node first = end; first != null; first = first.next){
            if (Integer.parseInt(first.item.toString()) > Integer.parseInt(max.toString())){
                max = first.item;
            }
        }
        return max;
    }

    //递归获取最大值
    public Item maxForDigui(Node node,Item max){
        max = Integer.parseInt(node.item.toString()) > Integer.parseInt(max.toString()) ? node.item : max;
        if(node.next != null){
            return maxForDigui(node.next, max);
        }else {
            return max;
        }
    }

    public Node reverse(Node first){
        Node rest = first;
        Node second = null;
        while (first != null){
            second = first.next;
            second.next = rest;
            first = first.next;
        }
        return null;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Node first = this.end; first != null; first = first.next){
            if(first.next == null){
                stringBuilder.append(first.item);
            }else{
                stringBuilder.append(first.item + ",");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args){

        List<Integer> list = new List<Integer>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(3);
        list.push(9);
        list.remove(list, "3");
        System.out.println(list.find(list, "3"));
        System.out.println(list.maxForDigui(list.end, list.end.item));
        System.out.println(list);

    }

}
