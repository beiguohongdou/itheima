package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        //1、定义数组
        int[] arr = {1,23,45,66,65};

        //2、调用方法求最大值
        int max = getMax(arr);

        //3、打印
        System.out.println(max);
    }
    //1、我要干嘛？
    //2、我干这件事需要什么？
    //3、方法的调用是否需要继续使用结果？
    public static int getMax(int arr[]){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }return max;

    }
}
