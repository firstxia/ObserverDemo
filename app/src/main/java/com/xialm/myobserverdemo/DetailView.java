package com.xialm.myobserverdemo;

/**
 * 观察者2
 * Created by Xialm on 2016/11/21.
 */

public class DetailView implements DownloadManager.DownloadObserver {

    @Override
    public void update() {
        System.out.println("观察者2--DetailView:收到了消息--自定义");
    }
}
