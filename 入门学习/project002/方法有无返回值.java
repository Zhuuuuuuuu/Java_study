package learn.project002;

public class 方法有无返回值 {
    public static void main(String[] args) {
        int num = getSum(20,30);
        System.out.println("返回值是"+num);

        printSum(30,29);
    }

    //有返回值，告诉main答案是几
    public static int getSum(int a,int b){
        int result = a + b;
        return result;
    }

//无返回值，你自己算 void类型
    public static void printSum(int a ,int b){
        int result = a + b;
        System.out.println("结果是" + result);
    }
}