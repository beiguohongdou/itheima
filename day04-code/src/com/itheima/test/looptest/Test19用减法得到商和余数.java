package com.itheima.test.looptest;

public class Test19用减法得到商和余数 {
    public static void main(String[] args) {
        /*需求：给定两个整数，被除数和除数（都是正整数，且不超过int的范围）
        将两数相除，要求不使用乘法、除法、和%运算符。
        得到商和余数。

        分析：
        被除数 / 除数 = 商 ... 余数
        int a = 100;
        int b = 10;

        100 - 10 = 0
        90 - 10 = 80
        80 - 10 = 70
        ...
        10 - 10 = 0
        0就是 余数，减了几次就是 商
        */
        //1、定义变量记录被除数
        int beichushu = 100;
        //2、定义变量记录除数
        int chushu = 37;
        //3、定义一个变量来统计相减了多少次
        int count = 0;
        //4、循环 while
        //只要被除数是大于等于除数的，那么就一直循环
        while (beichushu >= chushu){
            beichushu= beichushu - chushu;
            //只要减了一次，那么统计变量就自加一次
            count++;

        }
        //当循环结束后被除数变量记录的就是余数
        System.out.println("余数为" + beichushu);
        //当循环结束之后，count记录的值就是商
        System.out.println("商为" + count);

    }
}
