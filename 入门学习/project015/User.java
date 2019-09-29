package learn.project015;

public class User {

    private String name; //姓名
    private int money; //余额：当前用户的钱数

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    //展示一下的当前用户有多少钱
    public void show(){
        System.out.println("我叫："+name +",我有多少钱："+ money);
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public User() {
    }
}
