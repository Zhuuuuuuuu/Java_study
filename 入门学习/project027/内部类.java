package learn.project027;

/*
* 如果一个事物的内部包含另一个事物,就像一个类中包含另一个类
*
* 分类:
* 1.成员内部类
* 2.局部内部类(包含匿名内部类)
* */

/*
* 成员内部类的定义格式：
* 修饰符 class 外部类名称{
*     修饰符 class 内部类名称{
*           //...    }
*   //....
* }*/

/*如何使用成员内部类？ 有两种方式
* 1.间接方式：在外部类方法中，使用内部类；然后main只是调用外部类的方法
* 2.直接方式：公式
* 类名称 对象名 = new 类名称（）；
* 现在： 外部类名称.内部类名称 对象名 = new 外部内名称（）.new 内部类名称（）；*/
public class 内部类 {
    public static void main(String[] args) {
//        通过外部类对象，调用外部类方法，里面间接再使用内部类Heart
        Body body = new Body();
        body.methodBody();
        System.out.println("------------------------");

//        按照公式写
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
