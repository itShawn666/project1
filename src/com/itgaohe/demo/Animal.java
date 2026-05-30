package com.itgaohe.demo;

/**
 * @Classname Animal
 * @Description
 * @Date 2026/4/15 23:32
 * @Created by 孟祥宇
 */
public class Animal {
    private String name;
    private Boolean sex;

    public Animal(String name, Boolean sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
        return sex != null ? sex.equals(animal.sex) : animal.sex == null;
    }

    public Animal() {
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    public void eat(){
        System.out.println("动物吃饭");
    }
    public void sleep(){
        System.out.println("动物睡觉");
    }
    public void eat(String food){
        System.out.println("动物吃"+food);
    }
}
