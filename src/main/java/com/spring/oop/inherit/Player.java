package com.spring.oop.inherit;

public class Player {

    private String nickName; // 닉네임
    private int level; // 레벨
    private int hp; // 체력

    public Player() {
        System.out.println("Player 기본 생성자 호출!");
    }

    public Player(String nickName) {
        System.out.println("Player 생성자 호출!");
        this.nickName = nickName; // 캐릭터 생성시 닉네임이 여러개일 수 있음.
        this.level = 1; //  캐릭터 생성시 기본적으로 레벨 1부터 시작하기에 this.level = 1;
        this.hp = 50; // 우리 게임은 hp 50부터 시작.
    }

    // 캐릭터 상세 정보 보기
    public void  info() {
        System.out.println("====== 캐릭터 정보 ======");
        System.out.println("# 닉네임: " + nickName);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }
}
