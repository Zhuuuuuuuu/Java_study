package learn.project021;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodabs() {
        System.out.println("覆盖重写了两个人都有的方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }
}
