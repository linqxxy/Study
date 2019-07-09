package com.linqxxxy.git;

import java.util.Arrays;

public class TestHeap implements Heap {
    private int[] elem;
    private int useSize;
    private static final int DEFAULT_SIZE = 10;

    public TestHeap() {
        this.elem = new int[DEFAULT_SIZE];
        this.useSize = 0;
    }

    @Override
    public void AdjustDown(int root, int len) {
        int tmp=this.elem[root];
        for(int i=2*root+1;i<=len;i=i*2+1){
            if(i<len&&this.elem[i]<this.elem[i+1]){
                i++;
            }
            if(this.elem[i]>tmp){
                this.elem[root]=this.elem[i];
                root=i;
            }else {
                break;
            }
        }
        this.elem[root]=tmp;
    }

    @Override
    public void initHeap(int[] array) {
        this.elem=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.useSize++;
        }
        for (int i = ((this.elem.length - 1 - 1) / 2); i >= 0; i--) {
            AdjustDown(i, elem.length - 1);
        }
    }

    @Override
    public void AdjustUp(int child, int len) {
        int tmp=this.elem[child];
        while (child>0){
            int parent=(child-1)/2;
            if(this.elem[parent]<tmp){
                this.elem[child]=this.elem[parent];
                this.elem[parent]=tmp;
            }
            child=parent;
        }
    }
    private boolean isFull(){
        return this.useSize==this.elem.length;
    }

    @Override
    public void pushHeap(int item) {
        if(isFull()){
            this.elem=Arrays.copyOf(this.elem,this.elem.length*2);
        }
        this.elem[this.useSize]=item;
        this.useSize++;
        AdjustUp(this.useSize-1,this.useSize);
    }

    @Override
    public int popHeap() {
        if (this.useSize==0){
            throw new UnsupportedOperationException("堆为空");
        }else {
            int tmp = this.elem[this.useSize - 1];
            this.elem[0] = this.elem[this.useSize - 1];
            this.elem[0] = tmp;
            AdjustDown(0, this.useSize--);
            return tmp;
        }
    }

    @Override
    public int getHeapTop() {
        return this.elem[0];
    }

    @Override
    public void HeapSort() {
        for(int i=0;i<useSize;i++){
            int tmp=elem[this.useSize-1-i];
            elem[this.useSize-1-i]=elem[0];
            elem[0]=tmp;
            AdjustDown(0,this.useSize-1-i-1);
        }
    }

    @Override
    public void show() {
        for (int i=0;i<this.useSize;i++){
            System.out.print(this.elem[i]+" ");
        }
    }
}
