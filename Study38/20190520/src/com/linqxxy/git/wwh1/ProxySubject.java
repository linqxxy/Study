package com.linqxxy.git.wwh1;

class ProxySubject implements ISubject {
    private ISubject subject ;
    public ProxySubject(ISubject subject) {
        this.subject = subject;
    }
    public void prepare() {
        System.out.println("饭前收拾⻝材") ;
    }
    public void afterEat() {
        System.out.println("洗刷刷") ;
    }
    @Override
    public void eat() {
        this.prepare() ;
        this.subject.eat() ; // 核⼼吃
        this.afterEat() ;
    }
}
