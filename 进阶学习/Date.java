package learn_2.dateformat_;

/*
* java.util.date表示【日期】和【时间】的类
* 类 date表示特定的瞬间，精确到毫秒
* 毫秒：千分之一秒 1000毫秒 = 1秒
* 特定的瞬间：一个时间点，一刹那的时间
* （2088-08-08 09：55：33：333）
* 毫秒值的作用：可以对时间和日期进行计算
* 2099-01-03 到 2088 - 01 -01 中间一共经历了多少天
* 可以日期转换为毫秒进行计算，计算完毕，再把毫秒转换为日期
*
* 把日期转换为毫秒：
* 当前的日期 2088-01-01
* 时间原点（0毫秒）：1970年1月1日 00：00：00（英国格林威治时间）
* 就是计算当前日期到时间原点之间一共经历了多少毫秒
*
* 注意：中国属于东八区，会把时间增加8个小时
* 1970年1月1日 08：00：00
*
* 把毫秒转换成日期
* 1天 = 24*60*60 = 86400秒 = 86400*1000 = 86400000毫秒
* */
public class Date {
    public static void main(String[] args) {
        demo3(); //主方法仅仅用来调用方法
    }

//    getTime()方法，把日期转换成毫秒值，是一个long类型
    private static void demo3() {
        java.util.Date date = new java.util.Date();
        long time = date.getTime();
        System.out.println(time);
    }

    //    date[带参数]的构造方法
    private static void demo2() {
        java.util.Date date = new java.util.Date(0L);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970

        date = new java.util.Date(56456456546L);
        System.out.println(date);//Sat Oct 16 18:20:56 CST 1971
    }

//    date[不带参数]的构造方法
    private static void demo1() {
        java.util.Date date = new java.util.Date();
        System.out.println(date);//Fri Oct 18 15:01:15 CST 2019 返回当前时间
    }
}
