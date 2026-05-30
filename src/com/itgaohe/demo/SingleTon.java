package com.itgaohe.demo;

/**
 * @Classname SingleTon
 * @Description 设计单例模式
 * @Date 2026/4/16 2:34
 * @Created by 孟祥宇
 */
public class SingleTon {
    11
    // volatile 关键字修饰变量 防止指令重排序
    private static volatile SingleTon instance=null;
    private SingleTon(){}
    public static SingleTon getInstance(){
        if (instance==null){
            // 同步代码块 只有在第一次获取对象的时候会执行到，第二次及以后访问时instance变量均为非null故不会往下执行了 直接返回
            synchronized (SingleTon.class){
                if (instance==null){
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }

}
