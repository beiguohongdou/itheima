package com.itheima.test.switchtest;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*在实际开发中，如果我们需要在多种情况下选择其中一个，就可以使用switch语句。
        当我们拨打了某些服务电话时，一般都有按键选择。
        假设我们现在的博大了一个机票预定电话。
        电话中语音提示：
        1：机票查询
        2：机票预定
        3：机票改签
        4：退出服务
        其他按键也是退出服务，请使用switch模拟改业务逻辑。 */

        //分析
        //1、键盘录入一个数，表示我们的选择
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int choose = sc.nextInt();
        //2、根据选择执行不同代码
        switch (choose){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
            //case 4 -> System.out.println("退出服务");
            //4可以省略不写
            default -> System.out.println("退出服务");
        }
    }
}
