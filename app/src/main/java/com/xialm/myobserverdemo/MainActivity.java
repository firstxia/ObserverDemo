package com.xialm.myobserverdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

/**
 * 观察者模式:小Demo
 */
public class MainActivity extends AppCompatActivity {

    private DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 创建观察者对象
        downloadManager = DownloadManager.getInstance();
        // 注册观察者
        downloadManager.addObserver(new ItemView());
//        downloadManager.addObserver(new DetailView());
    }

    public void notifyAll(View view) {
        // 通知所有的观察者
        Random random = new Random();
        // 比如说是当前下载进度和最大下载进度
        downloadManager.notifyObservers(random.nextInt(100),100);
    }
}
