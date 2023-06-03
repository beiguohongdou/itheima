package com.itheima.test.looptest;

public class test12 {
    public static void main(String[] args) {
        //需求：1、打印1~5
        //分析：
        //开始条件：1，结束条件：5
        for (int x = 1;x <=5 ;x++) {
            //第一次循环：x = 1
            //第二次循环：x = 2
            //x ：1 2 3 4 5
            System.out.println(x);
        }

        //需求：2、打印5~1
        //分析：开始条件：5，结束条件：1
        for (int i = 5; i >=1 ;i--){
            System.out.println(i);
        }


    }
}
