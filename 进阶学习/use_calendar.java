package learn_2.Calendar_;

import java.util.Calendar;

/*
* java.util.Calendar类：日历类
* Calendar类是一个抽象类，里边提供了很多操作日历字段的方法（year,month,day_of_month,hour）
* Calendar类无法直接创建对象使用，里边有一个景天方法叫做getInstance(),该方法返回了Calendar类的子类对象
* static Calendar getInstance()使用默认时区和语言环境获得一个日历*/

public class use_calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//多态的写法
        System.out.println(c);
    }
}
