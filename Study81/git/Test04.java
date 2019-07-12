package com.linqxxy.git;

public class Test04 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for(int i=0;i<A.length;i++){
            B[i] = multiplyA(A,i);
        }
        return B;
    }
    public int multiplyA(int[] A,int i){
        int mul = 1;
        for(int j=0;j<i;j++){
            mul*=A[j];
        }
        for(int k=i+1;k<A.length;k++){
            mul*=A[k];
        }
        return mul;
    }
}
