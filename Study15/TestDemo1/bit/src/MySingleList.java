package TestDemo1.bit.src;

public class MySingleList  {
    private Node head;
    private int size;

    public Node getHead(){
        return this.head;
    }
    public MySingleList() {
        this.head = null;
        this.size = 0;
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }


    public void addFirst(int data) {
        Node newHead = new Node(data);
        if (isEmpty()) {
            head = newHead;
        } else {
            newHead.next = head;
            head = newHead;
        }
        size++;
    }


    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = head;
        if (isEmpty()) {
            head = node;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
            size++;
        }
    }

    //找到Index-1的位置，返回该位置节点的引用
    private Node searchIndex(int index) {
        Node cur = head;
        while (index - 1 > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }


    public boolean addIndex(int index, int data) {
        if (index < 0 || index > size) {
            throw new UnsupportedOperationException("Index不合法");
        }
        if (index == 0) {
            addFirst(data);
        } else {
            Node node = new Node(data);
            Node cur = searchIndex(index);
            node.next = cur.next;
            node.next = cur;
            this.size++;
        }
        return true;
    }


    public boolean contains(int key) {
        if (isEmpty()) {
            throw new UnsupportedOperationException("链表为空");
        }
        Node cur = head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //查找关键字key的前驱
    private Node searchPre(int key) {
        Node pre = this.head;
        if (pre.data == key) {
            return this.head;
        }
        while (pre.next.data != key) {
            pre = pre.next;
            if (pre.next == null) {
                return null;
            }
        }
        return pre;
    }


    public int remove(int key) {
        if (isEmpty()) {
            throw new UnsupportedOperationException("链表为空");
        }
        Node pre = searchPre(key);
        int oldData;
        if (pre == null) {
            throw new UnsupportedOperationException("不存在该值");
        }
        if (pre == head && pre.data == key) {
            oldData = this.head.data;
            this.head = head.next;
            this.size--;
            return oldData;
        } else {
            Node del = pre.next;
            oldData = del.data;
            pre.next = del.next;
            this.size--;
        }
        return oldData;
    }


    public void removeAllKey(int key) {
        if (isEmpty()) {
            throw new UnsupportedOperationException("链表为空");
        }
        Node cur = head;
        Node prev = new Node(-1);
        prev.next = head;
        while (cur != null) {
            if (cur.data == key) {
                remove(key);
                cur = cur.next;
            } else {
                cur = cur.next;
                prev = prev.next;
            }
        }
    }


    public int getLength() {
        return this.size;
    }


    public void display(Node head) {
        Node cur = head;
        if (isEmpty()) {
            System.out.println("[]");
        } else if (cur.next == null) {
            System.out.println("[" + cur.data + "]");
        } else {
            for (cur = head; cur != null; cur = cur.next) {
                if (cur == head) {
                    System.out.print("[" + cur.data + "->");
                } else if (cur.next == null) {
                    System.out.print(cur.data + "]");
                } else {
                    System.out.print(cur.data + "->");
                }
            }
            System.out.println();
        }
    }


    public void clear() {
        while (head != null) {
            Node cur = this.head.next;
            this.head = null;
            this.head = cur;
            this.size--;
        }
    }
    public Node paritition(int x){
        Node node1=new Node(-1);
        Node node2=new Node(-1);
        Node cur1=node1;
        Node cur2=node2;
        Node cur=head;
        while(cur!=null){
            if(cur.data<x){
                cur1.next=new Node(cur.data);
                cur1=cur1.next;
            }else{
                cur2.next=new Node(cur.data);
                cur2=cur2.next;
            }
            cur=cur.next;
        }
        cur1.next=node2.next;
        return node1.next;
    }
    public int  findK(int k){
        Node fast=head;
        Node slow=head;

        if(k<=0){
            return 0;
        }
        fast=head;
        for(int i=0;i<k-1;i++){
            if(fast.next!=null) {
                fast = fast.next;
            }else {
                System.out.println("没有这个节点");
            }
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;
    }

    public void reverse() {
        Node pre = null;
        Node cur = this.head;
        Node curNext = cur;
        while (cur != null) {
            curNext = cur.next;
            cur.next = pre;
            pre = cur;
            if (curNext == null) {
                head = cur;
            }
            cur = curNext;
        }
    }
    public Node sl(int x){
        Node pre=head;
        Node cur=head;
        Node dumy=head;
        dumy.next=head;
        while(cur!=null){
            if(cur.data<x){
                pre.next=cur.next;
                cur.next=head;
                head=cur;
                cur=pre.next;
            }else {
                cur=cur.next;
                pre=pre.next;
            }
        }
        return head;
    }
    public boolean hasCycle() {
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public Node detectCycle() {
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        fast=head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
    public Node deleteDuplication()
    {
        Node cur=head.next;
        Node pre=head;
        Node dumy=new Node(-1);
        dumy.next=head;
        while(cur.next!=null){
            if(cur==head&&cur.data==pre.data){
                while(cur.data==pre.data){
                    cur=cur.next;
                    pre=pre.next;
                    dumy=dumy.next;
                }
                cur=cur.next;
                pre=pre.next;
                dumy=dumy.next;
                head=pre;
            }else if(cur.data==pre.data){
                while(cur.data==cur.data){
                    cur=cur.next;
                    pre=pre.next;
                }
                dumy.next=pre.next;
                cur=cur.next;
                pre=pre.next;
            }
            dumy=dumy.next;
            cur=cur.next;
            pre=pre.next;
        }
        return head;
    }
}