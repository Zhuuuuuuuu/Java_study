package learn.project001;
/*1.多个变量，变量不能重复
  2.对于float和long ,字母后缀不能丢
  3.如果使用byte或者short，数值要在范围内
  4.变量一定要初始化才能使用
  5.变量的使用不能超出作用域的范围 作用域：大括号的范围
  6.可以通过一个语句创建多个变量，但是不推荐
 */
public class 变量的注意事项 {
    public static void main(String[] args) {
        //int num1 = 10;
        //int num1 = 20;


        int num2 = 29;

        int num4;
        //System.out.println(num4);

        //System.out.println(num5);
        //int num5 = 90;
        {
            int num6 = 89;
            System.out.println(num6);
        }

    int a = 10; int b = 20; float c = 30.4F;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }



}
