package learn.project018;
/*注意事项：不能通过接口实现类的对象来调用接口当中的静态方法
* 正确用法： 接口名称.静态方法名（）*/
public class StaticUse {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
//        这是一个错误写法，静态方法要防止冲突，而且上一行代码是无意义的创建
//        impl.StaticMethod();

//        正确写法:直接通过接口名称调用其中的静态方法
        MyinterfaceStatic.StaticMethod();
    }
}
