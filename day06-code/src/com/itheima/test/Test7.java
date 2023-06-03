package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        //1、定义一个数组
        int[] arr = {1,2,3,4,5,6};

        //2、判断一个数字在数组中是否存在
        boolean flag = contains(arr,9);
        System.out.println(flag);

    }
    //1、我要干什么
    //2、我需要什么东西
    //3、是否需要返回值？ 返回 ture false
    public static boolean contains(int arr[], int numb){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numb){
                return true;
            }
        }
        //什么时候能判断6，在数字中不存在
        //当数组里面所有数字都比较完毕之后
        return false;
    }
}
