package com.itgaohe.demo;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @Classname Test1
 * @Description
 * @Date 2026/4/15 22:30
 * @Created by 孟祥宇
 */
public class Test1 {
    public static void main(String[] args) {
        //基本数据类型上转型是自动的，下转型是手动的，小范围的数转为大范围的数一般是安全的，反之则可能发生数据溢出或者精度损失的问题
        //上转型
        int num=10;
        long num1=num;
        System.out.println(num1);
        //下转型
        double a=3.14;
        int b=(int) a;
        System.out.println(b);
        long longValue=100L;
        int intValue=(int) longValue;
        System.out.println(longValue);
        System.out.println(intValue);
        //为什么用bigDecimal 不用double
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        //double无法实现精确计算
        BigDecimal result = BigDecimal.valueOf(0.05).add(BigDecimal.valueOf(0.01));
        double result1= result.doubleValue();
        System.out.println(result1);
        //装箱拆箱:基本数据类型和包装类之间相互转换的过程
        Integer i=1;//装箱
        int j=i;//拆箱
        Integer.valueOf(j);//装箱
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

    }
}
