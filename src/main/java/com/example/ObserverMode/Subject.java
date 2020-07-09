package com.example.ObserverMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式demo
 * 被观察者实体
 *
 * @author mhzhao
 * @since 2020-07-09
 */
public class Subject {
    public List<Observer> observerList = new ArrayList<Observer>();

    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }

    public void detachObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
