package learn_2.Collection集合;

import java.util.ArrayList;
import java.util.Collection;

/*
*   java.util.Collection接口
*       所有单列集合的【最顶层】的接口，里边定义了所有单列集合共性的方法
*       任意的单列集合都可以使用Collection接口中的方法
*
*   共性的方法：
* */
public class Collection总结 {
    public static void main(String[] args) {
//        创建集合对象，可以使用[多态]
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//[] 这里重写了toString方法

//        add方法
        boolean b1 = coll.add("张三");
        System.out.println(b1);
        System.out.println(coll);
        coll.add("王五");
        coll.add("天六");
        coll.add("天启");

//        remove方法可以删除指定的元素
        boolean b2 = coll.remove("王五");
        System.out.println(b2);
        System.out.println(coll);

//        contains方法判断当前集合中是否包含指定的对象
        boolean b3 = coll.contains("张三");
        System.out.println(b3);
        System.out.println(coll);

//        isEmpty方法判断当前集合是否为空
        boolean b4 = coll.isEmpty();
        System.out.println(b4);

//        int size()方法返回当前集合元素的个数
        int size = coll.size();
        System.out.println(size);

//        Object[] toArray（）方法：把当前集合的元素，存储到数组当中
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        clear方法：清空集合中所有的元素，但并不是删除集合，集合还存在
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());
    }
}
