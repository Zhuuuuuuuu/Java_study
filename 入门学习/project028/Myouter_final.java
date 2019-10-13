package learn.project028;

/*
* 局部内部类：如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】
*
* 原因：
* 1.new出来的对象在堆内存当中
* 2.[局部变量]是跟着方法走的，在[栈内存]当中
* 3.方法运行结束之后，[立刻出栈，局部变量会立刻消失]
* 4.但是new出来的对象会在[堆当中持续存在]，直到垃圾回收消失
* */
public class Myouter_final {

    public void method(){
        final  int num = 10;

        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
