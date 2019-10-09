package learn.project017;

/*接口的定义允许默认方法：
* 格式：
* public default 返回值类型 方法名称（参数列表）{
*   方法体
* }
*
* 备注：接口当中的默认方法，可以解决【接口升级】的问题*/
public interface MyInterfaceDefault {

    //抽象方法
    public abstract void method1();

//    //新添加的抽象方法
//    public abstract void method2();

    //新添加一个默认的方法
    public default void methoddefault(){
        //这是一个默认方法
        System.out.println("这是一个新添加的默认的方法");
    }
}
