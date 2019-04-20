package TestDemo2.bit.src;

public class TestHeadSingleList {
    public static void main(String[] args) {
        HeadSingleListImpl headSingleList=new HeadSingleListImpl();
        headSingleList.addFirst(10);
        headSingleList.addFirst(20);
        headSingleList.addFirst(30);
        headSingleList.addLast(40);
        headSingleList.addLast(30);
        headSingleList.addLast(20);
        headSingleList.addindex(0,20);
        headSingleList.addindex(3,11);
        headSingleList.display();
        headSingleList.removeAllKey(20);
        headSingleList.display();
        System.out.println(headSingleList.contains(20));
        headSingleList.clear();
        headSingleList.display();

    }
}
