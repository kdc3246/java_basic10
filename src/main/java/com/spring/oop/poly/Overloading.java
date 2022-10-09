package com.spring.oop.poly;

public class Overloading {

    void foo() {}
    void foo(int a) {}
    void foo(double b) {}
    void foo(int x, double y) {}
    void foo(double x,int y) {}

    public Overloading() {

        foo(10.5, 20);
    }
}
