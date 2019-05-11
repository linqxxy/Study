package top.linqxxy.wwh5;

public class MysingleList<T> {
    private Node head;
    private int size;
    //创建空链表
    public MysingleList() {
        this.head=null;
        this.size=0;
    }

    //以指定数据元素来创建链表，该链表只有一个元素
    public MysingleList(T element) {
        this.head.data=new Node(element);
        this.head.next=null;
    }
    private class Node<T>{
        Node next;
        T data;
        public  Node(T data){
            this.data=data;
        }
    }

    /**
     * 返回链表长度
     *
     * @return
     */
    public int length() {
        Node cur=this.head;
        int count=0;
        while (cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }

    /**
     * 获取链表中指定索引的元素
     *
     * @param index
     * @return
     */
    public T get(int index) {
        if(index<0||index>length()){
            throw new UnsupportedOperationException("index不合法");
        }
        Node cur=this.head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return (T) cur.data;
    }

    private Node getNodeByIndex(int index) {
        if(index<0||index>length()){
            throw new IllegalArgumentException("index不合法");
        }
        Node cur=this.head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        return cur;
    }

    /**
     * 查找链表中指定元素的索引
     *
     * @param element
     * @return
     */
    public int locate(T element) {
        int index=0;
        Node cur=this.head;
        while (cur!=null){
            if(cur.data==element){
                return index;
            }
            cur=cur.next;
            index++;
        }
        if(head==null){
            return -1;
        }
        return -1;
    }

    /**
     * 向线性表指定位置插入一个元素
     *
     * @param element
     * @param index
     */
    public void insert(T element, int index) {
        if (index==0){
            addAtHeader(element);
        }else {
            Node cur=getNodeByIndex(index);
            Node node=new Node(element);
            node.next=cur.next;
            cur.next=node;
            this.size++;
        }
    }

    /**
     * 采用尾插入法为链表添加新节点
     *
     * @param element
     */
    public void add(T element) {
        this.insert(element,length()-1);
    }

    /**
     * 采用头插入法为链表添加新节点
     *
     * @param element
     */
    public void addAtHeader(T element) {
        Node node=new Node(element);
        if(empty()){
            head=node;
        }else {
            node.next=head;
            head=node;
        }
    }

    /**
     * 删除链表中指定索引处的元素
     *
     * @param index
     * @return
     */
    public T delete(int index) {
        if(length()==0){
             throw new UnsupportedOperationException("链表为空");
        }
        Node cur=getNodeByIndex(index-1);
        Node curNext=cur.next;
        T oldData=(T) curNext.data;
        cur.next=curNext.next;
        return oldData;
    }

    /**
     * 删除链表中最后一个元素
     *
     * @return
     */
    public T remove() {
        Node cur=head;
        while (cur.next.next!=null){
            cur=cur.next;
        }
        T oldData=(T) cur.next.data;
        cur.next=null;
        return oldData;
    }

    /**
     * 判断链表是否为空
     *
     * @return
     */
    public boolean empty() {
        return length()==0;
    }

    /**
     * 清空链表
     */
    public void clear() {
        this.size=0;
        this.head=null;
    }
    public void print(){
        if(empty()){
            System.out.println("[]");
        }else {
            Node cur=head;
            while (cur!=null){
                System.out.print(cur.data+"  ");
                cur=cur.next;
            }
        }

    }

    @Override
    public String toString() {
        int iMax = length() - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (Node cur = head; ; cur = cur.next) {
            if (cur!=null){
                b.append(cur.data);
            }
            if (cur == null)
                return b.append(']').toString();
            b.append(", ");
        }
    }
}
