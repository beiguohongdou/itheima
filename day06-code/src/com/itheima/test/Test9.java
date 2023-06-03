package com.itheima.test;

public class Test9 {
    public static void main(String[] args) {
        int numb = 100;
        System.out.println("调用change方法前：" + numb);//100
        change(numb);
        //numb = change(numb);
        //numb = 200
        System.out.println("调用change方法后：" + numb);//100？

    }

    public static void change(int numb) {
                 //int
        numb = 200;
        //return numb;
    }
}
