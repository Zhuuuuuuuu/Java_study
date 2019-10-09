package learn.project016;

/*在任何版本的接口中，接口都能定义[抽象方法]
* 格式如下：
* public abstract 返回值类型 方法名称（参数列表）;
*
* 注意事项
* 1.接口当中的抽象方法，修饰符必须是两个固定个关键字：public abstract
* 2.这两个关键字修饰符，可以选择性的省略
* 3.方法的三要素，根据需求来定义
* */
public interface MyInterfaceAbstract {

//    这是一个抽象方法
    public abstract void method1();

//    这也是一个抽象方法
    public  void method2();
//    这也是一个抽象方法
    abstract void method3();
//    这也是一个抽象方法
    void method4();

}
