package project019;

/*问题描述：
* 1.需要抽取一个共有方法，用来解决两个默认方法之间代码重复的问题
* 2.但是这个共有方法不能让实现类使用，应该是私有化的*/

/*解决方法：
* 1.普通私有方法: 解决多个默认方法之间代码重复的问题
* 格式：
* private 返回值类型 方法名称（参数列表）{
*   方法体
* }
* 2.静态私有方法：解决多个静态方法之间代码重复的问题
* 格式：
* private static 返回值类型 方法名称（参数列表）{
*   方法体
* }*/
public interface MyInterfacePrivateA {
    public default void methoddefault1(){
        System.out.println("默认方法1");
    }

    public default void methoddefault2(){
        System.out.println("默认方法2");
    }

    private void methodcommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
