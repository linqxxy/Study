package TestDemo3.bit.src;

public class MyDoubleLinkedListImpl implements IDoubleLinked {
    private Node head;
    private Node last;
    class Node{
        private int data;
        private Node prev;//前驱
        private Node next;//后继
        public Node(int data){
            this.data=data;
        }
    }
    public MyDoubleLinkedListImpl(){
        this.head=null;
        this.last=null;
    }

    @Override
    public void addFirst(int data) {
        Node node=new Node(data);
        if(head==null){
            this.head=node;
            this.last=node;
        }else {
            node.next=this.head;
            this.head.prev=node;
            head=node;
        }
    }

    @Override
    public void addLast(int data) {
        Node node=new Node(data);
        if(head==null){
            this.head=node;
            this.last=node;
        }else {
            this.last.next=node;
            node.prev=this.last;
            this.last=node;
        }

    }
    private void checkIndex(int index){
        if(index<0||index>getLength()){
            throw new UnsupportedOperationException("index不合法");
        }
    }
    private Node searchIndex(int index){
        checkIndex(index);
        int count=0;
        Node cur=this.head;
        while (count<index){
            cur=cur.next;
            count++;
        }
        return cur;
    }

    @Override
    public boolean addindex(int index, int data) {
        if (index==0){
            addFirst(data);
            return true;
        }else if(index==getLength()){
            addLast(data);
            return true;
        }else {
            Node node=new Node(data);
            Node cur=searchIndex(index);
            node.next=cur;
            node.prev=cur.prev;
            cur.prev.next=node;
            cur.next.prev=node;
        }
        return false;
    }

    @Override
    public boolean contains(int key) {
        Node cur=this.head;
        while (cur!=null){
            if(cur.data==key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public int remove(int key) {
        Node cur=this.head;
        while (cur!=null){
            if(cur.data==key) {
                int oldData=cur.data;
                if(cur==this.head){
                    head.next.prev=null;
                    head=cur.next;
                    return oldData;
                }else {
                    cur.prev.next=cur.next;
                    if(cur.next!=null) {//cur.next!=null表示删除的不是尾结点
                        cur.next.prev = cur.prev;
                    }else {
                        last=cur.prev;
                    }
                    return oldData;
                }
            }
            cur = cur.next;
        }
        return -1;
    }

    @Override
    public void removeAllKey(int key) {
        Node cur=this.head;
        while (cur!=null){
            if(cur.data==key) {
                if(cur==this.head){
                    head.next.prev=null;
                    head=cur.next;
                }else {
                    cur.prev.next=cur.next;
                    if(cur.next!=null) {//cur.next!=null表示删除的不是尾结点
                        cur.next.prev = cur.prev;
                    }else {
                        last=cur.prev;
                    }

                }
            }
            cur = cur.next;
        }
    }

    @Override
    public int getLength() {
        Node cur=this.head;
        int count=0;
        while (cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }

    @Override
    public void display() {
        Node cur = head;
        if (head==null) {
            System.out.println("[]");
            return;
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
     while (this.head.next!=null){
         Node cur=this.head.next;
         this.head.next=cur.next;
         cur.prev=null;
     }
     this.head=null;
     this.last=null;
    }
}
