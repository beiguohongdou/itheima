package com.itheima.test.looptest;

public class Test18回文数 {
    public static void main(String[] args) {
        /*需求：给你一个整数 x。
        如果 x 是一个回文整数，打印true，否则，返回false。
        解释：回文数是指正序（从左向右）和倒叙（从右向左）读都是一样的整数
        例如：121是回文，而123不是。 */

        //核心思路：把数字倒过来跟原来的数字进行比较

        //1、定义数字
        int x = 121;
        //用来记录倒过来的值
        int numb = 0;
        //定义一个临时变量用来记录原来x的值
        int temp = x;
        //2、利用循环开始从右往左获取每一位数字
        while (x != 0){
            //从右往左获取每一位数字
            int ge = x % 10;
            x = x/ 10;
            //把当前获取到的数字拼接到最右边
            numb = numb * 10 +ge;
        }
        //打印num
        System.out.println(numb);
        System.out.println(x);
        //比较
        System.out.println(numb == temp);









//        //1、定义一个数字
//        int x = 1234;
//        //2、获取个位
//        int ge = x % 10;
//        //获取十位
//        int shi = x / 10 % 10;
//        //获取百位
//        int bai = x / 100 % 10;
//        //获取千位
//        int qian = x / 1000 % 10;
//
//        //3、拼接
//        int result = ge * 10 + shi;
//        System.out.println(result);
    }
}
