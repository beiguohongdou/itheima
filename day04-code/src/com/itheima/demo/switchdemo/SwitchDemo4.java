package com.itheima.demo.switchdemo;

/*
    swticth的新特性
        JDK12
 */
public class SwitchDemo4 {
    public static void main(String[] args) {
//        int numb = 1;
//        switch (1){
//            case 1:
//                System.out.println("一");
//                break;
//            case 2:
//                System.out.println("二");
//                break;
//            case 3:
//                System.out.println("三");
//                break;
//            default:
//                System.out.println("没有这种选项");
//                break;
//        }

        int numb = 10;
        switch (numb){
            case 1-> System.out.println("一");
            case 2-> System.out.println("二");
            case 3-> System.out.println("三");
            default -> System.out.println("没有这个选项");
        } //如果case大括号里只有一行代码，case的大括号可以省略
          //case 1 ->{
          //System.out.println("一");
          // }  若不止一行代码则需加上大括号
    }
}
