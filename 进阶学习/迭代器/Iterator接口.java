package learn_2.Iterator迭代器;
/*
* java.util.Iterator接口：迭代器（对集合进行遍历）
* 有两个常用的方法：
*   1.boolean hasNext() ： 如果仍然有元素可以迭代，则返回true ， 判断结合中还有没有下一个元素，没有就返回false
*   2.E next() : 返回迭代的下一个元素 ， 取出集合的下一个元素
*
*
*   Iterator迭代器：是一个【接口】，我们无法直接使用，需要使用Iterator接口的【实现类对象】，获取实现类的方法比较特殊
*   Collection()接口中有一个方法，叫iterator()，这个方法返回的就是迭代器的【实现类对象】
*
*   迭代器的使用步骤（重点）
*   1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
*   2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
*   3.使用Iterator接口中的方法next取出集合中的下一个元素*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator接口 {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        //往集合中添加元素
        coll.add("姚明");
        coll.add("库里");
        coll.add("詹姆斯");
        coll.add("艾弗森");
        coll.add("麦迪");

//        1.使用集合当中的iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
//        Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
//        接口                     实现类对象
        Iterator<String> it = coll.iterator();

//        2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
//        方式一
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);

        }

//        方式二
//        boolean b = it.hasNext();
//        System.out.println(b);
//
//        String s = it.next();
//        System.out.println(s); //姚明
//
//        b = it.hasNext();
//        System.out.println(b);
//
//        s = it.next();
//        System.out.println(s);//库里
//
//        b = it.hasNext();
//        System.out.println(b);
//
//        s = it.next();
//        System.out.println(s);//詹姆斯
//
//        b = it.hasNext();
//        System.out.println(b);
//
//        s = it.next();
//        System.out.println(s);//艾佛森
//
//        b = it.hasNext();
//        System.out.println(b);
//
//        s = it.next();
//        System.out.println(s);//麦迪
//
//
//        b = it.hasNext();
//        System.out.println(b); //没有元素，返回false
//
//        s = it.next();
//        System.out.println(s); //没有元素，再取出元素会抛出java.util.NoSuchElementException错误

    }
}
