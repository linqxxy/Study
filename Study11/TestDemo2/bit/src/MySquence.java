package TestDemo2.bit.src;

import java.util.Arrays;

public class MySquence implements IMySquence {//实现顺序表接口
    private Object[]elem;
    private int usedSize;//
    private static final int DEFAULT_SIZE = 10;//默认顺序表大小
    public MySquence(){
        this.elem=new Object[DEFAULT_SIZE];
        this.usedSize=0;
    }
    public boolean isFull(){//判断顺序表是否满了
        return (usedSize==elem.length-1);
    }
    public boolean isEmpty(){//判断顺序表是否为空
        return (usedSize==0);
    }
    @Override
    public boolean add(int pos, Object obj) {
        if(pos<0||pos>usedSize){//判断指定的位置是否合法
            return false;
        }
        if(isFull()){//判断顺序表是否为满，满了扩容二倍
            this.elem=Arrays.copyOf(elem,elem.length*2);
        }
        for(int i=usedSize;i>=pos;i--){
            elem[i+1]=elem[i];//将指定位置以及后面的元素后移
        }
        elem[pos]=obj;
        usedSize++;
        return true;
    }

    @Override
    public Object remove(Object key) {
        if(isEmpty()){//判断顺序表是否为空，为空抛出异常
            throw new UnsupportedOperationException("顺序表为空");
        }
        Object object=key;//将要删除的数据保留下来
        for(int i=0;i<usedSize;i++){
            if(key.equals(elem[i])){
                for(int j=i;j<=usedSize;j++){
                    elem[j]=elem[j+1];//后面的元素前移，覆盖需要删除的元素
                }
                elem[usedSize]=null;//将最后面的元素置空
            }
        }
        usedSize--;//更新顺序表大小
        return object;
    }

    @Override
    public int search(Object key) {
        if(isEmpty()){//顺序表为空，则说明找不到
            return -1;
        }
        for(int i=0;i<usedSize;i++){
            if(key.equals(elem[i])){//找到了返回下标
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contain(Object key) {
        if(isEmpty()){//顺序表为空，则说明不包含元素。
            return false;
        }
        for(int i=0;i<usedSize;i++){
            if(key.equals(elem[i])){//如果包含，返回true
                return true;
            }
        }
        return false;
    }

    @Override
    public Object getPos(int pos) {
        if(isEmpty()||pos<0||pos>usedSize){//指定位置的合法性
            return null;
        }
        return this.elem[pos];
    }

    @Override
    public int size() {
        return usedSize;
    }

    @Override
    public void display() {
        for(int i=0;i<usedSize;i++){
            System.out.print(this.elem[i]);
        }
        System.out.println();
    }

    @Override
    public void clear() {
        for (int i=0;i<usedSize;i++){
            this.elem[i]=null;
        }
    usedSize=0;
    }
}
