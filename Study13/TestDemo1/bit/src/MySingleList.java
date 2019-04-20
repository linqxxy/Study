package TestDemo1.bit.src;

public class MySingleList implements  IMySingleList.ILinked{
    private Node head;
    private int size;
    public MySingleList(){
        this.head=null;
        this.size=0;
    }
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public boolean isEmpty(){
        return this.head==null;
    }
    @Override
    public void addFirst(int data) {
        Node newHead=new Node(data);
        if(isEmpty()){
            head=newHead;
        }else{
            newHead.next=head;
            head=newHead;
        }
        size++;
    }

    @Override
    public void addLast(int data) {
        Node node=new Node(data);
        Node cur=head;
        if(isEmpty()){
            head=node;
        }else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
            size++;
        }
    }
    //找到Index-1的位置，返回该位置节点的引用
    private Node searchIndex(int index){
        Node cur =head;
        while (index-1>0){
            cur=cur.next;
            index--;
        }
        return cur;
    }

    @Override
    public boolean addIndex(int index, int data) {
        if(index<0||index>size) {
            throw  new UnsupportedOperationException("Index不合法");
        }
        if (index==0){
            addFirst(data);
        }else {
            Node node = new Node(data);
            Node cur = searchIndex(index);
            node.next = cur.next;
            node.next = cur;
            this.size++;
        }
        return true;
    }

    @Override
    public boolean contains(int key) {
        if (isEmpty()){ throw new UnsupportedOperationException("链表为空"); }
        Node cur=head;
        while (cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //查找关键字key的前驱
    private Node searchPre(int key){
        Node pre=this.head;
        if(pre.data==key){
            return this.head;
        }
        while (pre.next.data!=key){
            pre=pre.next;
            if (pre.next==null){
                return null;
            }
        }
       return pre;
    }

    @Override
    public int remove(int key) {
        if (isEmpty()){ throw new UnsupportedOperationException("链表为空"); }
        Node pre=searchPre(key);
        int oldData;
        if (pre==null){ throw new UnsupportedOperationException("不存在该值"); }
        if(pre==head&&pre.data==key){
            oldData=this.head.data;
            this.head=head.next;
            this.size--;
            return oldData;
        }else {
            Node del = pre.next;
            oldData = del.data;
            pre.next = del.next;
            this.size--;
        }
        return oldData;
    }

    @Override
    public void removeAllKey(int key) {
        if (isEmpty()){ throw new  UnsupportedOperationException("链表为空"); }
        Node cur=head;
        Node prev=new Node(-1);
        prev.next=head;
        while (cur!=null){
            if (cur.data==key){
                remove(key);
                cur=cur.next;
            }else {
                cur=cur.next;
                prev=prev.next;
            }
        }
    }

    @Override
    public int getLength() {
        return this.size;
    }

    @Override
    public void display() {
        Node cur = head;
        if (isEmpty()) {
            System.out.println("[]");
        } else if (cur.next == null) {
            System.out.println("[" + cur.data + "]");
        } else {
            for (cur = head; cur != null; cur = cur.next) {
                if (cur == head) {
                    System.out.print("[" + cur.data + "->");
                }else if(cur.next==null){
                    System.out.print(cur.data+"]");
                }else {
                    System.out.print(cur.data+"->");
                }
            }
            System.out.println();
        }
    }
    @Override
    public void clear() {
        while (head!=null){
            Node cur=this.head.next;
            this.head=null;
            this.head=cur;
            this.size--;
        }
    }
    public void reverse(){
        Node pre=null;
        Node cur=this.head;
        Node curNext=cur;
        while (cur!=null){
            curNext=cur.next;
            cur.next=pre;
            pre=cur;
            if(curNext==null){
                head=cur;
            }
            cur=curNext;
        }
    }
}
