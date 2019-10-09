package learn.project018;
/*
* 接口当中允许定义静态方法
* 格式：
* public static 返回值类型 方法名称（参数列表）{
*       方法体
* }
*
* 提示：就是把default 和 abstract换成static 即可*/
public interface MyinterfaceStatic {
    public static void StaticMethod(){
        System.out.println("这是一个静态方法");
    }
}
