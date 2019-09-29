package learn.project015;

import java.util.ArrayList;

//群主发红包的类

public class Manger extends User {
    public Manger(){

    }

    public Manger(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        //首先看一下群主还有多少钱
        int leftMoney = super.getMoney();//群主当前余额
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;//返回空集合
        }

        //开始扣钱：其实就是[重新]设置余下额度
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分为count份
        int avg = totalMoney/count;
        int mod = totalMoney%count;//余下的零头
        //除不尽的零头把它包在最后一个红包当中
        //下面把红包一个一个放到集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        //最后一个红包(count -1 留下的那个)
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
