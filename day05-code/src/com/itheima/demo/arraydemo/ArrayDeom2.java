package com.itheima.demo.arraydemo;

public class ArrayDeom2 {
    public static void main(String[] args) {
        //利用索引对数组中的元素进行访问
        //1、获取数组里面的元素
        //格式： 数组名[索引]
        int[] arr = {1,12,13,14};
        //获取数组中的第一个元素
        /*int numb = arr[0];
        System.out.println(numb);
        System.out.println(arr[1]);
        */
        //2、把数据存储到数组当中
        //格式： 数组名[索引] = 具体数据/变量;
        //注意： 一旦覆盖之后，原来的数据就不存在了。
        arr[0] = 789362172;
        System.out.println(arr[0]);



    }
}
