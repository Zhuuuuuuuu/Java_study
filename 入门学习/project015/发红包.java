package learn.project015;

import java.util.ArrayList;

public class 发红包 {
    public static void main(String[] args) {
        Manger manger = new Manger("群主",100);

        Member one = new Member("成员A",0);
        Member two = new Member("成员B",2);
        Member three = new Member("成员C",1);

        manger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("============");

        //接下来进行发红包，群主总共发50块钱，分给4个人
        ArrayList<Integer> redList = manger.send(50,4);
        //四个成员进行抢红包 （调用方法）
        one.receiver(redList);
        two.receiver(redList);
        three.receiver(redList);

        //钱数的变动结果
        manger.show();
        one.show();
        two.show();
        three.show();
    }
}
