package com.itgaohe.demo;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Classname Test2
 * @Description
 * @Date 2026/4/15 23:38
 * @Created by 孟祥宇
 */
public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog = new Dog("宋云志",false,10.0);
        dog.eat();
        dog.sound();
        dog.sleep();
        dog.eat("狗屎");
        Human human = new Human("孟祥宇",true);
        human.breathe();
        System.out.println(human.toString());
        try {
            Animal animal =(Animal) Class.forName("com.itgaohe.demo.Animal").getDeclaredConstructor().newInstance();
            animal.eat();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //stream流
        List<String> nameList= Arrays.asList("张三","李四","王五","张三丰");
        List<String> zhang = nameList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        }).collect(Collectors.toList());
        System.out.println(zhang);
        List<Integer> number=Arrays.asList(1,2,3,4,5,10,9,7,8,6,0);
        List<Integer> collect = number.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }).filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0?true:false;
            }
        }).collect(Collectors.toList());
        System.out.println(collect);
        //序列化：创建输出流并写入对象
        FileOutputStream fos = new FileOutputStream("object.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(human);
        oos.close();
        fos.close();
        //反序列化
        Human human1 = null;
        FileInputStream fis = new FileInputStream("object.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        human1 =(Human) ois.readObject();
        ois.close();
        fis.close();


    }
}
