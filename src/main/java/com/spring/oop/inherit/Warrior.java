package com.spring.oop.inherit;

public class Warrior extends Player{

    private int rage;

    public Warrior() {
        super();
        System.out.println("Warrior 기본 생성자 호출!");
    }

    public Warrior(String nickName) {
        super(nickName);
        this.rage = 100;
        System.out.println("Warrior 생성자 호출!");
    }

    // info 라고 해야지 오버라이딩이다.
    @Override
    public void info() {
        super.info();
        System.out.println("# 분노: " + rage);
    }

}
