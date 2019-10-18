package learn_2.dateformat_;

/*
* java.text.Dateformat 是日期/时间格式化子类的【抽象类】
* 作用：
*   格式化（日期->文本）,解析（文本->日期）
*   成员方法 ：
*      1. String format(Date date)按照指定模式，把date中的日期，格式化为符合模式的字符串
*      2. Date parse(String source)把符合模式的字符串，解析为Date日期
*   Dateformat类是一个【抽象类】，无法直接创建对象使用，可以使用DateFormat类的子类
*
*   子类是：java.text.SimpleDateFormat extends DateFormat
*
*   构造方法：
*   SimpleDateFormat(String pattern)
*       用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
*       参数：String pattern:传递指定的模式
*       模式：区分大小写
*       例如"yyyy-MM-dd HH:mm:ss"
* */
public class date_format {
}
