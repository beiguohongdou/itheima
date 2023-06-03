package com.itheima.test.switchtest;

import java.util.Scanner;

public class Test10case穿透 {
    public static void main(String[] args) {
        /*需求：键盘录入星期数，输出工作日、休息日。
        （1-5）工作日，（6-7）休息日。 */

        //分析
        //1、键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是周几");
        int week = sc.nextInt();
        //2、利用switch语句来进行选择
        switch (week){
            case 1,2,3,4,5 ->System.out.println("今天是工作日");
            case 6,7 ->System.out.println("今天是休息日");
            default-> System.out.println("输入错误，请重新输入");

        }

    }
}
