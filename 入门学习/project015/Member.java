package learn.project015;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {
    }

    public void receiver(ArrayList<Integer> list){
        //从多个红包当中随便抽取一个，给我自己
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合当中删除，并且得到被删除的红包，给我自己
        int delta = list.remove(index);
        //当前成员原本自己有多少钱
        int money = super.getMoney();
        //加法，对钱数进行重新设置
        super.setMoney(money + delta);
    }
}
