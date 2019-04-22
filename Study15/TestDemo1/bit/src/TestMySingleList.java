package TestDemo1.bit.src;

public class TestMySingleList {
    public static void main(String[] args) {
        MySingleList mySingleList=new MySingleList();
        mySingleList.addFirst(6);
        mySingleList.addFirst(7);
        mySingleList.addLast(3);
        mySingleList.addLast(2);
        mySingleList.addLast(5);
        mySingleList.addIndex(0,1);
        mySingleList.display(mySingleList.getHead());
        System.out.println(mySingleList.findK(8));
        mySingleList.display(mySingleList.paritition(0));
    }
}
