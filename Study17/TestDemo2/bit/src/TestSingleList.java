package TestDemo1.bit.src;

public class TestSingleList {
    public static void main(String[] args) {
        SingleList singleList=new SingleList();
        singleList.addFirst(2);
        singleList.addFirst(1);
        singleList.addLast(4);
        singleList.addLast(4);
        singleList.addIndex(0,0);
        singleList.addIndex(3,2);
        singleList.addIndex(6,6);
        //打印原链表
        singleList.display();
        System.out.println(singleList.findK(4));
        //在一个有序链表中去除重复节点
        singleList.show(singleList.deleteDupiication(singleList.getHead()));
        //删除数据为B的节点
        singleList.removeKey("B");
        //删除所有数据为1的节点
        singleList.removeAllKey(1);
        //再次打印
        singleList.display();
        //打印找到的中间节点
        System.out.println(singleList.findMid());
        //打印逆转后的链表
        singleList.show(singleList.reverse());
    }
}
