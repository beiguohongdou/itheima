package com.itheima.test.iftest;

public class Test8 {
    public static void main(String[] args) {
        //汽车无人驾驶会涉及到大量的判断
        //当汽车行驶的时候遇到了红绿灯，就会进行判断
        //如果红灯亮，就停止
        //如果黄灯亮，就减速
        //如果绿灯亮，就行驶

        //1、定义三个变量表示灯的状态
        //true 亮 false 灭
        boolean LightRed = true;
        boolean LightYellow = false;
        boolean LightGreen = false;

        //2、判断
        //红灯亮，停止
        //绿灯亮，行驶
        //黄灯亮，减速
        if (LightGreen){
            System.out.println("GOGOGOGO");
        } else if (LightYellow) {
            System.out.println("Slow");
        } else if (LightRed) {
            System.out.println("Stop!");
        }
    }
}
