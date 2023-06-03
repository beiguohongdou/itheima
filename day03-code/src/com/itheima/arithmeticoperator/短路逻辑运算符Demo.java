package com.itheima.arithmeticoperator;

public class 短路逻辑运算符Demo {
    public static void main(String[] args) {
        //1、&&
        //运行结果跟单个&是一样的
        //表示两边都为真，结果才是真
        System.out.println(true&&true);
        System.out.println(false&&false);
        System.out.println(true&&false);
        System.out.println(false&&true);


        System.out.println("      ");


        //2、||
        //运行结果跟单个|是一样的
        //表示两边都为假，结果才是假
        System.out.println(false||true);
        System.out.println(false||false);
        System.out.println(true||false);
        System.out.println(false||true);

        //3、短路逻辑运算符具有短路效果
        //简单理解：当左边的表达式能确定最终结果，右边表达式不会参与运算
        //右边不执行，提高了效率

        System.out.println("     ");
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

    }
}
