package TestDemo1.bit.src;

public class TestSingleLinkedList {
    public static void main(String[] args) {
        SingleLinkeList singleLinkeList=new SingleLinkeList();
        singleLinkeList.addHead("A");
        singleLinkeList.addHead("B");
        singleLinkeList.addHead("C");
        singleLinkeList.addHead("D");
        singleLinkeList.display();
        singleLinkeList.delete("C");
        singleLinkeList.display();
        System.out.println(singleLinkeList.find("B"));
    }
}
