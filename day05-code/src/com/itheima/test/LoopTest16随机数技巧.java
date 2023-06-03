package com.itheima.test;

import java.util.Random;

public class LoopTest16随机数技巧 {
    public static void main(String[] args) {
        //需求：
        //随机数范围：1-100

        //创建对象
        Random r = new Random();
        //生成随机数

        int numb = r.nextInt(100) + 1;  //1 ~ 100
        System.out.println(numb);

        /*秘诀
        用来生成任意数到任意数之间的随机数 eg:7~15
        1、让这个范围头尾都减去一个值，让这个范围从0开始  减去7  0~8
        尾巴+1     8 + 1 = 9
        最终的结果，再加上第一步减去的值
         */

       /* Random r = new Random();
        int numb = r.nextInt(9);//7 ~15
        //0 ~ 8 + 7
        System.out.println(numb);*/
    }
}
