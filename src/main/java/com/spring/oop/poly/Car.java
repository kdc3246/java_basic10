package com.spring.oop.poly;

class Avante implements Car {
    @Override
    public void run() {
        System.out.println("아반떼가 달립니다.");
    }

    @Override
    public void brake() {
        Car avante = new Avante();
    }

    void nMode() {
        System.out.println("아반떼가 빠르게 편드라이빙을 합니다.");
    }
}
class Sonata implements Car {
    @Override
    public void run() {
        System.out.println("쏘나타가 달립니다.");
    }

    @Override
    public void brake() {

    }
}
class Granduer implements Car {
    @Override
    public void run() {
        System.out.println("그랜저가 달립니다.");
    }

    @Override
    public void brake() {

    }
}

public interface Car {

    void run();

    void brake();
}
