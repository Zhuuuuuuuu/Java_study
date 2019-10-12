package learn.project025;

/*
* 当final关键字用来修饰一个方法的时候
* 这个方法就是最终的方法，也就是不能被覆盖重写
* 格式：
* 修饰符 final 返回值类型 方法名称（参数列表）{
*   //方法体
* }
* */

//注意事项：
//对于类，方法来说，abstract关键字和final关键字不能同时使用，因为自相矛盾
//原因：abstract关键字是抽象方法，所在的类必须是抽象类，而抽象类必须要覆盖重写，final恰恰阻止了覆盖重写
public class Fu {
    public final void methond() {
        System.out.println("父类方法执行了");
    }
//        错误写法
//    public abstract final void method(){
//}
}
