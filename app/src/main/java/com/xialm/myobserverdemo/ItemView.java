package com.xialm.myobserverdemo;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者1
 * Created by Xialm on 2016/11/21.
 */

public class ItemView implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("观察者1--ItemView:收到了消息");
    }
}
