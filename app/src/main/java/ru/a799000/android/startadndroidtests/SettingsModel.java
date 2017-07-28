package ru.a799000.android.startadndroidtests;

/**
 * Created by Alex on 28.07.2017.
 */

public class SettingsModel {
    String mHello;
    int mCount;

    public String getHello() {
        return mHello;
    }

    public void setHello(String hello) {
        mHello = hello;
    }

    public int getCount() {
        return mCount;
    }

    public void setCount(int count) {
        mCount = count;
    }

    @Override
    public String toString() {
        return "SettingsModel{" +
                "mHello='" + mHello + '\'' +
                ", mCount=" + mCount +
                '}';
    }
}
