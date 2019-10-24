package learn_2.StringBuilder_;
/*
* StringBuilder的常用方法：
*   public StringBuilder append(...):添加任意类型数据的字符串形式，并【返回当前对象自身】，无须接收返回值
* */
public class Stringbuilder的常用方法 {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this,调用方法的对象是bu,this==bu
        StringBuilder bu2 = bu.append("abc");
        System.out.println(bu);//abc
        System.out.println(bu2);//abc
        System.out.println(bu==bu2);//比较的是地址值 True

        //使用append【无需接收返回值】
    }
}
