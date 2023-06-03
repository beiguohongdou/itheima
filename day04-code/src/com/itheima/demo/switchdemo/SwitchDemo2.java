package com.itheima.demo.switchdemo;

/*
default的位置与省略
1、位置：deafult不一定是要写在最下面，我们可以写在任意位置，只不过习惯写在最下面。
2、省略:default可以省略，语法不会有问题，但是不建议省略
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        int numb = 1;
        switch (1){
            case 1:
                System.out.println("numb的值为1");
                break;
            case 10:
                System.out.println("numb的值为10");
                break;
            case 20:
                System.out.println("numb的值为20");
                break;
            default:
                System.out.println("numb的值不是1、10或20");
                break;
        }
    }
}
