package com.itheima.test.looptest;

public class Test13 {
    public static void main(String[] args) {
        /*在实际开发中，需要重复执行的代码，会选择循环实现
        在玩游戏的时候，如果网不好那么就会进场断线重连。
        那么断线重连这个业务逻辑就需要重复执行。
        假设现在公司要求，断线重连的业务逻辑最对只写5次。
        请用代码实现。
        tip：断线重连的业务逻辑可以用输出语句代替*/

        //分析
        //1、因我们需要重复执行某段代码，所以需要循环解决
        //循环的次数 5 次
        //开始条件： 1
        //结束条件： 5
        for (int i = 1; i <= 5; i++){
            System.out.println("第" + i + "次执行断线重连的业务逻辑");
        }
    }
}
