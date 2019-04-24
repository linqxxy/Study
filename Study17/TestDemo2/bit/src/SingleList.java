package TestDemo1.bit.src;

public class SingleList {
    private Node head;
    private class Node{
        private Node next;
        private Object data;
        public  Node(Object data){
            this.data=data;
        }
    }
    public SingleList(){
        this.head=null;
    }
    public Node getHead(){
        return this.head;
    }
    //头插法插入数据
    public void addFirst(Object data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }else{
            node.next=head;
            head=node;
        }
    }
    //尾插法插入数据
    public void addLast(Object data){
        if(head==null){
            addFirst(data);
        }else {
            Node node=new Node(data);
            Node cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }
    //在指定位置插入数据
    private Node getIndex(int index){
        checkIndex(index);
        Node cur=head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        return cur;
    }
    private void checkIndex(int index){
        if(index<0||index>getLength()){
           throw new UnsupportedOperationException("index不合法");
        }
    }
    public void addIndex(int index,Object data){
        Node cur=getIndex(index);
        if(cur==head){
            addFirst(data);
        }else {
            Node node = new Node(data);
            node.next = cur.next;
            cur.next = node;
        }
    }
    //查找链表中是否存在该值
    public boolean contains(Object key){
        Node cur=this.head;
        while (cur!=null){
            if(cur.data.equals(key)){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //删除第一个数据为key的节点
    public Object removeKey(Object key){
        if(head==null){
            throw new UnsupportedOperationException("链表为空");
        }
        Node cur=head.next;
        Node prev=head;
        Object oldData=key;
        while (cur!=null){
            if(cur.data.equals(key)){
                prev.next=cur.next;
                return oldData;
            }
            cur=cur.next;
            prev=prev.next;
        }
        return null;
    }
    //删除所有数据为key的节点
    public void removeAllKey(Object key){
        if(head==null){
            throw new UnsupportedOperationException("链表为空");
        }
        Node cur=head.next;
        Node prev=head;
        while (cur!=null){
            if(cur.data.equals(key)){
                prev.next=cur.next;
                cur=cur.next;
            }else {
                prev=cur;
                cur=cur.next;
            }
        }
        if(head.data.equals(key)){
            head=head.next;
        }
    }
    //获取长度
    public int getLength(){
        int length=0;
        Node cur=this.head;
        while (cur!=null){
            cur=cur.next;
            length++;
        }
        return length;
    }
    //打印链表
    public void display(){
        if(head==null){
            System.out.println("[]");
        }else {
            Node cur=head;
            while(cur!=null){
                System.out.print(cur.data);
                cur=cur.next;
            }
            System.out.println();
        }
    }
    //给定头结点打印链表
    public void show(Node reverseHead){
        if(reverseHead==null){
            System.out.println("[]");
        }
        {
            Node cur=reverseHead;
            while(cur!=null){
                System.out.print(cur.data);
                cur=cur.next;
            }
            System.out.println();
        }
    }
    //反转链表
    public Node reverse(){
        Node prev=null;
        Node cur=this.head;
        Node reverseHead=null;
        while (cur!=null){
            Node curNext=cur.next;
            if(curNext==null){
                reverseHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return reverseHead;
    }
    //找到中间结点
    public Object findMid(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
    //找到倒数第k的节点
    public Object findK(int k){
        if(k<=0||head==null||k>getLength()){
            return null;
        }
        Node fast=this.head;
        Node slow=this.head;
        for(int i=0;i<k-1;i++){
            if(fast==null){
                throw new UnsupportedOperationException("k不合法");
            }
            fast=fast.next;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;
    }
    //有序链表中删除所有重复节点
    public Node deleteDupiication(Node head){
        if(head==null||head.next==null){
            return head;
        }
        if(head.data.equals(head.next.data)){
            Node cur=head;
            while (cur!=null&&cur.data==head.data){
                cur=cur.next;
            }
            return deleteDupiication(cur);
        }else head.next=deleteDupiication(head.next);
        return head;
    }
}
