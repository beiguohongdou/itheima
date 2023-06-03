package com.itheima.test;

/*需求：
    您和您的约会对象正试图在餐厅获得一张桌子
    键盘录入两个整数，表示你和你约会对象衣服时髦度。（手动录入0~10之间的整数，不能录入其他）
    如果你的时髦度大于你对象的时髦度，相亲就成功，输出true
    否则输出false
     */

import java.util.Scanner;

public class Tets2衣服时髦度 {
    public static void main(String[] args) {
      //1、键盘录入两个整数表示衣服时髦度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我们自己衣服时髦度");
        int myfashion = sc.nextInt();
        System.out.println("请输入相亲对象衣服时髦度");
        int girlfashion = sc.nextInt();

        //2、把我衣服的时髦度与女孩的时髦度进行对比
        if(myfashion>girlfashion){
            System.out.println("成功");
        }else
            System.out.println("失败");
        //3、打印结果
    }
}
