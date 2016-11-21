package com.xialm.myobserverdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的被观察者--使用单例
 * Created by Xialm on 2016/11/21.
 */

public class DownloadManager {
    private static DownloadManager instance = new DownloadManager();

    private DownloadManager() {
    }

    public static DownloadManager getInstance() {
        return instance;
    }

    // 2.声明集合-存放所有的观察者
    private List<DownloadObserver> observers = new ArrayList<>();

    // 1.声明一个观察者-接口
    public interface DownloadObserver {
        void update();
    }

    // 3.添加一个注册观察者的方法
    public void addObserver(DownloadObserver observer) {
        if (observer == null) {
            throw new NullPointerException("你给我传的观察者不能为空");
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    // 4.添加一个通知所有观察者的方法
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            DownloadObserver downloadObserver = observers.get(i);
            downloadObserver.update();
        }
    }
}
