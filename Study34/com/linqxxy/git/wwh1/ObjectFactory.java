package com.linqxxy.git.wwh1;

public interface ObjectFactory<P1,P2,R> {
    R createObject(P1 p1,P2 p2);
}
