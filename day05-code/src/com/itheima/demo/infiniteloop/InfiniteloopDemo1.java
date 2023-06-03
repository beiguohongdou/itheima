package com.itheima.demo.infiniteloop;

public class InfiniteloopDemo1 {
    public static void main(String[] args) {
//        //for格式的无限循环
//        for (;;){
//            System.out.println("学习");
//        }

        //while格式的无限循环
        while (true){
            System.out.println("学习");
        }
        //注意：
        //无限循环的下面不能再写其他的代码了，因为循环永远停不下来，那么下面的代码永远执行不到
    }
}
