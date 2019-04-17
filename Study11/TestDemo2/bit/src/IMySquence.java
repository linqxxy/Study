package TestDemo2.bit.src;

public interface IMySquence {//定义顺序表接口
    boolean add(int pos,Object obj);//在指定位置插入元素
    Object remove(Object key);//删除指定元素
    int search(Object key);//查找元素，找到了返回下表
    boolean contain(Object key);//查找元素是否存在
    Object getPos(int pos);//获取指定下表的元素
    int size();//返回顺序表的大小
    void display();//打印顺序表
    void clear();//清空顺序表
}
