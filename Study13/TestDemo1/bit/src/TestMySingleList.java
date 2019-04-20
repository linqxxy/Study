package TestDemo1.bit.src;

public class TestMySingleList {
    public static void main(String[] args) {
        MySingleList mySingleList=new MySingleList();
        mySingleList.addFirst(3);
        mySingleList.addFirst(2);
        mySingleList.addLast(4);
        mySingleList.addLast(5);
        mySingleList.addLast(5);
        mySingleList.addIndex(0,1);
        System.out.println(mySingleList.getLength());
        mySingleList.display();
        mySingleList.removeAllKey(5);
        mySingleList.display();
        mySingleList.remove(3);
        mySingleList.reverse();
        mySingleList.display();
        System.out.println(mySingleList.contains(1));
        System.out.println(mySingleList.contains(6));
        mySingleList.clear();
        System.out.println(mySingleList.getLength());
    }
}
