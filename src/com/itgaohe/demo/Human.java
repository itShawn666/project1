package com.itgaohe.demo;

import javax.naming.Name;
import java.io.Serializable;

/**
 * @Classname Human
 * @Description
 * @Date 2026/4/15 23:59
 * @Created by 孟祥宇
 */
public class Human implements Action, Serializable {
    private String name;
    private Boolean sex;
    @Override
    public void eat() {
        System.out.println("人吃饭");
    }

    @Override
    public void play() {
        System.out.println("人玩");
    }

    @Override
    public void breathe() {
        System.out.println("人呼吸");
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        return sex != null ? sex.equals(human.sex) : human.sex == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Human(String name, Boolean sex) {
        this.name = name;
        this.sex = sex;
    }
}
