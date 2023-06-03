package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest17猜数字游戏 {
    public static void main(String[] args) {
        //需求：程序自动生成一个1 - 100之间的随机数字，使用程序实现猜出这个数字是多少？

        //分析：
        //1、生成一个1 - 100之间的随机数字
        //扩展小需求增加一个保底机制，三次猜不中，直接提示猜中了

        /*注意点：
        1、生成随机数的代码int numb = r.nextInt(100) + 1;
        不能写在循环的里面，否则每次都会产生一个新的随机数

        2、抽奖机制
        eg：用点券去抽水晶
            保底 360次
         */

        //计数器，用来统计当前已经猜了多少次
        int count = 0;
        Random r = new Random();
        int numb = r.nextInt(100) + 1;
        System.out.println(numb);//显示随机数为多少
        //2、猜一猜这个数字是多少
        Scanner sc = new Scanner(System.in);
        while (true){
            //while的无限循环
            System.out.println("请输入猜的数");
            int guessnumb = sc.nextInt();
            //3、判断两个数字给出不同的提示
            //猜的数字大了，提示 大了
            //猜的数字小了，提示 小了
            //猜的数字一样，提示 猜对了
            count++;
            if (count ==3 ){
                System.out.println("对了，可惜是保底，非酋");
                break;
            }
            if (guessnumb > numb){
                System.out.println("猜大了，🐕☀💧");
            }else if (guessnumb < numb){
                System.out.println("猜小了，🐕☀💧");
            }else{
                System.out.println("我焯,🐂🍺猜对辣");
                break;
            }
        }


        }
    }

