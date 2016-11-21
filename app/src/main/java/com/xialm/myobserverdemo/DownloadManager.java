package com.xialm.myobserverdemo;

import java.util.Observable;

/**
 * 被观察者
 * Created by Xialm on 2016/11/21.
 */

public class DownloadManager extends Observable {
    private static DownloadManager instance = new DownloadManager();
    private DownloadManager() {}

    public static DownloadManager getInstance() {
        return instance;
    }

    @Override
    public synchronized boolean hasChanged() {
        return true;
    }
}
