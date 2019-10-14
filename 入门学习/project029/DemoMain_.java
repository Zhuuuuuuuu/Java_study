package learn.project029;

/*
* 如果接口的实现类（或者是父类的子类）只需要使用【唯一的一次】
* 那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】
*
* 匿名内部类的定义格式：
* 接口名称 对象名 = new 接口名称（）{
*  //覆盖重写所有的抽象方法
* }；
*
* 对格式“"new 接口名称（）{...}"进行解析
* 1.new代表创建对象的动作
* 2.接口名称就是匿名内部类需要实现的哪个接口
* 3.{...}这才是匿名内部类的内容
*
* 注意事项：
* 1.匿名内部类，在【创建对象】进行使用时，只能使用唯一的一次
*             如果希望使用多次，而且类的内容一样的话，那么就必须使用单独定义的匿名内部类
* 2.匿名对象，在【调用方法】的时候，只能调用唯一的一次
*             如果希望使用同一个对象，调用多次方法，那么就必须给这个对象起个名字
* 3.匿名内部类是省略了【实现类/子类名称】，但是匿名内部类是省略了【对象名称】
* 强调：匿名内部类和匿名对象不是一回事！！！”*/
public class DemoMain_ {
    public static void main(String[] args) {
////        原来的方法：采用实现类实现接口
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();


//        现在的方法：采用匿名内部类实现接口
//
        MyInterface objA = new MyInterface() {
            @Override
            public MyInterface method1() {
                System.out.println("匿名内部类实现了接口--aaa");
                return null;
            }

            @Override
            public MyInterface method2() {
                System.out.println("匿名内部类实现了接口--aaa");
                return null;
            }
        }.method1();
//      因为匿名对象无法调用第二次方法，所以需要在创建一个匿名内部类的匿名对象
        MyInterface objB = new MyInterface() {
            @Override
            public MyInterface method1() {
                System.out.println("匿名内部类实现了接口--aaa");
                return null;
            }

            @Override
            public MyInterface method2() {
                System.out.println("匿名内部类实现了接口--bbb");
                return null;
            }
        }.method2();

//        这里是匿名对象的匿名内部类的格式，这个对象也是只能使用唯一的一次
        new MyInterface() {
            @Override
            public MyInterface method1() {
                System.out.println("匿名内部类实现了接口--aaa");
                return null;
            }

            @Override
            public MyInterface method2() {
                System.out.println("匿名内部类实现了接口--bbb");
                return null;
            }
        }.method2();
    }
}
