package com.itheima.demo.loopdemo;

public class WhileDemo1 {
    public static void main(String[] args) {
        //需求：利用while循环打印1-100
        //分析：
        //开始条件：1
        //结束条件：100
        int i = 1;
        while (i <= 100){
            System.out.println(i);
            i++;
        }
        /*
        for和while的区别：
        for循环中：知道循环次数或者循环的范围
        while循环：不知道循环的次数和范围，只知道循环的结束条件
        */

    }
}
