package TestDemo3.bit.src;

import java.util.Arrays;

public class MySequence implements ISequence{
    private Object[]elem;
    private int usedSize;
    private static final int DEFAULT_SIZE=10;
    public MySequence(){
        this.elem=new Object[DEFAULT_SIZE];
        this.usedSize=0;
    }
    public MySequence(int SIZE){
        this.elem=new Object[SIZE];
        this.usedSize=0;
    }
    public boolean isFull(){
        if(this.usedSize==this.elem.length-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        return this.usedSize==0;
    }
    @Override
    public boolean add(int pos, Object data) {
        //1.pos的合法性，2.是否是满的顺序表
        if(pos<0||pos>this.usedSize){
            return false;
        }
        if(isFull()){
            //让数组扩大二倍
            this.elem=Arrays.copyOf(this.elem,this.elem.length*2);
        }
            for(int i=this.usedSize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
            }
            this.elem[pos]=data;
        usedSize++;
        return true;
    }

    @Override
    public int search(Object key) {
        if(key==null){
            return -1;
        }
        if(isEmpty()){
            throw  new UnsupportedOperationException("顺序表为空");
        }
        for (int i=0;i<this.usedSize;i++){
            if(this.elem[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contain(Object key) {
        if(isEmpty()){
            return false;
        }
        for (int i=0;i<this.usedSize;i++){
            if(this.elem[i].equals(key)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object getPos(int pos) {
        if(isEmpty()||pos<0||pos>=this.usedSize){
            return null;
        }
        return this.elem[pos];
    }

    @Override
    public Object remove(Object key) {
        int index=search(key);
        if(index==-1){
            return null;
        }
        Object oldData=this.elem[index];
        int i=0;
        for( i=index;i<usedSize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.elem[i+1]=null;
        usedSize--;
        return oldData;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void disPlay() {
     for (int i=0;i<usedSize;i++){
         System.out.print(this.elem[i]);
     }
        System.out.println('\n');
    }

    @Override
    public void clear() {
     for(int i=0;i<usedSize-1;i++){
         this.elem[i]=null;
     }
     this.usedSize=0;
    }
}
