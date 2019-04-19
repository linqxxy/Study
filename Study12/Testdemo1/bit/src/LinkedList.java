package Testdemo1.bit.src;

public class LinkedList {
    private int size;
    private Node head;
    public LinkedList(){
        this.size=0;
        this.head=null;
    }
    private class Node{
        Object data;
        Node next;
        public Node(Object data){
            this.data=data;
        }
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public Object addHead(Object data){
        Node newHead=new Node(data);
        if(isEmpty()){
            head=newHead;
            size++;
        }else {
            newHead.next=head;
            head=newHead;
            size++;
        }
        return head;
    }

    public Object deleteHead(){
        if (isEmpty()){
            throw new UnsupportedOperationException("链表为空");
        }
        head=head.next;
        size--;
        return head;
    }
    public Node search(Object key){
        if(isEmpty()){
            return null;
        }
        Node current=head;
        while (current.next!=null) {
            if (current.data.equals(key)) {
                return current;
            }
            current=current.next;
        }
        return null;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("[]");
        }
        if(size==1){
            System.out.println("["+head.data+"]");
        }else {
            Node current = head;
            for (current = head; current != null; current = current.next) {
                if (current == head) {
                    System.out.print("[" + current.data + "->");
                } else if (current.next == null) {
                    System.out.print(current.data + "]");
                } else {
                    System.out.print(current.data + "->");
                }
            }
            System.out.println();
        }
    }
}
