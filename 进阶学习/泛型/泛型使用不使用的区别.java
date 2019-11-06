package learn_2.泛型;


import java.util.ArrayList;
import java.util.Iterator;

public class 泛型使用不使用的区别 {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        /*创建集合对象，使用泛型
        * 好处：1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
        *      2.把运行期异常（代码运行之后会抛出的异常），提升到了编译期（写代码的时候会报错）
        * 弊端：泛型是什么类型，只能存储什么类型的数据*/
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
//        list.add(1); 这里会直接报错，因为这里的泛型只能存储string类型

//        使用迭代器遍历list
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s+"->"+s.length());
        }
    }

    private static void show01() {
        /*创建集合对象，不使用泛型
        * 好处：集合不使用泛型，默认的类型就是object类型，可以存储任意类型的数据
        * 弊端：不安全，会引发异常*/
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

//        使用迭代器遍历List集合
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

//        之后想要使用String特有的方法，length获取字符串的长度；不能使用多态Object obj = "abc";
//        需要向下转型，会抛出java.lang.ClassCastException类型转换异常，不能把Integer类型转换成字符串类型
            String s =(String) obj;
            System.out.println(s.length());
        }
    }
}
