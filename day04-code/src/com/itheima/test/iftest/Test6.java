package com.itheima.test.iftest;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*
        根据不同的分数送不同的礼物
        如果是95~100分，送自行车一辆
        如果是90~94分，游乐场玩一天
        如果是80~89分，送变形金刚一个。
        如果是80分，揍一顿
         */
        //分析：
        //1、键盘录入小明的考试成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩");
        int score = sc.nextInt();

        //对异常数据进行判断
        //0~100才是合理数据
        if (score >0 && score<= 100){
            //2、根据不同的考试成绩，给出不同的奖励
            if (score >= 95 && score <= 100){
                System.out.println("送自行车一辆");
            } else if (score >= 90 && score<=94) {
                System.out.println("游乐场玩一天");
            }else if (score >80 && score <=89){
                System.out.println("送变形金刚一个");
            }else {
                System.out.println("挨打吧，狗东西");
            }
            }else {
            System.out.println("你特么成绩输错了，你知道吗");
        }
        }
    }

