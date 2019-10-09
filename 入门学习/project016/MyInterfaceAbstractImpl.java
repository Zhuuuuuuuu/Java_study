package learn.project016;

/*
* 接口的使用步骤：
* 1.接口不能直接使用，必须有一个“”“”"实现类"来"实现"接口
* 格式：
* public class 实现类名称 implements 接口名称{
*   //。。。。
* }
* 2.接口的实现类必须是覆盖重写（实现）接口中所有的抽象方法
* 实现：去掉abstract关键字，加上方法体大括号
* 3.创建实现类的对象，进行使用*/
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void method1() {
        System.out.println("这是第一个方法");
    }

    @Override
    public void method2() {
        System.out.println("这是第二个方法");
    }

    @Override
    public void method3() {
        System.out.println("这是第三个方法");
    }

    @Override
    public void method4() {
        System.out.println("这是第四个方法");
    }
}
