package learn.project001;
/*1.自动类型转换
特点：不需要特殊处理，自动完成
规则：数据类型从小到大转换

  2.强制类型转换

 */
public class 数据类型自动转换 {
    public static void main(String[] args) {
        System.out.println(1024);//整数类型，默认是int
        System.out.println(3.14);//整数类型，默认是double类型

        //左边long类型,右边int类型，自动转换
        long num1 = 100;
        System.out.println(num1);//变量100

        //左边双精度，右边单精度，符合从小到大的规则
        double num2 = 2.5F;
        System.out.println(num2);

        //左边float类型，右边是long类型，数据范围从小到大
        float num3 = 30L;
        System.out.println(num3);
    }
}
