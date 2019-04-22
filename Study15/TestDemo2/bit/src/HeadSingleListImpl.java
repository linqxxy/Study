package TestDemo2.bit.src;

public class HeadSingleListImpl implements ICLinked {
    private Node head;
    private class Node{
        private int data;
        private Node next;
        //头结点
        public Node(){ }
        //数据结点
        public Node (int data){ this.data=data; }
    }
    public HeadSingleListImpl(){
        this.head=new Node();
        this.head.next=this.head;
    }
    private void checkIndex(int index){
        if(index<0||index>getLength()){
            throw new UnsupportedOperationException("index不合法");
        }
    }
    private Node searchPre(int key){
        Node pre=this.head;
        while (pre.next!=head){
            if(pre.next.data==key){
                return pre;
            }
            pre=pre.next;
        }
        return null;
    }
    //找到index-1的位置
    private Node SearchIndex(int index){
        checkIndex(index);
        Node cur =this.head;
        for (int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur;
    }
    @Override
    public void addFirst(int data) {
        Node node=new Node(data);
        node.next = head.next;
        head.next = node;
    }

    @Override
    public void addLast(int data) {
        Node cur=this.head;
        Node node=new Node(data);
        while (cur.next!=head){
            cur=cur.next;
        }
        cur.next=node;
        node.next=this.head;
    }

    @Override
    public boolean addindex(int index, int data) {
        Node pre=SearchIndex(index);
        Node node=new Node(data);
        node.next=pre.next;
        pre.next=node;
        return true;
    }
    @Override
    public boolean contains(int key) {
        Node cur=this.head.next;
        while (cur!=this.head){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    @Override
    public int remove(int key) {
        Node pre=searchPre(key);
        if (pre==null){
            throw new UnsupportedOperationException("没有key这个关键字");
        }
        int oldData=pre.next.data;
        pre.next=pre.next.next;
        return oldData;
    }

    @Override
    public void removeAllKey(int key) {
        Node cur=head.next;
        Node pre=head;
        while (cur!=this.head){
            if(cur.data==key){
                pre.next=cur.next;
                cur=cur.next;
            }else {
                pre=cur;
                cur=cur.next;
            }
        }
    }

    @Override
    public int getLength() {
        int count = 0;
        Node cur=this.head.next;
        while (cur!=this.head){
            count++;
            cur=cur.next;
        }
        return count;
    }

    @Override
    public void display() {
        if(this.head==null){
            System.out.println("[]");
        }else {
            Node cur = this.head.next;
            while (cur != this.head) {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
        }
        System.out.println();
    }
    //防止内存泄漏
    @Override
    public void clear() {
        while (head.next!=head){
            Node cur=this.head.next;
                head.next=cur.next;
                cur=cur.next;
        }
        //头结点置为空
        this.head=null;
    }
}
