package learn_2.泛型;

public class 定义和使用泛型方法 {
    public static void main(String[] args) {
//        创建SelfMethod对象
        SelfMethod gm = new SelfMethod();

        /*调用含有泛型的方法method01
        * 传递什么类型，泛型就是什么类型*/

        gm.method01(10);
        gm.method01("123");
        gm.method01(true);
        gm.method01(8.8);

        gm.method02("静态方法不建议创建对象使用");
//        静态方法最好是：通过类名.方法名（参数）可以直接使用
        SelfMethod.method02("静态方法");
        SelfMethod.method02(123);
    }
}
