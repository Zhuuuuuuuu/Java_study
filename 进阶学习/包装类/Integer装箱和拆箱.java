package learn_2.包装类;

/*
* 装箱： 把基本数据类型的数据，包装到包装类中（基本数据类型--》包装类）
*     构造方法：
*           Integer(int value) 构造一个新分配的Integer对象，它表示指定的value值
*           Integer(String  s) 构造一个新分配的Integer对象，它表示String参数所指示的int值
*           注意事项：传递的字符串，必须是基本类型的字符串，否则会抛出异常  “"100"√  "a" ×
*     静态方法：
*           static Integer valueOf(int i) 返回一个表示指定int值的Integer实例
*           static Integer valueOf(String s)返回保存制定的String的值的Integer对象
*
*拆箱： 在包装类中取出基本类型的数据（包装类--》基本类型的数据）
*     成员方法：
*           int  intValue()以int类型返回该Integer的值
*   ”*/

public class Integer装箱和拆箱 {
    public static void main(String[] args) {
        //装箱：把基本类型的数据，包装到包装类中
        //构造方法：
        Integer in1 = new Integer(1); //横线说明已经过时了
        System.out.println(in1);

        Integer in2 = new Integer("100");
        System.out.println(in2);

//        静态方法：
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        Integer in4 = Integer.valueOf("123");
        System.out.println(in4);

//        拆箱：把包装类中的取出基本类型的数据
        int i = in1.intValue();
        System.out.println(i);


    }
}
