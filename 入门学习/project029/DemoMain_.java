package learn.project029;

public class DemoMain_ {
    public static void main(String[] args) {
////        原来的方法：采用实现类实现接口
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();


//        现在的方法：采用匿名内部类实现接口
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了接口");
            }
        };
    }
}
