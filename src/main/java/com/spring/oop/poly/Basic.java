package com.spring.oop.poly;

public class Basic {

    class A {
    }

    class B extends A {
    }

    class C extends A {
    }

    class D extends B {
    }

    class E extends C {
    }

    // 기본 생성자 단축키 Alt + Insert
    public Basic() {
        A a = new A();
        Object a1 = a;

        B b = new B();
        a = b;

        B d = new D();


    }
}
