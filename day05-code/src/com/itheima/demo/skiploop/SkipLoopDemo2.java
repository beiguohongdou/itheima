package com.itheima.demo.skiploop;

public class SkipLoopDemo2 {
    public static void main(String[] args) {
        //结束整个循环
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子");
            if (i == 3) {
                //结束整个循环
                break;
            }


        }
    }
}
