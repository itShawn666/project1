package com.itgaohe.demo;

/**
 * @Classname Dog
 * @Description
 * @Date 2026/4/15 23:36
 * @Created by 孟祥宇
 */
public class Dog extends Animal{
    private Double size;
    public Dog(String name, Boolean sex,Double size) {
        super(name, sex);
        this.size=size;
    }
    public void eat(){
        System.out.println("狗吃饭");
    }
    public void eat(String food){
        System.out.println("狗吃"+food);
    }
    public void sound(){
        System.out.println("汪汪...");
    }
}
