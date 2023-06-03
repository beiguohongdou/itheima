package com.itheima.demo.switchdemo;
/*
case穿透
    就是语句体中没有写break导致的。
执行流程：
    首先还是会拿着小括号中表达式的值跟下面每个case进行匹配。
    如果匹配上了，就会执行对应的语句体，如果此时发现了break，那么结束整个switch语句。
    如果没有发现break，那么程序会执行下一个case的语句体，一直遇到break或者右大括号为止
    使用场景：
    如果多个case的语句重复了，那么我们考虑利用case穿透去简化代码。
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        int numb = 1;
        switch (numb){
            case 1:
                System.out.println("numb的值为1");
                //break;
            case 10:
                System.out.println("numb的值为10");
                //break;
            case 20:
                System.out.println("numb的值为20");
                //break;
            default:
                System.out.println("numb的值不是1、10或者20");
                //break;
        }
    }
}
