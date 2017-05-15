package com.jinjiang.demo.library;

public class EventPool {
    public static abstract class BaseEvent {

    }

    public static class ActivityNotify extends BaseEvent {
        public String activityName;

        public ActivityNotify(String activityName) {
            this.activityName = activityName;
        }
    }
}