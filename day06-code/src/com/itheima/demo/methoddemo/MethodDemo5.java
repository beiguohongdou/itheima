package com.itheima.demo.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        //目标：掌握带返回值方法的定义和调用格式

        //直接调用
        //getsum(10,20,30);

        //赋值调用
        //int sum = getsum(10,20,30);
        //System.out.println(sum);

        //输出调用
        //System.out.println(getsum(10,23,22));


        //先计算第一个季度的销售额
        int sum1 = getsum(10,22,36);
        //计算第二个季度的销售额
        int sum2 = getsum(22,23,44);
        //计算第三个季度的销售额
        int sum3 = getsum(22,32,45);
        //计算第四个季度的销售额
        int sum4 = getsum(26,32,45);
        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println(sum);
    }
    public static int getsum(int numb1,int numb2,int numb3){
        int result = numb1 + numb2 + numb3;
        return result;
    }
}
