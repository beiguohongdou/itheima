package com.itheima.test;

public class LoopTest1逢七过 {
    public static void main(String[] args) {
        /*朋友聚会的时候可能会玩一个游戏：逢7过
        游戏规则：从任意一个数字开始报数，到你要报的数字是包含7或者是7的倍数都要说：过
        需求：在程序控制台打印出1-100之间的满足逢七过规则的数据

        分析：
        个位7  十位7  7倍数
        1 2 3 4 5 6 过 8 9 10 11 12 13 过 15 16 过 18 19 20 过...
        69 过 过 过 过 过...80*/

        //1、得到1-100之间的每一个数字
        //开始：1
        //结束：100
        for (int i = 1; i <= 100; i++) {
         //2、判断每个数字，如果符合规则就打印过，如果不符合规则就打印数字
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0 ){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
