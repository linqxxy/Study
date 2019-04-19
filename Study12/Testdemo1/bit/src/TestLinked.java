package Testdemo1.bit.src;

public class TestLinked {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.addHead("A");
        linkedList.addHead("B");
        linkedList.addHead("C");
        linkedList.addHead("D");
        linkedList.deleteHead();
        System.out.println(linkedList.search("D"));
        System.out.println(linkedList.search("C"));
        linkedList.display();
    }
}
