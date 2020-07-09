package com.example.ObserverMode;

/**
 * 观察者模式demo
 * 陷阱实体
 *
 * @author mhzhao
 * @since 2020-07-09
 */
public class Trap implements Observer {
    @Override
    public void update() {
        if (inRange()) {
            System.out.println("陷阱 困住主角！");
        }
    }

    private boolean inRange() {
        //判断主角是否在自己的影响范围内，这里忽略细节，直接返回true
        return true;
    }
}
