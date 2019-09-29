package learn.project002;
/*
* 方法其实就是若干语句的功能集合
* 参数：就是进入方法的数据（原料）
* 返回值：从方法中出来的数据 （生产物）
*
* 定义方法的完整格式
* 修饰符 返回值类型 方法名称（参数类型，参数名称）{
*   方法体
*   return 返回值
*   }
*
*
* 修饰符：public static
* 返回值类型：也就是产生的数据是什么类型
* 方法名称：方法的名字，小驼峰式
* 参数类型：进入方法的数据是什么类型
* 参数名称：进入方法的数据对应的变量名称
* PS:参数如果有多个，使用逗号进行分割
* return 两个作用：停止当前的方法，第二个将后面的返回值饭后调用处
* 返回值：最后产生的数据结果
*
* return后面的返回值。必须和方法名称的返回值类型对应 boolean-->boolean
*
* 调用的三种格式：
* 1.单独调用 方法名称（参数）
* 2.打印调用 sout(方法名称（参数）)
* 3.赋值调用 数据类型 变量名称 = 方法名称（参数）
* */
public class MethodDefine {
    public static void main(String[] args) {
       //单独调用
        sum(5,3);
        // 打印调用
        System.out.println(sum(5,3));
        //赋值调用
        int num = sum(15,25);
        System.out.println(num);
    }

    public static int sum(int a,int b){
        System.out.println("方法已执行");
        int result = a + b;
        return result;
    }
}
