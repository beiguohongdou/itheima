package com.itheima.test.switchtest;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        /*需求：键盘录入星期数，显示今天的减肥活动。
        周一：跑步
        周二：游泳
        周三：慢走
        周四：动感单车
        周五：拳击
        周六：爬山
        周日：整点好的！！！
         */
        //分析
        //1、键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是周几");
        int week = sc.nextInt();
        //2、利用switch对星期进行匹配
        switch (week){
            case 1:
                System.out.println("今天要进行的运动是跑步");
                break;
            case 2:
                System.out.println("今天要进行的运动是游泳");
                break;
            case 3:
                System.out.println("今天要进行的运动是慢走");
                break;
            case 4:
                System.out.println("今天要进行的运动是动感单车");
                break;
            case 5:
                System.out.println("今天要进行的运动是拳击");
                break;
            case 6:
                System.out.println("今天要进行的运动是爬山");
                break;
            case 7:
                System.out.println("整点好的！！！");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
