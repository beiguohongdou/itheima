package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
            /*需求：定义方法实现随机产生随机一个5位的验证码
            验证码格式：
            长度为5
            前四位是大写字母或者小写字母
            最后一位是数字
    */
        //方法：
        //在以后如果需要在一堆没有什么规律的数据中随机抽取
        //可以先把这些数据放到数组中
        //再随机抽取一个索引

        //分析：
        //1、大写字母和小写字母都放到数组中

        //2、随机抽取4次

        //3、随机抽取一个数字：0~9
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            //96----a
            if (i <= 25 ){
                //添加小写字母；强转
                chs[i] = (char) (97 + i);
            }else {//65---A
                //添加大写字母
                chs[i] = (char) (65 + i - 26);
            }

        }
        /*//遍历数组
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] +" ");
        }
*/

    }

}
