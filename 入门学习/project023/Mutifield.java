package learn.project023;

/*
* 【多态】访问【成员变量】的两种方式
* 1.直接通过【对象名称】(obj)访问成员变量，看等号左边是谁，优先用谁，没有则向上找
* 2.间接通过【成员方法】(showNum)访问成员变量，看该方法属于谁，优先用谁，没有则向上找*/

public class Mutifield {

    public static void main(String[] args) {
        //使用多态的写法，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num); // 10 父

        System.out.println("=================");

        //子类如果没有覆盖重写，就是父：10
        //子类如果覆盖重写，就是子：20
        obj.showNum();
    }
}
