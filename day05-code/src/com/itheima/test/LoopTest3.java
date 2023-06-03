package com.itheima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        //需求：键盘录入一个正整数 x ，判断该整数是否为一个质数。

        //质数：
        //1、键盘录入一个正整数，nunb
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int numb = sc.nextInt();
        //定义一个变量，表示标记
        //标记这numb是否为一个质数
        //true：是一个质数
        //false：不是一个质数

        //表示最初就认为numb是一个质数
        boolean falg = true;

        //2、判断
        //写一个循环，从2开始，一直判断到numb-1为止
        //看这个范围之内，有没有可以被numb整除
        for (int i = 2; i < numb; i++) {
            //i 依次表示这个范围之内的每一个数字
            //看numb是否能被i整除就可以了
            if (numb % i == 0){
                falg = false;
                //System.out.println( numb + "不是一个质数");
                break;
            }
            //只有当这个循环结束了，表示这个范围之内所有的数字都循环完了
            //此时才能断定numb是一个质数

        }if (falg){
            System.out.println(numb + "是质数");
        }else {
            System.out.println(numb + "不是质数");
        }
    }
}
