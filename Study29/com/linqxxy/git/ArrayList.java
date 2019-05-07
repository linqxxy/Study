package com.linqxxy.git;

public class ArrayList <T> {
    private Node head;
    private int size;
    public ArrayList(){
        this.head=null;
        this.size=0;
    }
    private class Node{
        T data;
        Node next;
        public Node(T data){
            this.data=data;
            this.next=null;
        }
    }
    private boolean isEmpty(){
        return this.head==null;
    }
    public void addFirst(T data){
        Node node=new Node (data);
        if(isEmpty()){
            this.head=node;
        }else {
            node.next = head;
            this.head=node;
        }
    }
    public void addLast(T data){
        if(isEmpty()){
            addFirst(data);
        }else {
            Node node =new Node(data);
            Node cur=this.head;
            while (cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }
    private Node searchIndex(int index){
        checkIndex(index);
        Node cur=this.head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        return cur;
    }
    private void checkIndex(int index){
        if(index<0||index>getSize()){
            throw new UnsupportedOperationException("index不合法");
        }
    }
    public void addIndex(T data,int index){
        if(isEmpty()){
            addFirst(data);
        }else {
            Node cur=searchIndex(index);
            Node node=new Node(data);
            node.next=cur.next;
            cur.next=node;
        }
    }
    public int getSize(){
        int size=0;
        Node cur=head;
        while (cur!=null){
            cur=cur.next;
            size++;
        }
        this.size=size;
        return size;
    }
    public T delete(T key){
        if (isEmpty()){
            throw new UnsupportedOperationException("链表为空");
        }
        if(head.data.equals(key)){
            T data=head.data;
            head=head.next;
            return data;
        }else {
            Node cur=this.head;
            Node pre=this.head;
            while (cur.next!=null){
                cur=cur.next;
                if(cur.data.equals(key)){
                    T data=cur.data;
                    pre.next=cur.next;
                    return data;
                }
                pre=cur;
            }
        }
        return null;
    }
    public void deleteAllKey(T key){
        if (isEmpty()){
            throw new UnsupportedOperationException("链表为空");
        }
        while(head.data.equals(key)){
            head=head.next;
        }
            Node cur=this.head;
            Node pre=this.head;
            while (cur.next!=null){
                cur=cur.next;
                if(cur.data.equals(key)){
                    pre.next=cur.next;
                }
                pre=cur;
            }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("[]");
        }else {
            Node cur=head;
            while (cur!=null){
                System.out.print(cur.data+"  ");
                cur=cur.next;
            }
            System.out.println();
        }
    }
}
