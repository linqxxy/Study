# 					链表习题练习2

1. ##  题目描述

   编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前

给定一个链表的头指针 ListNode* **pHead**，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变

​	        习题链接：https://www.nowcoder.com/practice/0e27e0b064de4eacac178676ef9c9d70?tpId

​			解题思路：创建两个新链表，分别保存小于给定值和大于指定值的节点。最后将两个链表连接起来就可以了。需要注意将两个链表的头结点保存下来。

```java
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        ListNode head1=new ListNode(-1);
        ListNode head2=new ListNode(-1);
        ListNode cur1=head1;
        ListNode cur2=head2;
        ListNode cur=pHead;
        while(cur!=null){
            if(cur.val<x){
                cur1.next=new ListNode(cur.val);
                cur1=cur1.next;
            }else{
                cur2.next=new ListNode(cur.val);
                cur2=cur2.next;
            }
            cur=cur.next;
        }
        cur1.next=head2.next;
        return head1.next;
    }
}
```

2. ## 题目描述

   在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5

   习题链接：https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef?tpId

   解题思路：可以考虑采用递归的方法实现，当遇到重复节点的时候，就往下走，当遇到不重复的节点，将第一个不同的节点作为头节点递归。

   ```java
   public class Solution {
       public ListNode deleteDuplication(ListNode pHead)
       {
           if(pHead==null||pHead.next==null){
               return pHead;
           }
           if(pHead.val==pHead.next.val){
               ListNode cur=pHead;
               while(cur!=null&&cur.val==pHead.val){
                   cur=cur.next;
               }
               return deleteDuplication(cur);
           }else{
               pHead.next=deleteDuplication(pHead.next);
           }
           return pHead;
       }
   }
   ```

3. ## 题目描述

   对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。

   给定一个链表的头指针**A**，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。

   测试样例：

   ```
   1->2->2->1
   返回：true
   
   ```

   解题思路：找到链表的中点，反转链表的后半段，然后分别从两端往中间走，如果遇见了，则是回文，若没相遇，或者值不相等，则不是回文。这里需要注意链表为单数还是复数，如果为复数，则前一个值的下一个节点与后一个节点相遇就是回文。

   ```java
   public class PalindromeList {
       public boolean chkPalindrome(ListNode A) {
           if(A==null){
               return false;
           }
           if(A.next==null){
               return true;
           }
           ListNode head=A;
           ListNode fast=A;
           ListNode slow=A;
           while(fast!=null&&fast.next!=null){
               fast=fast.next.next;
               slow=slow.next;
           }
           ListNode cur=slow;
           while(cur!=null){
               ListNode curNext=cur.next;
               cur.next=slow;
               slow=cur;
               cur=curNext;
           }
           while(slow!=head){
               if(slow.val!=head.val){
                   return false;
               }
               if(head.next==slow){
                   return true;
               }
               slow=slow.next;
               head=head.next;
           }
           return true;
       }
   }
   ```

4. ##  题目描述

   编写一个程序，找到两个单链表相交的起始节点。

   如下面的两个链表：

   

   在节点 c1 开始相交。

    

   示例 1：

   

   输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
   输出：Reference of the node with value = 8
   输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。


   示例 2：

   

   输入：intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
   输出：Reference of the node with value = 2
   输入解释：相交节点的值为 2 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [0,9,1,2,4]，链表 B 为 [3,2,4]。在 A 中，相交节点前有 3 个节点；在 B 中，相交节点前有 1 个节点。


   示例 3：

   

   输入：intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
   输出：null
   输入解释：从各自的表头开始算起，链表 A 为 [2,6,4]，链表 B 为 [1,5]。由于这两个链表不相交，所以 intersectVal 必须为 0，而 skipA 和 skipB 可以是任意值。
   解释：这两个链表不相交，因此返回 null。


   注意：

   如果两个链表没有交点，返回 null.
   在返回结果后，两个链表仍须保持原有的结构。
   可假定整个链表结构中没有循环。
   程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。

   来源：力扣（LeetCode）
   链接：https://leetcode-cn.com/problems/intersection-of-two-linked-lists
   著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

   解题思路：如果两个链表有交点，则其相交之后的部分为同一链表，所以相交后的长度是相同的，则只需要从相同长度的位置开始检测，如果有相同节点，则有相交。

   ```java
   public class Solution {
       public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
           if(headA==null||headB==null){
               return null;
           }
           ListNode cur1=headA;
           ListNode cur2=headB;
           int lenA=0;
           int lenB=0;
           while(cur1!=null){
               cur1=cur1.next;
               lenA++;
           }
           while(cur2!=null){
               cur2=cur2.next;
               lenB++;
           }
           cur1=headA;
           cur2=headB;
           int myLen=lenA-lenB;
           if(myLen<0){
               cur1=headB;
               cur2=headA;
               myLen=lenB-lenA;
           }
           for(int i=0;i<myLen;i++){
               cur1=cur1.next;
           }
           while(cur1!=null&&cur2!=null){
               if(cur1==cur2){
                   return cur1;
               }
               cur1=cur1.next;
               cur2=cur2.next;
           }
           return null;
       }
   }
   ```

5. ## 题目描述

   给定一个链表，判断链表中是否有环。

   为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。

   来源：力扣（LeetCode）
   链接：https://leetcode-cn.com/problems/linked-list-cycle
   著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

   解题思路：定义两个标记点，一个走两步，一个走一步，如果相遇则有环，没相遇则没环。

   ```java
   public class Solution {
       public boolean hasCycle(ListNode head) {
           ListNode fast=head;
           ListNode slow=head;
           while(fast!=null&&fast.next!=null){
               fast=fast.next.next;
               slow=slow.next;
               if(fast==slow){
                   return true;
               }
           }
           return false;
       }
   }
   ```

6. ## 题目描述

   给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。

   为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。

   说明：不允许修改给定的链表。

   来源：力扣（LeetCode）
   链接：https://leetcode-cn.com/problems/linked-list-cycle-ii
   著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

   解题思路：首先还是判断是否有环，定义fast和slow 一个走两步，一个走一步，若相遇则有环，否则没环。在相遇的地点将fast放在头结点处，和slow同时走，由于第一次fast走了slow的两倍，再让slow和fast走相同步数，此时slow相当于第一次走的fast，fast相当于slow。第二次相遇就在入环的第一个节点。

   ```java
   public class Solution {
       public ListNode detectCycle(ListNode head) {
           ListNode fast=head;
           ListNode slow=head;
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
               fast=fast.next;
               slow=slow.next;
           }
           return slow;
       }
   }
   ```

   