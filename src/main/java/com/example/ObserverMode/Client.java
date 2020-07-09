package com.example.ObserverMode;

/**
 * 观察者模式demo
 *
 * @author mhzhao
 * @since 2020-07-09
 */
public class Client {
    public static void main(String[] args) {
        //初始化对象
        Hero hero = new Hero();
        Monster monster = new Monster();
        Trap trap = new Trap();
        Treasure treasure = new Treasure();
        //注册观察者
        hero.attachObserver(monster);
        hero.attachObserver(trap);
        hero.attachObserver(treasure);
        //移动事件
        hero.move();
    }
}
