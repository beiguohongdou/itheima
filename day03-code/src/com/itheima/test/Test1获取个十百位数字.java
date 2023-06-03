package com.itheima.test;

import java.util.Scanner;

public class Test1获取个十百位数字 {
    public static void main(String[] args) {
        //键盘录入一个三位数，获取其中个位、十位、百位

        //1、键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int numb=sc.nextInt();

        //2获取个位 十位 百位
        //个位：数字%10
        //十位：数字/10%10
        //百位：数字/10/10%10
        int ge = numb %10;
        int shi = numb/10%10;
        int bai = numb/100%10;
        System.out.println("个位是:"+ge);
        System.out.println("十位是:"+shi);
        System.out.println("百位是:"+bai);
    }
}
