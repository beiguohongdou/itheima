package com.itheima.test.iftest;

public class Test2 {
    public static void main(String[] args) {
        //汽车无人驾驶会涉及到大量的判断
        //当汽车行驶的时候遇到了红绿灯，就会进行判断
        //如果红灯亮，就停止
        //如果黄灯亮，就减速
        //如果绿灯亮，就行驶

        //1、定义三个灯的状态
        //true 亮 false 灭
        boolean lightGreen = false;
        boolean lightYellow = false;
        boolean lightRed = true;

        //2、判断
        //红灯亮，就停止
        //黄灯亮，就减速
        //绿灯亮，就行驶
        if (lightGreen){
            System.out.println("GOGOGO");
        }
        if (lightYellow){
            System.out.println("SLOW");
        }
        if (lightRed){
            System.out.println("Stop Mother Fuck");
        }
    }
}
