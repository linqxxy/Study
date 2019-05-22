package com.lineqxxy.git.wwh5;

import java.time.chrono.IsoChronology;

public class ProxySubject implements  ISubject {
    private ISubject subject;
    public ProxySubject(ISubject subject){
    this.subject=subject;
    }
    public void perPare(){
        System.out.println("准备食材");
    }
    public void afterEat(){
        System.out.println("猜拳洗碗");
    }
    @Override
    public void eat() {
    this.perPare();
    this.subject.eat();
    this.afterEat();
    }
}
