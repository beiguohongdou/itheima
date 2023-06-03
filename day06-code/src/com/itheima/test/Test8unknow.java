package com.itheima.test;

public class Test8unknow {
    public static void main(String[] args) {
        /*需求：
        定义一个方法copyOfRang(int[] arr,int from, int to)
        功能：
        将数组arr中从索引from（包含from）开始。
        到索引to结束（不包含to）的元素复制到新数组中，
        将新数组返回。*/

        //1、定义原始数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //2、调用方法拷贝
        int[] copyArr = copyOfRang(arr, 3, 8);

        //3、遍历Arr
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }

    }

    //1、我要干嘛？
    //2、我干这个事需要什么？
    //3、是否需要返回值？ 需要

    public static int[] copyOfRang(int[] arr, int from, int to) {
        //1、定义数组
        //数据类型[] 数组名 = new 数据类型[数组的长度]; 动态初始化
        int[] newArr = new int[to - from];
        //伪造索引 思想
        int index = 0;
        //2、把原始数组arr中的from到to上对应的元素，直接拷贝到newArr中
        for (int i = from; i < to; i++) {
            //数组名[索引] = 数据值;
            newArr[index] = arr[i];
            index++;
        }
        //3、把新数组返回
        return newArr;
    }
}
