package TestDemo1.bit.src;

public class TestDemo {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.addHead("A");
        linkedList.addHead("B");
        linkedList.addHead("C");
        linkedList.addHead("D");
        linkedList.display();
        linkedList.deleteHead();
        System.out.println(linkedList.find("B"));
        System.out.println(linkedList.find("E"));
        linkedList.display();
    }
}
