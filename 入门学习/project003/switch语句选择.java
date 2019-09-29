package learn.project003;
/*
1.多个case后面的数值不可以重复
2.switch后面的小括号当中只能是以下数据类型
基本数据类型：byte char short int
应用数据类型:string enum

3.switch语句可以很灵活，前后顺序可以颠倒
4.如果case中无break，将会穿透到下一个case语句执行直到break结束
* */
public class switch语句选择 {
    public static void main(String[] args) {
        int num = 6;
        switch (num){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入数据不合理");
                break;
        }
    }
}
