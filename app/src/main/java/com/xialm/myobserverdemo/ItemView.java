package com.xialm.myobserverdemo;

/**
 * 观察者1
 * Created by Xialm on 2016/11/21.
 */

public class ItemView implements DownloadManager.DownloadObserver {

    @Override
    public void update() {
        System.out.println("观察者1--ItemView:收到了消息--自定义");
    }
}
