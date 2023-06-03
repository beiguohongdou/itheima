package com.itheima.arithmeticoperator;

public class 三元运算符Demo {
    public static void main(String[] args) {
        //需求：用三元运算符，获取两个数的较大值

        //分析：
        //1、定义两个变量记录两个整数
        int numb1 = 10;
        int numb2 = 20;

        //2、用三元运算符获取两个整数的较大值
        //格式：关系表达式 ？ 表达式1 ：表达式2；
        //整个三元运算符必须要被使用


        int max = numb1 > numb2 ? numb1 : numb2;
        System.out.println(max);
            /*
        首先计算关系表达式的值
        如果值为true，表达式1的值就是运算结果
        如果值为false,表达式2的值就是运算结果
         */
    }
}
