package com.example.ObserverMode;

/**
 * 观察者模式demo
 * 主角实体
 *
 * @author mhzhao
 * @since 2020-07-09
 */
public class Hero extends Subject{
    void move(){
        System.out.println("主角向前移动");
        notifyObservers();
    }
}
