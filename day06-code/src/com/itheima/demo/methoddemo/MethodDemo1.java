package com.itheima.demo.methoddemo;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标：掌握最简单的方法定义和调用的格式
        playGame();
        System.out.println("     ");
        playGame();
    }
    //方法的定义需要写在mani方法的外面，类的里面
    //定义一个方法
    public static void playGame(){
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");

    }
}
