package com.jinjiang.demo.modulappdemo;

import android.app.Application;
import android.util.Log;

import com.github.mzule.activityrouter.annotation.Modules;
import com.jinjiang.demo.library.EventPool;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

@Modules({"app","loginmodule","paymodule"})
public class ModularizationApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void logActivityCreate(EventPool.ActivityNotify activityNotify) {
        Log.d("ActivityCreate", activityNotify.activityName);
    }
}