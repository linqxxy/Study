package TestDemo.bit.src;

public class TestDemo {
    //输入一个链表，输出该链表中倒数第k个结点
//    public class Solution {

//    }public ListNode FindKthToTail(ListNode head,int k) {
//        if(head==null||k<=0){
//            return null;
//        }
//        ListNode cur=head;
//        ListNode last=head;
//        int count=0;
//        while(cur!=null){
//            cur=cur.next;
//            count++;
//        }
//        if(k>count){
//            return null;
//        }
//        for(int i=0;i<count-k;i++){
//            last=last.next;
//        }
//        return last;
//    }
    // 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前 。
//public ListNode partition(ListNode pHead, int x) {
//    ListNode l1=new ListNode(-1);
//    ListNode l2=new ListNode(-1);
//    ListNode head1=l1;
//    ListNode head2=l2;
//    ListNode cur=pHead;
//    while(cur!=null){
//        if(cur.val<x){
//            head1.next=new ListNode(cur.val);
//            head1=head1.next;
//        }else{
//            head2.next=new ListNode(cur.val);
//            head2=head2.next;
//        }
//        cur=cur.next;
//    }
//    head1.next=l2.next;
//    return l1.next;
//}
//public class Solution {
    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头
    //指针
//    public ListNode deleteDuplication(ListNode pHead)
//    {
//        if(pHead==null||pHead.next==null)
//        {
//            return pHead;
//        }
//        if(pHead.val==pHead.next.val)
//        {
//            ListNode cur=pHead;
//            while(cur!=null&&cur.val==pHead.val)
//            {
//                cur=cur.next;
//            }
//            return deleteDuplication(cur);
//        }else
//        {
//            pHead.next=deleteDuplication(pHead.next);
//        }
//        return pHead;
//    }
//}
    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
    //如果有两个中间结点，则返回第二个中间结点。
//class Solution {
//    public ListNode middleNode(ListNode head) {
//        if(head==null||head.next==null){
//            return head;
//        }
//        ListNode cur=head;
//        ListNode pre=head;
//        while(cur.next!=null&&cur.next.next!=null){
//            cur=cur.next.next;
//            pre=pre.next;
//        }
//        if(cur.next!=null){
//            pre=pre.next;
//        }
//        return pre;
//    }
//}
}
