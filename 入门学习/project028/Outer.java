package learn.project028;

/*
* 如果一个类是定义在一个方法内部的，那么这就是一个局部内部类
* “”"局部"：只有当前所属的方法才能使用它，出了这个方法外面就不能用了。
*
* 定义格式：
* 修饰符 class 外部类名称{
*       修饰符 返回值类型 方法名称（参数列表）{
*           class 局部类名称{
*                       //...}
*           //...}
* }
*
* 小结一下权限修饰符
* public > protected > (default) > private
* 外部类： public /(default)
* 成员内部类：public > protected > (default) > private
* 局部内部类：什么都不能写（这里的不能写也不是指（default））*/


public class Outer {
    public void methodOuter(){
        class Inner{
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }

}
