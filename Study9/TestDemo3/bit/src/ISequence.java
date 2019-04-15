package TestDemo3.bit.src;

public interface ISequence {
    boolean add(int pos,Object obj);
    int search(Object key);
    boolean contain(Object key);
    Object getPos(int pos);
    Object remove(Object key);
    int size();
    void disPlay();
    void clear();
}
