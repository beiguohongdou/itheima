package com.itheima.test;

import java.util.Random;

public class LoopTest15随机生成随机数 {
    public static void main(String[] args) {
        //先获取一个随机数
        //范围：0-10

        //1、导包
        //2、创建对象
        Random r = new Random();

        //3、生成随机数
        //判读技巧；
        //在小括号中，书写的是生成随机数的范围
        //这个范围是从0开始的
        //到这个数-1结束
        //口诀：包头不包尾，包左不包右
        for (int i = 0; i < 100; i++) {
            int numb = r.nextInt(10);
            System.out.println(numb);
        }

    }
}
