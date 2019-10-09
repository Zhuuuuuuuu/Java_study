package learn.project016;
/*
* 接口就是多个【类】的【公共规范】
* 结构是一种【引用数据】类型，最重要的内容就是其中的【抽象方法】
*
* 如果定义一个接口
* public class -> public interface 接口名称{
*     //接口内容
* }*/

/*备注 换成了关键字interface之后，编译后生成的字节码文件仍然是.java-->.class
*
* 接口可以包含的内容有：
* 1.常量
* 2.抽象方法 最重要
* 3.默认方法
* 4.静态方法
* 5.私有方法*/


public class info_interface {
    public static void main(String[] args) {
//        错误写法，不能直接new一个接口
//        MyInterfaceAbstract inter = new MyInterfaceAbstract();

//        创建类对象才能使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.method1();
        impl.method2();
        impl.method3();
    }
}
