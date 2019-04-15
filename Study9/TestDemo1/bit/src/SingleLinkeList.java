package TestDemo1.bit.src;

import javax.xml.soap.Node;

public class SingleLinkeList {
    private int size;
    private Node head;
    public SingleLinkeList(){
        size = 0;
        head =null;
    }
    private class Node{
        private Object data;
        private Node next;
        public Node(Object data){
            this.data=data;
        }
    }
    public Object addHead(Object obj){
        Node newHead=new Node(obj);
        if(size==0){
            head=newHead;
        }else{
            newHead.next=head;
            head=newHead;
        }
        size++;
        return obj;
    }
    public Object deleteHead(){
        Object obj=head.data;
        head=head.next;
        size--;
        return obj;
    }
    public Node find(Object obj){
        Node current=head;
        int tempSize=size;
        while (tempSize>0){
            if(obj.equals(current.data)){
                return current;
            }else{
                current=current.next;
            }
            tempSize--;
        }
        return null;
    }
    public boolean delete(Object value){
        if(size==0){
            return false;
        }
        Node current=head;
        Node previous=head;
        while (current.data!=value){
            if(current.next==null){
                return false;
            }else{
                previous=current;
                current=current.next;
            }
        }
        if (current==head){
            head=current.next;
            size--;
        }else {
            previous.next=current.next;
            size--;
        }
        return true;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public void display(){
        if(size>0){
            Node node=head;
            int tempSize=size;
            if(tempSize==1){
                System.out.println("["+node.data+"]");
                return ;
            }
            while (tempSize>0){
                if(node.equals(head)){
                    System.out.print("["+node.data+"->");
                }else if (node.next==null){
                    System.out.print(node.data+"]");
                }else {
                    System.out.print(node.data+"->");
                }
                node=node.next;
                tempSize--;
            }
            System.out.println();
        }else {
            System.out.println("[]");
        }
    }
}
