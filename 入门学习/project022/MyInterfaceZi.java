package learn.project022;

/*这个子接口中有四个方法
* public abstract void methodCommon();来源于A和B
* 自己有一个
* 一个来自于A
* 一个来自于B*/
public interface MyInterfaceZi extends MyInterfaceA,MyInterfaceB {
    public abstract void method();

    @Override
    default void methoddefault() {

    }
}
