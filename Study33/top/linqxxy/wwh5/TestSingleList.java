package top.linqxxy.wwh5;
public class TestSingleList {
    public static void main(String[] args) {
        MysingleList<Integer> mysingleList=new MysingleList<>();
        mysingleList.addAtHeader(1);
        mysingleList.add(2);
        mysingleList.insert(0,1);
        mysingleList.remove();
        mysingleList.insert(1,0);
        System.out.println(mysingleList.locate(2));
        mysingleList.print();
        System.out.println(mysingleList.toString());
    }
}
