package com.itheima.test;

public class Test2判断101到200之间的素数 {
    public static void main(String[] args) {
        //判断 101~200 之间有多少个素数，并输出所有素数
        //10
        //思路一: 循环判断 2 到这个数字 -1 ,有没有数字能被 10 整除（2~9之间有没有数字能被十整除）
        //思路二：循环判断 2 到这个数字的平方根（现在暂时不用）


        //定义一个变量来统计有多少个质数
        int count = 0;

        //外循环：用来循环遍历101~200这个范围，依次得到这个范围之内的每一个数字
        for (int i = 101; i <= 200; i++) { //i 依次表示循环中的每一个数字
            //继续判断i是否为一个质数

            boolean flag = true;

            //内循环：用来判断当前数字是否为一个质数；从2开始到这个数字-1结束
            for (int j = 2; j < i; j++) {
                //j表示2~99之间的每一个数字
                if (i % j == 0) {
                    flag = false;

                    //跳出单层循环，内循环
                    break;
                }
            }
            //这个 if(flag) 直接就默认表示表示flag为true，类似于简写
            if (flag) {
                System.out.println("当前数字" + i + "是质数");
                count++;
            }
        }
        System.out.println("一共有" + count + "个质数");




        /*
        定义变量i，赋值100
        判断i是否为质数

        int i = 100;
        boolean flag = true;
        //原本是j < 100 但是已有变量 i=100，所以就不用写死写成100了，直接写成j<i
        for (int j = 2; j < i; j++) {
            //j表示2~99之间的每一个数字
            if (i % j == 0) {
                flag = false;
                break;
            }
        }
        //这个 if(flag) 直接就表示表示flag为true
        if (flag) {
            System.out.println("当前数字是质数");
        } else {
            System.out.println("当前数字不是一个质数");
        }*/
    }
}
