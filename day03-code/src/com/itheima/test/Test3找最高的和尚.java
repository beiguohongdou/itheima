package com.itheima.test;

public class Test3找最高的和尚 {
    public static void main(String[] args) {
        /*需求：一座寺庙里住着三个和尚，已知他们的身高分别为 150cm、210cm、165cm,
        请用程序实现获取这三个和尚的最高身高
         */
        //1、定义三个变量，分别为三个和尚身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        //2、拿着第一个和尚跟第三个和尚进行比较
        //再拿着结果跟第三个和尚进行比较即可
        int H = height1>height2 ? height1 : height2;
        int max = H>height3 ? H : height3;
        //ctrl + alt + L 自动格式化代码
        System.out.println(max);
    }
}
