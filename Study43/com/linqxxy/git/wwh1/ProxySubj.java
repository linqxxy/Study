package com.linqxxy.git.wwh1;

public class ProxySubj implements ISubj {
    private ISubj iSubj;
    public  ProxySubj(ISubj iSubj){
        this.iSubj=iSubj;
    }
    public void prebuy(){
        System.out.println("买之前");
    }
    public  void afterbuy(){
        System.out.println("买之后");
    }
    @Override
    public void buy() {
       this.prebuy();
       this.iSubj.buy();
       this.afterbuy();
    }
}
