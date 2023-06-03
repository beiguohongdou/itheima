package com.itheima.demo.arraydemo;

public class ArrayDemo4动态初始化 {
    public static void main(String[] args) {
         /*定义一个数组，用来存班级中50个学生的姓名
         姓名未知，等学生报道之后，再进行添加*/

        //格式：
        //数据类型[] 数组名 = new 数据类型[数组的长度];
        //在创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值

        String[] arr = new  String[50];
        //添加学生
        arr[0] = "张三";
        arr[1] = "李四";
        System.out.println(arr[0]);//张三
        System.out.println(arr[1]);//李四
        System.out.println(arr[2]);//打印出来的是默认初始化值 null

        //数组默认初始化值的规律
        //整数类型：默认初始化值：0
        //小数类型：默认初始化值：0.0
        //字符类型：默认初始化值：'\u0000'表示 空格
        //布尔类型：默认初始化值：flase
        //引用数据类型：默认初始化值：null

        int[] arr2 = new  int[3];
        System.out.println(arr2[0]);//0
        System.out.println(arr2[1]);//0
        System.out.println(arr2[2]);//0

    }

}
