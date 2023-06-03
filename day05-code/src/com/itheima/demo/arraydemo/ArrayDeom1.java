package com.itheima.demo.arraydemo;

public class ArrayDeom1 {
    public static void main(String[] args) {
        /*格式：
        静态初始化：
        完整格式：
        数据类型 [] 数组名 = new 数据类型[]{元素1,元素2,...};
        简化格式：
        数据类型 [] 数组名 = {元素1,元素2,...};
        */

        /*//需求1、定义数组存储5个学生的年龄
        int [] arr1 = new int[]{11,12,12,14,15};
        int [] arr2 = {11,12,12,14,15};

        //需求2、定义数组存储3个学生的姓名
        String [] arr3 = new String[]{"小明","小红","小强"};
        String [] arr4 = {"小明","小红","小强"};

        //需求3、定义数组存储4个学生的身高
        double [] arr5 = new double[]{1.60,1.55,1.65,1.69};*/
        double [] arr6 = {1.60,1.55,1.65,1.69};
        System.out.println(arr6); //[D@776ec8df 地址值

        /*扩展：
        [ :表示当前是一个数组
        D ：表示当前数组里面的元素都是double类型的
        @ ：表示一间隔符号。（固定格式）
        776ec8df：才是真正的地址值（十六进制）
        平时我们会习惯行的把这个整体叫做数组的地址值。
         */
    }
}
