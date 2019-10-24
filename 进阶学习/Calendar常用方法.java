package learn_2.Calendar_;

import java.util.Calendar;

/*
* java.util.Calendar类：【日历类】
* Calendar类是一个【抽象类】，里边提供了很多操作日历字段的方法（year,month,day_of_month,hour）
* Calendar类无法直接创建对象使用，里边有一个【静态方法叫做getInstance()】,该方法返回了Calendar类的子类对象
* static Calendar getInstance()使用默认时区和语言环境获得一个【日历】*/

public class Calendar常用方法 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//多态的写法
        System.out.println(c);
    }
}

/* java.util.GregorianCalendar[time=1571822313429,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=29,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=296,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=18,SECOND=33,MILLISECOND=429,ZONE_OFFSET=28800000,DST_OFFSET=0] */