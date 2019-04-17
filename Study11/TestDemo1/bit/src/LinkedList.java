package TestDemo1.bit.src;

public class LinkedList {
    private int size;//定义链表的Size
    private Node head;//链表的表头
    public LinkedList(){
        this.size=0;//Size从0开始
        this.head=null;
    }
    private class Node{//定义节点内部类
        private Node next;//存放下一个节点地址
        private Object data;//存放节点数据
        public Node(Object data){
            this.data=data;
        }
    }
    public Object addHead(Object data){//从表头插入
        Node newHead=new Node(data);//新建一个节点
        if (isEmpty()){//判断是否为空，如果为空直接将该节点作为表头
            head=newHead;
        }else {
            newHead.next=head;
            head=newHead;//不为空将该节点作为表头，next指向原来的表头

        }
        this.size++;//链表长度+1
        return data;//返回新表头的数据。
    }
    public boolean isEmpty(){//判空
        return (size==0);//Size为0的时候链表为空。
    }
    public Object deleteHead(){//删除表头
        Object object=head.data;//保存原表头的数据
        if (isEmpty()){//如果链表为空，返回false
            return false;
        }else{
            head=head.next;//把表头指向的节点作为新的表头
            size--;//链表长度减一
        }
        return object;//返回原表头的数据
    }
    public Node find(Object value){
        Node current=head;
        int tempSize=this.size;//遍历整个链表
        if(isEmpty()){//如果链表为空返回null
            return null;
        }
        while (tempSize>0) {
            if (value.equals(current.data)) {//如果找到了，返回节点地址
                return current;
            } else {
                current = current.next;//指向下一个节点，继续查找；
                tempSize--;//如果整个链表都找完了还没找到，返回null
            }
        }
        return null;
    }
    public Object delete(Object value){//删除节点
        if (isEmpty()){//判空
            return false;
        }
        Node current=head;
        Node previous=head;
        Node oldData=new Node(value);//保留节点数据
        while (!current.data.equals(value)){//先找到该节点，如果没找到返回false；
            if (current.next==null){
                return false;
            }else {
                previous=current;
                current=current.next;
            }
            if(current==head){//如果是头结点，直接删除头结点
                deleteHead();
            }else {
                previous.next=current.next;//不然删除该节点
                size--;//Size-1；
            }
        }
        return oldData;
    }
    public void display(){//打印链表
        if (isEmpty()){
            System.out.println("[]");
        }
        if(size==1){
            System.out.println("["+head.data+"]");
        }else {
            Node node=head;
            int tempSize=size;
            while (tempSize>0){
                if(node.equals(head)){
                    System.out.print("["+node.data+"->");
                }else if(node.next==null){
                    System.out.print(node.data+"]");
                }else {
                    System.out.print(node.data+"->");
                }
                node=node.next;
                tempSize--;
            }
        }
        System.out.println();
    }
}
