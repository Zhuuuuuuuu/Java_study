package learn.project001;

public class 变量的使用 {
    public static void main(String[] args) {
        //创建一个变量
        //格式：数据类型 变量名称；
        int num1;

        //向变量存入一个数据
        //格式：变量名称 = 数据值;
        num1 = 10;
        System.out.println(num1);


        //改变变量的数值;
        num1 = 20;
        System.out.println(num1);

        //一步到位
        int num2 = 50;
        System.out.println(num2);

        System.out.println("-----------------------");

        byte num3 = 30;//注意：右侧的数值类型不能超出byte -128-127

        System.out.println(num3);

        short num5 = 500;

        long num6 = 20000000L;//不能忘记后缀L

        System.out.println(num6);
        System.out.println(num5);


        float num7 = 2.6F;
        System.out.println(num7);

        double num8 = 2.99;
        System.out.println(num8);

        char zimu = 'z';
        System.out.println(zimu);


    }
}
