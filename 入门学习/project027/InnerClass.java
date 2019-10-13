package learn.project027;

public class InnerClass {
    public static void main(String[] args) {
        //外部类名称.内部了名称 对象名 = new 外部类名称（）.内部类名称（）;
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}
