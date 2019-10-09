package learn.project020;

/*接口当中也可以定义【“”"成员变量"】,但是必须使用public static final 三个关键字进行【同时修饰】
* 从效果上看，这其实就是接口中的【常量】
*
* 格式：public static final 数据类型 常量名称 = 数据值；
* 备注：一旦使用了final关键字，说明不可改变
*
* 注意事项：
* 1.接口当中的常量,可以省略public static final 三个关键字 注意：就算不写，默认也是这样
* 2.接口当中的常量，必须进行赋值，不能不进行赋值
* 3.接口当中的常量的名称，使用完全大写的字母，用下划线进行分隔（推荐的命名规则）*/
public interface MyInterfaceConst {
    //这其实是一个常量，一旦赋值就不能进行更改
    public static final int NUM_OF_INTERFACE = 10;
}
