package com.itheima.test;

import java.util.Scanner;

public class Test5判断是否为6的倍数 {
    public static void main(String[] args) {
        /*键盘录入两个整数。
        如果其中一个为6，最终结果输出为true
        如果它们的和为6的倍数，最终结果输出ture
        其他情况都是fasle。
         */
        //分析
        //1、键盘录入两个整数
        //变量a 变量b

        //2、 a == 6 || b == 6  (a+b)%6 = 0
        //如果其中一个满足，那么就输出true
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int numb1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int numb2 = sc.nextInt();

        //可以用短路逻辑运算符去连接三个判断
        boolean Result = numb1 == 6 || numb2 ==6 || (numb1+numb2)%6 == 0;
        System.out.println(Result);

    }
}
