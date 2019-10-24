package learn_2.System_;

import java.util.Arrays;

/*
* java.lang.System类中提供了大量的【静态方法】，可以获取与系统相关的信息或系统的操作
* 在system类的API文档中，常用的方法有
*       public static long currentTimeMIllis():返回以毫秒为单位的当前时间
*       public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)：将数组中指定的数据拷贝到另一个数组中*/
public class System__ {
    public static void main(String[] args) {
        demo02();
    }

    private static void demo02() {
//        public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)：将数组中指定的数据拷贝到另一个数组中*/
//    定义【源数组】
        int[] src = {1,2,3,4,5};
//    定义【目标数组】
        int[] dest = {6,7,8,9,10};
        System.out.println("复制前”："+ Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+ Arrays.toString(dest));
    }

    private static void demo01() {
//        public static long currentTimeMIllis():返回以毫秒为单位的当前时间
//        可以拿来验证程序的效率

//        在程序执行之前，获取一次毫秒值
        long s = System.currentTimeMillis();
//        执行for循环
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
//        程序执行后，获取一次毫秒值
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时："+ (e-s) + "毫秒");
    }
}
