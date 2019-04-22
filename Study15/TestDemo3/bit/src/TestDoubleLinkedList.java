package TestDemo3.bit.src;

public class TestDoubleLinkedList {
    public static void main(String[] args) throws InterruptedException {
        MyDoubleLinkedListImpl myDoubleLinkedList=new MyDoubleLinkedListImpl();
        myDoubleLinkedList.addFirst(6);
        myDoubleLinkedList.addFirst(5);
        myDoubleLinkedList.addFirst(4);
        myDoubleLinkedList.addFirst(4);
        myDoubleLinkedList.addLast(4);
        myDoubleLinkedList.addLast(8);
        myDoubleLinkedList.addindex(0,2);
        myDoubleLinkedList.addindex(1,2);
        myDoubleLinkedList.addindex(8,9);
        System.out.println( myDoubleLinkedList.contains(9));
        myDoubleLinkedList.removeAllKey(4);
        myDoubleLinkedList.clear();
        Thread.sleep(1000);
        myDoubleLinkedList.display();
    }

}
