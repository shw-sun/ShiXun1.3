package com.example.shixun13;

import android.util.Log;

public class Singleton {
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
    public void fun(){
        Log.e("TAG","Singleton");
    }
}
